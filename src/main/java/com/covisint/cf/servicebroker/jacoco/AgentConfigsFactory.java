package com.covisint.cf.servicebroker.jacoco;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * A factory class for creating credential 
 *
 * @version 1.0, 2015-10-09
 * @author Lingeshm
 *
 */


@Configuration
public class AgentConfigsFactory {
/**
 * 
 * @param configuration
 * 
 * @return configuration 
 */
    @Bean
    AgentConfig agentconfig(@Value("${configuration}") String configuration) {
        return new AgentConfig(configuration);
    }

}
