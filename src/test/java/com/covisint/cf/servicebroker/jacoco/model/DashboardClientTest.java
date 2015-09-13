package com.covisint.cf.servicebroker.jacoco.model;

import java.net.URI;
import java.util.Map;

import com.covisint.cf.servicebroker.jacoco.model.DashboardClient;

import static org.junit.Assert.assertEquals;

/**
 * Test class for DashboardClientTest.
 *
 * @version 1.0, 2015-10-09
 * @author Lingeshm
 *
 */
public final class DashboardClientTest extends AbstractSerializationTest<DashboardClient> {

    @Override
    protected void assertContents(Map m) {
        assertEquals("test-id", m.get("id"));
        assertEquals("test-secret", m.get("secret"));
        assertEquals("http://test.redirect.uri", m.get("redirect_uri"));
    }

    @Override
    protected DashboardClient getInstance() {
        return new DashboardClient(null)
                .id("test-id")
                .secret("test-secret")
                .redirectUri(URI.create("http://test.redirect.uri"));
    }

}
