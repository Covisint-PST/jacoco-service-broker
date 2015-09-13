package com.covisint.cf.servicebroker.jacoco.testsuites;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.covisint.cf.servicebroker.jacoco.model.BindingRequestTest;
import com.covisint.cf.servicebroker.jacoco.model.BindingResponseTest;
import com.covisint.cf.servicebroker.jacoco.model.CatalogTest;
import com.covisint.cf.servicebroker.jacoco.model.CostTest;
import com.covisint.cf.servicebroker.jacoco.model.CredentialsTest;
import com.covisint.cf.servicebroker.jacoco.model.DashboardClientTest;
import com.covisint.cf.servicebroker.jacoco.model.PlanMetadataTest;
import com.covisint.cf.servicebroker.jacoco.model.PlanTest;
import com.covisint.cf.servicebroker.jacoco.model.ProvisioningRequestTest;
import com.covisint.cf.servicebroker.jacoco.model.ProvisioningResponseTest;
import com.covisint.cf.servicebroker.jacoco.model.ServiceMetadataTest;
import com.covisint.cf.servicebroker.jacoco.model.ServiceTest;

/**
 * 
 * Suit class for JacocoJunitTestSuite purpose.
 *
 * @version 1.0, 2015-10-09
 * @author Lingeshm
 *
 */

@RunWith(Suite.class)
@Suite.SuiteClasses({
	CredentialsTest.class,
	BindingRequestTest.class,
	BindingResponseTest.class,
	CatalogTest.class,
	CostTest.class,
	DashboardClientTest.class,
	PlanMetadataTest.class,
	PlanTest.class,
	ServiceMetadataTest.class,
	ServiceTest.class,
	ProvisioningRequestTest.class,
	ProvisioningResponseTest.class
	
})
public class JacocoJunitTestSuite {   
}