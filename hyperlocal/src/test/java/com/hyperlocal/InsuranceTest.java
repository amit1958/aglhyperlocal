package com.hyperlocal;

import hyperlocalPages.InsuranceElements;

import org.testng.annotations.Test;

public class InsuranceTest extends origin {
	InsuranceElements insurance= new InsuranceElements();
	@Test(priority=1)
	public void insurancePageTest() throws InterruptedException  {
		insurance.insurancePage();
		System.out.println("Insurance page has been verified");
		}
	
}