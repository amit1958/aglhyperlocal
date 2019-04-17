package com.hyperlocal;

import hyperlocalPages.CarPageElements;
import hyperlocalPages.InsuranceElements;

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

public class InsuranceTest extends origin {
	InsuranceElements insurance= new InsuranceElements();
	@Test(priority=1)
	public void insurancePageTest() throws InterruptedException  {
		insurance.insurancePage();
		System.out.println("Insurance page has been verified");
		}
	
}