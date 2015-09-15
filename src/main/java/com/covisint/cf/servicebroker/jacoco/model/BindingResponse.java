package com.covisint.cf.servicebroker.jacoco.model;

import com.covisint.cf.servicebroker.jacoco.AgentConfig;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.net.URI;

/**
 * 
 * BindingResponse holding credentials , syslogDrainUrl. 
 *
 * @version 1.0, 2015-10-09
 * @author Lingeshm
 *
 */

  public final class BindingResponse {

    private final AgentConfig credentials;

    private final URI syslogDrainUrl;

    public BindingResponse(AgentConfig credentials, URI syslogDrainUrl) {
        this.credentials = credentials;
        this.syslogDrainUrl = syslogDrainUrl;
    }

    AgentConfig getCredentials() {
        return this.credentials;
    }

    @JsonProperty("syslog_drain_url")
    URI getSyslogDrainUrl() {
        return this.syslogDrainUrl;
    }

}
