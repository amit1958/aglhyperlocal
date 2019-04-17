package hyperlocalPages;

import hyperlocalUtils.Asserts;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.collections.Lists;

import com.hyperlocal.origin;

public class CareersElements extends origin {

	
	public void careersPage() throws InterruptedException  {
		String carpageurl= driver.getCurrentUrl();
		System.out.println("=====carpageurl is ====" + carpageurl);
		WebElement career= driver.findElement(By.xpath("/html/body/main/header/div[3]/div/div[1]/div/div[2]/ul/li[9]/a"));
		career.click();
		Thread.sleep(5000);
	
		driver.findElement(By.xpath("/html/body/main/section/div/div/div[2]/div[2]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("inpname")).sendKeys("CareersTest");
		driver.findElement(By.id("inpphone")).sendKeys("9800000000");
		driver.findElement(By.id("inpemail")).sendKeys("Careers@testing.com");
		driver.findElement(By.id("inptextarea")).sendKeys("gurgaon location");
		
		driver.findElement(By.id("disclaimer")).click();
		driver.findElement(By.id("btnsubmit")).click();
		Thread.sleep(7000);
		Asserts.thankYou();
		
		
	}
}