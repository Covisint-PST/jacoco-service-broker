package com.covisint.cf.servicebroker.jacoco.model;

import java.net.URI;
import java.util.Map;

import com.covisint.cf.servicebroker.jacoco.model.ServiceMetadata;

import static org.junit.Assert.assertEquals;

/**
 * 
 * Test class for ServiceMetadataTest.
 *
 * @version 1.0, 2015-10-09
 * @author Lingeshm
 *
 */

public final class ServiceMetadataTest extends AbstractSerializationTest<ServiceMetadata> {

    @Override
    protected void assertContents(Map m) {
        assertEquals("test-display-name", m.get("displayName"));
        assertEquals("http://test.image.url", m.get("imageUrl"));
        assertEquals("test-long-description", m.get("longDescription"));
        assertEquals("test-provider-display-name", m.get("providerDisplayName"));
        assertEquals("http://test.documentation.url", m.get("documentationUrl"));
        assertEquals("http://test.support.url", m.get("supportUrl"));
    }

    @Override
    protected ServiceMetadata getInstance() {
        return new ServiceMetadata(null)
                .displayName("test-display-name")
                .imageUrl(URI.create("http://test.image.url"))
                .longDescription("test-long-description")
                .providerDisplayName("test-provider-display-name")
                .documentationUrl(URI.create("http://test.documentation.url"))
                .supportUrl(URI.create("http://test.support.url"));
    }

}
