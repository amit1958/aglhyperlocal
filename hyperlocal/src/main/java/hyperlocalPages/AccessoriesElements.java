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

public class AccessoriesElements extends origin {

	
	public void accessoriesPage() throws InterruptedException  {
		//WebElement cars= driver.findElement(By.linkText("Cars"));
		WebElement accessories= driver.findElement(By.xpath("/html/body/main/header/div[3]/div/div[1]/div/div[2]/ul/li[5]/a"));
		accessories.click();
		String accessoriesurl= driver.getCurrentUrl();
		System.out.println("=====accessoriespageurl is ====" + accessoriesurl);		
		Thread.sleep(3000);
		Select carmodel= new Select(driver.findElement(By.id("brochure-drop")));
		carmodel.selectByVisibleText("WagonR");
		driver.findElement(By.id("inpname")).sendKeys("TestAccessoriesPage");
		driver.findElement(By.id("inpphone")).sendKeys("9800000000");
		driver.findElement(By.id("inpemail")).sendKeys("accessories@testing.com");
		driver.findElement(By.id("disclaimer")).click();
		driver.findElement(By.id("btnbrochure")).click();
		Thread.sleep(5000);
		
		}
	
	
}