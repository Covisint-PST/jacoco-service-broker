package com.covisint.cf.servicebroker.jacoco.model;

import java.io.IOException;
import java.net.URI;
import java.util.Map;

import com.covisint.cf.servicebroker.jacoco.model.ProvisioningResponse;

import static org.junit.Assert.assertEquals;

/**
 * 
 * Test class for ProvisioningResponse.
 *
 * @version 1.0, 2015-10-09
 * @author Lingeshm
 *
 */
public final class ProvisioningResponseTest extends AbstractSerializationTest<ProvisioningResponse> {

    @Override
    protected void assertContents(Map m) throws IOException {
        assertEquals("http://test.dashboard.url", m.get("dashboard_url"));
    }

    @Override
    protected ProvisioningResponse getInstance() {
        return new ProvisioningResponse(URI.create("http://test.dashboard.url"));
    }

}
