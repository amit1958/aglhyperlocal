package com.hyperlocal;

import hyperlocalPages.AccessoriesElements;

import org.testng.annotations.Test;

public class AccessoriesTest extends origin {
	AccessoriesElements accessories= new AccessoriesElements();
	@Test(priority=1)
	public void accessoriesPageTest() throws InterruptedException  {
		accessories.accessoriesPage();
		System.out.println("Car page has been verified");
		}
	
}