package com.hyperlocal;

import hyperlocalPages.AboutUsElements;

import org.testng.annotations.Test;

public class AboutUsTest extends origin {
	AboutUsElements aboutus= new AboutUsElements();
	@Test(priority=1)
	public void aboutUsTest() throws InterruptedException  {
		aboutus.AboutUs();
		System.out.println("AboutUs page has been verified");
		}
	
}