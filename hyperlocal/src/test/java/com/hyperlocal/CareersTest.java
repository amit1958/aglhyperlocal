package com.hyperlocal;

import hyperlocalPages.CarPageElements;
import hyperlocalPages.CareersElements;

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

public class CareersTest extends origin {
	CareersElements careers= new CareersElements();
	@Test(priority=1)
	public void careerPageTest() throws InterruptedException  {
		careers.careersPage();
		System.out.println("Career page has been verified");
	
	}
}