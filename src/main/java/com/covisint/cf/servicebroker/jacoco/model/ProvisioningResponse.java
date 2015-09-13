package com.covisint.cf.servicebroker.jacoco.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.net.URI;

/**
 * ProvisioningResponse class will be responsible having dashboard_url.
 *
 * @version 1.0, 2015-10-09
 * @author Lingeshm
 *
 */

public final class ProvisioningResponse {

    private final URI dashboardUrl;

    public ProvisioningResponse(URI dashboardUrl) {
        this.dashboardUrl = dashboardUrl;
    }

    @JsonProperty("dashboard_url")
    public URI getDashboardUrl() {
        return dashboardUrl;
    }

}

