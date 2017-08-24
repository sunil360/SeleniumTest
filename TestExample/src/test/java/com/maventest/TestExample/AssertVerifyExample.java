package com.maventest.TestExample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class AssertVerifyExample {
	WebDriver driver;
		
  @Test
  public void f()
  {
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\sunilk\\workspace\\TestExample\\Drivers\\geckodriver.exe");
  
	driver= new FirefoxDriver();
	//driver.manage().window().maximize();
	driver.navigate().to("http://www.uftHelp.com");
	Assert.assertEquals("User-Friendly Techy-Helps", driver.getTitle());
	System.out.println(driver.getTitle());
		
	System.out.println("Browser Navigated to **http://www.uftHelp.com**");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//div[@class='readmore']/a[@href='http://www.ufthelp.com/2017/08/how-to-install-ie-browser-on-mac-os.html']")).click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}
}
