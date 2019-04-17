package com.hyperlocal;

import hyperlocalPages.AccessoriesElements;
import hyperlocalPages.CarPageElements;

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

public class AccessoriesTest extends origin {
	AccessoriesElements accessories= new AccessoriesElements();
	@Test(priority=1)
	public void accessoriesPageTest() throws InterruptedException  {
		accessories.accessoriesPage();
		System.out.println("Car page has been verified");
		}
	
}