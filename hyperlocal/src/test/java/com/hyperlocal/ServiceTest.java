package com.hyperlocal;

import hyperlocalPages.ServiceElements;

import org.testng.annotations.Test;

public class ServiceTest extends origin {
	ServiceElements servicepage= new ServiceElements();
	@Test(priority=1)
	public void servicecPageTest() throws InterruptedException  {
		servicepage.servicePage();
		System.out.println("Car page has been verified");
		}
	
}