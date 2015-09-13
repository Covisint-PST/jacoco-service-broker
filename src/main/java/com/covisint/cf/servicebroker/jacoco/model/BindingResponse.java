package com.covisint.cf.servicebroker.jacoco.model;

import com.covisint.cf.servicebroker.jacoco.Credentials;
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

    private final Credentials credentials;

    private final URI syslogDrainUrl;

    public BindingResponse(Credentials credentials, URI syslogDrainUrl) {
        this.credentials = credentials;
        this.syslogDrainUrl = syslogDrainUrl;
    }

    Credentials getCredentials() {
        return this.credentials;
    }

    @JsonProperty("syslog_drain_url")
    URI getSyslogDrainUrl() {
        return this.syslogDrainUrl;
    }

}
