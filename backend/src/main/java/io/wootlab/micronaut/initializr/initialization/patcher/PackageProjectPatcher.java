package io.wootlab.micronaut.initializr.initialization.patcher;

import io.micronaut.core.util.StringUtils;
import io.wootlab.micronaut.initializr.initialization.model.InitializrException;
import io.wootlab.micronaut.initializr.initialization.model.MicronautProject;
import io.wootlab.micronaut.initializr.api.representation.ProjectSettingsRepresentation;
import lombok.extern.slf4j.Slf4j;
import org.codehaus.plexus.util.FileUtils;

import javax.inject.Singleton;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.concurrent.atomic.AtomicReference;

@Singleton
@Slf4j
class PackageProjectPatcher implements ProjectPatcher {

    @Override
    public void patchProject(MicronautProject project) throws InitializrException {
        project.setPackageName(formatArtifactToPackageName(project.getSettings()));
        AtomicReference pathToParent = new AtomicReference(project.getUniqueName() + File.separator + "src" + File.separator + "main" + File.separator + "java");
        File oldPackage = new File(pathToParent + File.separator + project.getUniqueName());

        for (String member : project.getPackageName().split("\\.")) {
            File current = new File(pathToParent + File.separator + member);

            if (!current.exists()) {
                try {
                    Files.createDirectory(current.toPath());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            pathToParent.set(pathToParent.get() + File.separator + member);
        }

        for(File f : oldPackage.listFiles()){
            try {
                String content = Files.readString(f.toPath());
                content = content.replaceAll("package " + project.getUniqueName(), "package " + project.getPackageName());
                Files.write(Path.of((String)pathToParent.get() + File.separator + f.getName()), content.getBytes( StandardCharsets.UTF_8));

            } catch (IOException e) {
                log.error("Error while patching pom.xml", e);
                throw new InitializrException(e.getMessage(), e.getClass().getSimpleName(), e.getCause());
            }
        }

        try {
            FileUtils.deleteDirectory(oldPackage);
        } catch (IOException e) {
            log.error("Error while patching pom.xml", e);
            throw new InitializrException(e.getMessage(), e.getClass().getSimpleName(), e.getCause());
        }
    }
    private String formatArtifactToPackageName(ProjectSettingsRepresentation settings) {
        if(StringUtils.isNotEmpty(settings.getPackageName())){
            return settings.getPackageName();
        }
        return settings.getArtifactId().replaceAll("-", "");
    }
}
