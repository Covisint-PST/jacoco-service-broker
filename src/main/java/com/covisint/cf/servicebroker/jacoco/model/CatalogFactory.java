package com.covisint.cf.servicebroker.jacoco.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.net.URI;
import java.util.UUID;

/**
 * CatalogFactory responsible for creating Catalog object which will give static 
 * information about jacoco . 
 *
 * @version 1.0, 2015-06-01
 * @author Lingeshm
 *
 */

@Configuration
public class CatalogFactory {

    @Bean
    Catalog catalog(@Value("${serviceBroker.serviceId}") String serviceId,
                    @Value("${serviceBroker.planId}") String planId) {
        // @formatter:off
        return new Catalog()
            .service()
                .id(UUID.fromString(serviceId))
                .name("jacoco")
                .description("Manage and code coverage your apps")
                .bindable(true)
                .tags("jacoco", "management", "coverage", "apm")
                .metadata()
                    .displayName("Jacoco")
                    .imageUrl(URI.create("http://www.eclemma.org/images/jacoco.png"))
                    .longDescription("JaCoCo is a free code coverage library for Java, "
                    		+ "which has been created by the EclEmma team based on the lessons learned "
                    		+ "from using and integration existing libraries for many years.")
                    .providerDisplayName("DYNATRACE LLC.")
                    .documentationUrl(URI.create("http://www.eclemma.org/jacoco/"))
                    .supportUrl(URI.create("http://www.eclemma.org/jacoco/"))
                    .and()
                .plan()
                    .id(UUID.fromString(planId))
                    .name("standard")
                    .description("Jacoco credentials")
                    .metadata()
                        .bullets("Code analyser", "Instrumentation",
                                 "Performance data API access")
                        .displayName("Standard")
                        .and()
                    .free(true)
                    .and()
                .and();
        // @formatter:on
    }

}
