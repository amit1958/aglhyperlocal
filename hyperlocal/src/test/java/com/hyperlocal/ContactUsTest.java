package com.hyperlocal;

import hyperlocalPages.CarPageElements;
import hyperlocalPages.ContactUsElements;

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

public class ContactUsTest extends origin {
	ContactUsElements contactus= new ContactUsElements();
	@Test(priority=1)
	public void contactUsPageTest() throws InterruptedException  {
		contactus.contactPage();
		System.out.println("Contact page has been verified");
		}
	

}