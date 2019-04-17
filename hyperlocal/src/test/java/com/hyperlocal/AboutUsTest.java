package com.hyperlocal;

import hyperlocalPages.AboutUsElements;
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

public class AboutUsTest extends origin {
	AboutUsElements aboutus= new AboutUsElements();
	@Test(priority=1)
	public void aboutUsTest() throws InterruptedException  {
		aboutus.AboutUs();
		System.out.println("AboutUs page has been verified");
		}
	
}