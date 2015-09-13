package com.covisint.cf.servicebroker.jacoco.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.io.IOException;
import java.util.Map;

/**
 * Test class for AbstractDeserialization.
 *
 * @version 1.0, 2015-10-09
 * @author Lingeshm
 *
 */
public abstract class AbstractDeserializationTest<T> {

    private final ObjectMapper objectMapper = new ObjectMapper();

    private final Class<T> type;

    
    protected AbstractDeserializationTest(Class<T> type) {
        this.type = type;
    }

    @Test
    public final void deSerialization() throws IOException {
        assertContents(roundTrip(getMap()));
    }

    protected final T roundTrip(Map m) throws IOException {
        String s = this.objectMapper.writeValueAsString(m);
        return this.objectMapper.readValue(s, this.type);
    }

    protected abstract void assertContents(T instance);

    protected abstract Map getMap();

}
