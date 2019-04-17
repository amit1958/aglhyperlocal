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

public class EBookNowElements extends origin {

	
	public void EbookNow() throws InterruptedException  {
		String aboutusurl= driver.getCurrentUrl();
		System.out.println("=====aboutusurl is ====" + aboutusurl);
		WebElement aboutus= driver.findElement(By.xpath("/html/body/main/header/div[3]/div/div[1]/div/div[2]/ul/li[11]/a"));
		aboutus.click();
		Thread.sleep(1000);
		List<String> browserTabs = new ArrayList<String> (driver.getWindowHandles());
		//switch to new tab
		driver.switchTo().window(browserTabs .get(1));
		Thread.sleep(5000);
		Asserts.EbookNowPageAssert();
		
		}

}