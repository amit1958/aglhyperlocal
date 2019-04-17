package com.hyperlocal;

import hyperlocalPages.AboutUsElements;
import hyperlocalPages.CarPageElements;
import hyperlocalPages.EBookNowElements;

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

public class EBookNowTest extends origin {
	EBookNowElements ebook= new EBookNowElements();
	@Test(priority=1)
	public void ebookTest() throws InterruptedException  {
		ebook.EbookNow();
		System.out.println("Ebook page has been verified");
		}
	
}