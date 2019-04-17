package com.hyperlocal;

import hyperlocalPages.DrivingSchoolElements;

import org.testng.annotations.Test;

public class DrivingSchoolTest extends origin {
	DrivingSchoolElements drivingschool= new DrivingSchoolElements();
	@Test(priority=1)
	public void drivingschoolPageTest() throws InterruptedException  {
		drivingschool.drivingSchoolPage();
		System.out.println("Driving School page has been verified");
		}
	
}