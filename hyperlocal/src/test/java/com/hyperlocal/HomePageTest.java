package com.hyperlocal;

import hyperlocalPages.HomePageElements;

import org.testng.annotations.Test;

public class HomePageTest extends origin {
	HomePageElements homepage1= new HomePageElements();
	@Test
	public void homePageTest()  {
		homepage1.homePage();
		System.out.println("Home page has been verified");
		}
	
	public void bookTestDriverTest(){
		homepage1.bookATestDriver();
		System.out.println("Book a Test Driver has been verified");
	}
	
	public void scheduleServiceTest(){
		homepage1.scheduleService();
		System.out.println("Schedule a Service has been verified");
	}
}