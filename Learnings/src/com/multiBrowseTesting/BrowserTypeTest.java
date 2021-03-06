package com.multiBrowseTesting;

import java.io.File;
import java.util.Date;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;




public class BrowserTypeTest {
	@Test
	public void setUp() {		
				
		WebDriver driver=null;
		String driverType = "chrome";		
		
		System.out.println("Browser is:" +driverType);
							
		if (driverType.toLowerCase()=="firefox") {		
			 System.setProperty("webdriver.gecko.driver","C:\\Users\\sunilk\\workspace\\PHPTravels\\src\\test\\resources\\webdriver\\geckodriver.exe");
				driver = new FirefoxDriver();				
			
		} 
		else if (driverType.toLowerCase()=="ie") {
			System.setProperty("webdriver.ie.driver","C:\\Users\\sunilk\\workspace\\PHPTravels\\src\\test\\resources\\webdriver\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			
		} 
		else if (driverType.toLowerCase()=="chrome") {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\sunilk\\workspace\\PHPTravels\\src\\test\\resources\\webdriver\\chromedriver.exe");
			driver = new ChromeDriver();
			
		} else {
			System.setProperty("webdriver.gecko.driver","C:\\Users\\sunilk\\workspace\\PHPTravels\\src\\test\\resources\\webdriver\\geckodriver.exe");
			driver = new FirefoxDriver();			
		}			
		//selenium = new WebDriverBackedSelenium(driver, "");
		
		//maxmize window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.phptravels.net/login");
		//open url
		///openURL();
		//driver.manage().deleteAllCookies();
		
	}

}
