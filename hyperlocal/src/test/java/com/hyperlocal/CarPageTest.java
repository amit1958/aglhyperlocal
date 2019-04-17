package com.hyperlocal;

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

public class CarPageTest extends origin {
	CarPageElements carpage1= new CarPageElements();
	@Test(priority=1)
	public void carPageTest() throws InterruptedException  {
		carpage1.carPage();
		System.out.println("Car page has been verified");
		}
	@Test(priority=2)
	public void carGetaquoteTest() throws InterruptedException{
		carpage1.carGetaQuote();
		System.out.println("Get a Quote verified");
	}
	@Test(priority=3)
	public void bookaTestDriveTest() throws InterruptedException{
		carpage1.bookATestDrive();
		System.out.println("Book a Test Drive has been verified");
	}
	@Test(priority=4)
	public void navigatetoEMICalculatorTest() throws InterruptedException{
		carpage1.navigatetoEMICalculator();
		System.out.println("Navigate to Finance page has been verified");
	}
}