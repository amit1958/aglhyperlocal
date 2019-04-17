package com.hyperlocal;

import hyperlocalPages.FinanceElements;

import org.testng.annotations.Test;

public class FinanceTest extends origin {
	FinanceElements finance= new FinanceElements();
	@Test(priority=1)
	public void financePageTest() throws InterruptedException  {
		finance.financePage();
		finance.calculateEMI();
		System.out.println("Finance page has been verified");
		}

}