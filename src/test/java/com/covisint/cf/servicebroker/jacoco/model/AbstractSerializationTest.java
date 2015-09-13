package com.covisint.cf.servicebroker.jacoco.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;

/**
 * 
 * Test class for AbstractSerialization.
 *
 * @version 1.0, 2015-10-09
 * @author Lingeshm
 *
 */
public abstract class AbstractSerializationTest<T> {

    private final ObjectMapper objectMapper = new ObjectMapper()
            .setVisibility(PropertyAccessor.GETTER, Visibility.ANY)
            .setSerializationInclusion(JsonInclude.Include.NON_NULL);

    @Test
    public final void serialization() throws IOException {
        assertContents((Map) roundTrip(getInstance()));
    }

    protected final Object roundTrip(Object o) throws IOException {
        String s = this.objectMapper.writeValueAsString(o);

        if (o instanceof List) {
            return this.objectMapper.readValue(s, List.class);
        } else {
            return this.objectMapper.readValue(s, Map.class);
        }
    }

    protected abstract void assertContents(Map m) throws IOException;

    protected abstract T getInstance();

}
