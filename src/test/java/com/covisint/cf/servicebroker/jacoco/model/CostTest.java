package com.covisint.cf.servicebroker.jacoco.model;

import java.util.HashMap;
import java.util.Map;

import com.covisint.cf.servicebroker.jacoco.model.Cost;

import static org.junit.Assert.assertEquals;

/**
 * 
 * Test class for CostTest.
 *
 * @version 1.0, 2015-10-09
 * @author Lingeshm
 *
 */
public final class CostTest extends AbstractSerializationTest<Cost> {

    @Override
    protected void assertContents(Map m) {
        assertEquals(getAmount(), m.get("amount"));
        assertEquals(m.get("unit"), "TEST-UNIT");
    }

    @Override
    protected Cost getInstance() {
        return new Cost(null)
                .amount("currency-1", 1.0)
                .amount("currency-2", 2.0)
                .unit("TEST-UNIT");
    }

    private Map<String, Double> getAmount() {
        Map<String, Double> amount = new HashMap<>();
        amount.put("currency-1", 1.0);
        amount.put("currency-2", 2.0);

        return amount;
    }

}
