package com.hyperlocal;

import hyperlocalPages.HomePageElements;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.collections.Lists;

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