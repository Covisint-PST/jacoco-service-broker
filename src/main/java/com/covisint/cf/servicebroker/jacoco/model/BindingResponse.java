package com.covisint.cf.servicebroker.jacoco.model;

import com.covisint.cf.servicebroker.jacoco.AgentConfig;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.net.URI;

/**
 * 
 * BindingResponse holding agentconfig , syslogDrainUrl. 
 *
 * @version 1.0, 2015-10-09
 * @author Lingeshm
 *
 */

  public final class BindingResponse {

    private final AgentConfig agentconfig;

    private final URI syslogDrainUrl;

    public BindingResponse(AgentConfig agentconfig, URI syslogDrainUrl) {
        this.agentconfig = agentconfig;
        this.syslogDrainUrl = syslogDrainUrl;
    }

    AgentConfig getAgentconfig() {
        return this.agentconfig;
    }

    @JsonProperty("syslog_drain_url")
    URI getSyslogDrainUrl() {
        return this.syslogDrainUrl;
    }

}
