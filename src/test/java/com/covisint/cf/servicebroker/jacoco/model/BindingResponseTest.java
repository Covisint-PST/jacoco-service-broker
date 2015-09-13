package com.covisint.cf.servicebroker.jacoco.model;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.net.URI;
import java.util.Map;

import com.covisint.cf.servicebroker.jacoco.Credentials;
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
        assertEquals(roundTrip(getCredentials()), m.get("credentials"));
        assertEquals("http://test.syslog.drain.url", m.get("syslog_drain_url"));
    }

    @Override
    protected BindingResponse getInstance() {
        return new BindingResponse(getCredentials(), URI.create("http://test.syslog.drain.url"));
    }

    private Credentials getCredentials() {
        return new Credentials("destfile=/home/vcap/jacoco.exec,append=true,includes=*");
    }

}
