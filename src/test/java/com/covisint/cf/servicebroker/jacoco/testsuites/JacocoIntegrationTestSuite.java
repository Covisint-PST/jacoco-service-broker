package com.covisint.cf.servicebroker.jacoco.testsuites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.covisint.cf.servicebroker.jacoco.controller.BindingControllerTest;
import com.covisint.cf.servicebroker.jacoco.controller.CatalogControllerTest;
import com.covisint.cf.servicebroker.jacoco.controller.ProvisioningControllerTest;

/**
 * 
 * Suit class for JacocoIntegrationTest purpose.
 *
 * @version 1.0, 2015-10-09
 * @author Lingeshm
 *
 */

@RunWith(Suite.class)
@Suite.SuiteClasses({
	BindingControllerTest.class,
	CatalogControllerTest.class,
	ProvisioningControllerTest.class,
})
public class JacocoIntegrationTestSuite {   
}