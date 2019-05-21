package com.hyperlocal;

import hyperlocalPages.CarPageElements;

import org.testng.annotations.Test;

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
	@Test(priority=5)
	public void carPriceCheckup() throws InterruptedException{
		carpage1.carPriceValidation();
		System.out.println("Navigate to Car page has been verified");
	}
}