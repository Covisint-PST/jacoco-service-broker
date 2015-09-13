package com.covisint.cf.servicebroker.jacoco.model;

import java.io.IOException;
import java.util.Map;

import com.covisint.cf.servicebroker.jacoco.Credentials;

import static org.junit.Assert.assertEquals;

/**
 * 
 * Test class for Credentials.
 *
 * @version 1.0, 2015-10-09
 * @author Lingeshm
 *
 */

public final class CredentialsTest extends AbstractSerializationTest<Credentials> {

    @Override
    protected void assertContents(Map m) throws IOException {
        assertEquals("destfile=/home/vcap/jacoco.exec,append=true,includes=*", m.get("configuration"));
        
    }

    @Override
    protected Credentials getInstance() {
        return new Credentials("destfile=/home/vcap/jacoco.exec,append=true,includes=*");
    }

}
