package com.hyperlocal;

import hyperlocalPages.CareersElements;

import org.testng.annotations.Test;

public class CareersTest extends origin {
	CareersElements careers= new CareersElements();
	@Test(priority=1)
	public void careerPageTest() throws InterruptedException  {
		careers.careersPage();
		System.out.println("Career page has been verified");
	
	}
}