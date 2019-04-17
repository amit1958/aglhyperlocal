package com.hyperlocal;

import hyperlocalPages.CarPageElements;
import hyperlocalPages.DrivingSchoolElements;

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

public class DrivingSchoolTest extends origin {
	DrivingSchoolElements drivingschool= new DrivingSchoolElements();
	@Test(priority=1)
	public void drivingschoolPageTest() throws InterruptedException  {
		drivingschool.drivingSchoolPage();
		System.out.println("Driving School page has been verified");
		}
	
}