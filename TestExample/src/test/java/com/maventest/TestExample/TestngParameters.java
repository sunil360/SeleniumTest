package com.maventest.TestExample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;



public class TestngParameters {

	private static WebDriver driver;

	  @Test 

	 // @Parameters({ "sUsername", "sPassword" })

	  public void test() {
		 System.setProperty("webdriver.gecko.driver", "C:\\Users\\sunilk\\workspace\\TestExample\\Drivers\\geckodriver.exe");
		 driver = new FirefoxDriver();

	     // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	      driver.get("https://accounts.google.com");
	     // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     	      
	     WebElement element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[2]/form/div[2]/div/div[1]/div[1]/div/div[1]/div/div[1]/input"));
	      element.sendKeys("Sunil");
	      Actions builder = new Actions(driver); 
	      Action act = builder.moveToElement(element)
	                          .keyDown(element,Keys.SHIFT)
	                          .sendKeys("Sandeep")
	                          .keyUp(Keys.SHIFT)
	                          .build();
	      act.perform();
	      
	  /*  WebElement element=driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[2]/form/div[2]/div/div[1]/div[1]/div/div[1]/div/div[1]/input"));
	    Actions builder= new Actions(driver);
	    Action act=builder.moveToElement(element).sendKeys("Sunil").build();
	    act.perform();*/
	      
	      
	      
	      

	      //driver.quit();

	  }

	}