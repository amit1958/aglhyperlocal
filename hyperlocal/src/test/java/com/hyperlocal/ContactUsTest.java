package com.hyperlocal;

import hyperlocalPages.ContactUsElements;

import org.testng.annotations.Test;

public class ContactUsTest extends origin {
	ContactUsElements contactus= new ContactUsElements();
	@Test(priority=1)
	public void contactUsPageTest() throws InterruptedException  {
		contactus.contactPage();
		System.out.println("Contact page has been verified");
		}
	

}