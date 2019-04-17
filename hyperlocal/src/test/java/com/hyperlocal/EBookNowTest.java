package com.hyperlocal;

import hyperlocalPages.EBookNowElements;

import org.testng.annotations.Test;

public class EBookNowTest extends origin {
	EBookNowElements ebook= new EBookNowElements();
	@Test(priority=1)
	public void ebookTest() throws InterruptedException  {
		ebook.EbookNow();
		System.out.println("Ebook page has been verified");
		}
	
}