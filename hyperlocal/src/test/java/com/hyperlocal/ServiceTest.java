package com.hyperlocal;

import hyperlocalPages.CarPageElements;
import hyperlocalPages.ServiceElements;

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

public class ServiceTest extends origin {
	ServiceElements servicepage= new ServiceElements();
	@Test(priority=1)
	public void carPageTest() throws InterruptedException  {
		servicepage.servicePage();
		System.out.println("Car page has been verified");
		}
	
}