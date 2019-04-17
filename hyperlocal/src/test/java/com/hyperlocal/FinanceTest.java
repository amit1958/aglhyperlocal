package com.hyperlocal;

import hyperlocalPages.CarPageElements;
import hyperlocalPages.FinanceElements;

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

public class FinanceTest extends origin {
	FinanceElements finance= new FinanceElements();
	@Test(priority=1)
	public void financePageTest() throws InterruptedException  {
		finance.financePage();
		finance.calculateEMI();
		System.out.println("Finance page has been verified");
		}

}