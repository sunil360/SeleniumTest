package com.selectclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SeectClassDemo {
	
	@Test
	public void selectClassTest() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\sunilk\\workspace\\TestExample\\Drivers\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://accounts.google.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='IMH1vc lUHSR Hj2jlf']")).click();
		Thread.sleep(5000);
		WebElement createaccount=driver.findElement(By.xpath("//div[@id='SIGNUP']/div"));
		createaccount.click();
		
		Actions action= new Actions(driver);
		action.moveToElement(createaccount).doubleClick().perform();
		Thread.sleep(5000);
		
	    WebElement element=driver.findElement(By.xpath("//span[@id='BirthMonth']/div[2]"));
		Select select= new Select(element);
	    select.selectByVisibleText("January");
	    Thread.sleep(5000);
		
		//select.selectByValue("");
		//driver.quit();
			
		
	}

}
