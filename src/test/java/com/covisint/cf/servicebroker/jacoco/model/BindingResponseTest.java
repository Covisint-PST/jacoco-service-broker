package com.covisint.cf.servicebroker.jacoco.model;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.net.URI;
import java.util.Map;

import com.covisint.cf.servicebroker.jacoco.AgentConfig;
import com.covisint.cf.servicebroker.jacoco.model.BindingResponse;
/**
 * Test class for BindingResponse.
 *
 * @version 1.0, 2015-10-09
 * @author Lingeshm
 *
 */
public final class BindingResponseTest extends AbstractSerializationTest<BindingResponse> {

    @Override
    protected void assertContents(Map m) throws IOException {
        assertEquals(roundTrip(getAgentconfig()), m.get("agentconfig"));
        assertEquals("http://test.syslog.drain.url", m.get("syslog_drain_url"));
    }

    @Override
    protected BindingResponse getInstance() {
        return new BindingResponse(getAgentconfig(), URI.create("http://test.syslog.drain.url"));
    }

    private AgentConfig getAgentconfig() {
        return new AgentConfig("output=tcpclient,address=localhost,port=6300,includes=*");
    }

}
