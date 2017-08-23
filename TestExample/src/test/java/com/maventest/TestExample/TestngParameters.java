package com.maventest.TestExample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestngParameters {

	private static WebDriver driver;

	  @Test 

	  @Parameters({ "sUsername", "sPassword" })

	  public void test(String sUsername, String sPassword) {
		 System.setProperty("webdriver.gecko.driver", "C:\\Users\\sunilk\\workspace\\TestExample\\Drivers\\geckodriver.exe");
		 driver = new FirefoxDriver();

	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	      driver.get("http://toolsqa.com/contacts-us/");

	      driver.findElement(By.xpath("html/body/div[1]/div[5]/div[2]/div/div/div[1]/div[2]/div/div/form/div/span[1]/input")).sendKeys(sUsername);
	      driver.findElement(By.xpath("html/body/div[1]/div[5]/div[2]/div/div/div[1]/div[2]/div/div/form/div/span[2]/input")).sendKeys(sPassword);
	      driver.findElement(By.xpath("html/body/div[1]/div[5]/div[2]/div/div/div[1]/div[2]/div/div/form/p/a[1]")).click();   
	      System.out.println("Error message should be appeared");
	      
	      

	      //driver.quit();

	  }

	}