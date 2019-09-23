package hyperlocalPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.hyperlocal.origin;

public class AccessoriesElements extends origin {

	
	public void accessoriesPage() throws InterruptedException  {
		//WebElement cars= driver.findElement(By.linkText("Cars"));
		WebElement accessories= driver.findElement(By.xpath("//a[contains(text(),'Accessories')]"));
		accessories.click();
		String accessoriesurl= driver.getCurrentUrl();
		System.out.println("=====accessoriespageurl is ====" + accessoriesurl);		
		Thread.sleep(5000);
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