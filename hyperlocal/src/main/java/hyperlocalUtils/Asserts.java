package hyperlocalUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.hyperlocal.origin;

public class Asserts extends origin{

	public static void homePageAssert(){
		WebElement expected= driver.findElement(By.xpath("//h2[text()='Car Range']"));
		String expectedas= expected.getText();
		String actual= "CAR RANGE";
		try {
			Assert.assertEquals(expectedas, actual);;
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	 public static void thankYou(){
		 String pagetitle= driver.getTitle();
			String expectedtitle= "Thank You";
			try {
				Assert.assertEquals(pagetitle, expectedtitle);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		 
	 public static void carPageAssert(){
		 String carpageurl= driver.getCurrentUrl();
			String expectedurl= (pr.getProperty("url")+"/cars/alto-k10");
			try {
				Assert.assertEquals(carpageurl, expectedurl);
			} catch (Exception e) {
				System.out.println(e);
			}
	 }
	public static void navigateFinancepage() {
		WebElement expected= driver.findElement(By.xpath("//h2[text()='Finance']"));
		String expectedas= expected.getText();
		String actual= "FINANCE";
		try {
			Assert.assertEquals(expectedas, actual);;
		} catch (Exception e) {
			System.out.println(e);
		}
	}
		public static void AboutUsPageAssert(){
			WebElement aboutexpected= driver.findElement(By.xpath("//h2[text()='About Us']"));
			String expectedas= aboutexpected.getText();
			String actual= "ABOUT US";
			try {
				Assert.assertEquals(expectedas, actual);;
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		public static void financePageAssert(){
			WebElement aboutexpected= driver.findElement(By.xpath("//h2[text()='Finance']"));
			String expectedas= aboutexpected.getText();
			String actual= "FINANCE";
			try {
				Assert.assertEquals(expectedas, actual);;
			} catch (Exception e) {
				System.out.println(e);
			}
			WebElement financeexpected= driver.findElement(By.xpath("//*[@id='carPrice']"));
			String expectedas1= financeexpected.getText();
			String actual1= expectedas1;
			try {
				Assert.assertEquals(expectedas1, actual1);;
			} catch (Exception e) {
				System.out.println(e);
				
			}
		}
			public static void financecalculateEMI(){
				WebElement emiexpected= driver.findElement(By.id("emiamount"));
				//String expectedas= aboutexpected.getText();
				String actual= "emiamount";
				try {
					Assert.assertEquals(emiexpected, actual);;
				} catch (Exception e) {
					System.out.println(e);
				}
			}
				
			public static void contactPageAssert(){
				WebElement aboutexpected= driver.findElement(By.xpath("//h2[text()='Contact Us']"));
				String expectedas= aboutexpected.getText();
				String actualContact= "CONTACT US";
				try {
					Assert.assertEquals(expectedas, actualContact);;
				} catch (Exception e) {
					System.out.println(e);
				}
			}
			public static void EbookNowPageAssert(){
				String ebookexpected= driver.getCurrentUrl();
				String actualContact= "https://www.marutisuzuki.com/channels/arena/service/ebook-car";
				try {
					Assert.assertEquals(actualContact, ebookexpected);;
				} catch (Exception e) {
					System.out.println(e);
				}
			}
			
			
		}
		
		
	
	 

