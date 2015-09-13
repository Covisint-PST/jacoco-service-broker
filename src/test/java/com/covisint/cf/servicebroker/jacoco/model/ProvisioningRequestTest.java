package com.covisint.cf.servicebroker.jacoco.model;

import java.util.HashMap;
import java.util.Map;

import com.covisint.cf.servicebroker.jacoco.model.ProvisioningRequest;

import static org.junit.Assert.assertEquals;

/**
 * 
 * Test class for ProvisioningRequest.
 *
 * @version 1.0, 2015-10-09
 * @author Lingeshm
 *
 */
public final class ProvisioningRequestTest extends AbstractDeserializationTest<ProvisioningRequest> {

    public ProvisioningRequestTest() {
        super(ProvisioningRequest.class);
    }

    @Override
    protected void assertContents(ProvisioningRequest instance) {
        assertEquals("test-service-id", instance.getServiceId());
        assertEquals("test-plan-id", instance.getPlanId());
        assertEquals("test-organization-guid", instance.getOrganizationGuid());
        assertEquals("test-space-guid", instance.getSpaceGuid());
    }

    @Override
    protected Map getMap() {
        Map<String, String> m = new HashMap<>();
        m.put("service_id", "test-service-id");
        m.put("plan_id", "test-plan-id");
        m.put("organization_guid", "test-organization-guid");
        m.put("space_guid", "test-space-guid");

        return m;
    }

}
