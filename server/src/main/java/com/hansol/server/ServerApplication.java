package com.hansol.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.PropertySource;
import org.springframework.hateoas.config.EnableHypermediaSupport;

@SpringBootApplication
@EnableHypermediaSupport(type = EnableHypermediaSupport.HypermediaType.HAL)
public class ServerApplication {
    public static final String PropertyPath = "spring.config.location="
            +"classpath:application.yml,"
            +"optional:classpath:database.yml";
    public static void main(String[] args) {
        new SpringApplicationBuilder(ServerApplication.class)
                .properties(PropertyPath)
                .run(args);
    }
}
