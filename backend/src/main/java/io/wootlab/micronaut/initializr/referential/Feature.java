package io.wootlab.micronaut.initializr.referential;

import io.wootlab.micronaut.initializr.api.representation.FeatureRepresentation;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Feature {
    security_session("security-session", "Secure your Micronaut app using Session based authentication"),
    picocli("picocli", "Integrate your Micronaut app with picocli"),
    spock("spock", "Integration with Spock, a testing and specification framework."),
    micrometer_ganglia("micrometer-ganglia", "Integrate micrometer Ganglia with your Micronaut app"),
    rabbitmq("rabbitmq", "Integration with RabbitMQ, an open-source message-broker software"),
    hibernate_gorm("hibernate-gorm", "Integration with hibernate gorm, a powerful groovy based data access toolkit"),
    graphql("graphql", "Integration with GraphQL, a query language for API"),
    hibernate_jpa("hibernate-jpa", "Integration with Hibernate JPA"),
    jib("jib", "Integration with Jib, a plugin to build Docker and OCI Images"),
    springloaded("springloaded", "Integration with springloaded, a java agent to enable class reloading"),
    jrebel("jrebel", "Integration with JRebel, a java IDE."),
    mongo_gorm("mongo-gorm", "Integration with mongo gorm, a powerful groovy based data access for mongodb"),
    micrometer_elastic("micrometer-elastic", "Integration with micrometer for elastic search."),
    micrometer_kairos("micrometer-kairos", "Integration with micrometer for kairos"),
    asciidoctor("asciidoctor", "Integration with asciidoctor, a fast and open source text processor and public"),
    micrometer_atlas("micrometer-atlas", "Integration with micrometer for atlas"),
    kafka("kafka", "Integration with kafka, an open source distributed streaming platform"),
    aws_api_gateway_graal("aws-api-gateway-graal", "Integration with GraalVM native image building and deployment to AWS"),
    aws_api_gateway("aws-api-gateway", "Integration with AWS API Gateway, a fully managed service to manage APIs"),
    micrometer_appoptics("micrometer-appoptics", "Integration with micrometer for appoptics"),
    mongo_reactive("mongo-reactive", "Integration for reactive mongo"),
    micrometer_new_relic("micrometer-new-relic", "Integration with micrometer for new-relic"),
    annotation_api("annotation-api", "Integration with annotation-api, an alternative to Java's annotation"),
    micrometer_prometheus("micrometer-prometheus", "Integration with micrometer for prometheus"),
    micrometer_jmx("micrometer-jmx", "Integration with micrometer for jmx"),
    postgres_reactive("postgres-reactive", "Integration for reactive postgres"),
    micrometer_datadog("micrometer-datadog", "Integration with micrometer for datadog"),
    netflix_ribbon("netflix-ribbon", "Integration with Netflix ribbon, an Inter process communication library"),
    application("application", ""),
    cassandra("cassandra", "Integration with cassandra, a nosql database"),
    netflix_hystrix("netflix-hystrix", "Integration with netflix hystrix, a library to isolate points of access to remote systems"),
    micrometer_cloudwatch("micrometer-cloudwatch", "Integration with micrometer for cloudwatch."),
    file_watch("file-watch", ""),
    redis_lettuce("redis-lettuce", "Integration with redis, an open source in memory stored database"),
    config_consul("config-consul", "Integration with consul config, a centralized configuration system"),
    jdbc_hikari("jdbc-hikari", "Integration with hikari, a jdbc driver"),
    jdbc_dbcp("jdbc-dbcp", "Integration with dbcp, a jsbc driver"),
    micrometer_azure_monitor("micrometer-azure-monitor", "Integration with micrometer for azure monitor"),
    netflix_archaius("netflix-archaius", "Integration with archaius, a library for configuration management API"),
    elasticsearch("elasticsearch", "Integration with elasticsearch, a search engine based on the lucene library"),
    micrometer_humio("micrometer-humio", "Integration for micrometer with humio"),
    micrometer_statsd("micrometer-statsd", "Integration for micrometer with statsd"),
    tracing_jaeger("tracing-jaeger", "Integration with Jaeger, an open source end-to-end distributed tracing"),
    micrometer_influx("micrometer-influx", "Integration for micrometer with influx"),
    logback("logback", "Integration with logback, a logging framework"),
    micrometer_graphite("micrometer-graphite", "Integration for micrometer with graphite"),
    kafka_streams("kafka-streams", "Integration with kafka stream, the stream library for apache Kafka"),
    neo4j_bolt("neo4j-bolt", "Integration with neo4j bolt, a driver for neo4j"),
    swagger_groovy("swagger-groovy", "Integration with swagger for groovy, an open source framework to generate open api specification easily"),
    junit("junit", "Integration with junit, a framework to write repeatable tests"),
    graal_native_image("graal-native-image", "Integration with graal vm native image"),
    micrometer_wavefront("micrometer-wavefront", "Integration for micrometer with wavefront"),
    swagger_java("swagger-java", "Integration with swagger for java, an open source framework to generate open api specification easily"),
    micrometer_signalfx("micrometer-signalfx", "Integration with micrometer for signalfx"),
    tracing_zipkin("tracing-zipkin", "Integration with zipkin, a distributed tracing system"),
    discovery_eureka("discovery-eureka", "Integration with netflix eureka, a registry server"),
    discovery_consul("discovery_consul", ""),
    jdbc_tomcat("jdbc-tomcat", "Integration with tomcat"),
    liquibase("liquibase", "Integration with liquidbase, an open source database library for tracking, management and database schema changes"),
    micrometer("micrometer", "Integration with micrometer"),
    security_jwt("security-jwt", "Integration with json web token security"),
    http_server("http-server", "Integration with http server, a web server"),
    flyway("flyway", "Integration with flyway, a tool to apply version control practice to the database"),
    micrometer_stackdriver("micrometer-stackdriver", "Integration for micrometer with stackdriver"),
    management("management", ""),
    spek("spek", "Integration with spek, a kotlin specification framework"),
    kubernetes("kubernetes", "Integration with kubernetes"),
    swagger_kotlin("swagger-kotlin", "Integration with swagger for kotlin, an open source framework to generate open api specification easily"),
    kotlintest("kotlintest", ""),
    http_client("http-client", "Integration with http server, a web client"),
    micrometer_dynatrace("micrometer-dynatrace", "Integration with micrometer for dynatrace"),
    neo4j_gorm("neo4j-gorm", "Integration with neo4j gorm, a driver for neo4j");

    private String value;
    private String description;

    public FeatureRepresentation toFeatureRepresentation(){
        return new FeatureRepresentation(value, description);
    }
}
