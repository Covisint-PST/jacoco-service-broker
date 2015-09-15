package com.covisint.cf.servicebroker.jacoco.model;

import java.io.IOException;
import java.util.Map;

import com.covisint.cf.servicebroker.jacoco.AgentConfig;

import static org.junit.Assert.assertEquals;

/**
 * 
 * Test class for Credentials.
 *
 * @version 1.0, 2015-10-09
 * @author Lingeshm
 *
 */

public final class AgentConfigTest extends AbstractSerializationTest<AgentConfig> {

    @Override
    protected void assertContents(Map m) throws IOException {
        assertEquals("output=tcpclient,address=localhost,port=6300,includes=*", m.get("configuration"));
        
    }

    @Override
    protected AgentConfig getInstance() {
        return new AgentConfig("output=tcpclient,address=localhost,port=6300,includes=*");
    }

}
