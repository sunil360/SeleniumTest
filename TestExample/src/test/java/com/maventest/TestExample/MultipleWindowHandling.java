package com.maventest.TestExample;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MultipleWindowHandling {

	 WebDriver driver;  
	
	@BeforeClass
	public void setup() throws Exception {  
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\sunilk\\workspace\\TestExample\\Drivers\\geckodriver.exe");
	DesiredCapabilities cap = new DesiredCapabilities();
	cap.acceptInsecureCerts();
	cap.setJavascriptEnabled(true);
	cap.setAcceptInsecureCerts(true);
	
	/*FirefoxProfile profile=new FirefoxProfile();
	profile.setAcceptUntrustedCertificates (true); 
	profile.setAssumeUntrustedCertificateIssuer(true);*/
	
	driver=new FirefoxDriver(cap);  
	String URL="http://www.seleniummaster.com";   
	driver.get(URL);    
	//driver.findElement(By.xpath("xhtml:html/xhtml:body/xhtml:div[4]/xhtml:div[2]/xhtml:div[7]/xhtml:button[3]")).click();
	//driver.findElement(By.xpath("xhtml:html/xhtml:body/xhtml:div[4]/xhtml:div[5]/xhtml:div/xhtml:button")).click();	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    //driver.manage().window().maximize(); 
    
    }  
     
	@Test
	 public void test() throws Exception {
	 // Opening Calender		
	 
		driver.findElement(By.xpath("//img[@alt='SeleniumMasterLogo']")).click();  
	     // Storing parent window reference into a String Variable  
	     String Parent_Window = driver.getWindowHandle();    
	      // Switching from parent window to child window   
	     for (String Child_Window : driver.getWindowHandles())  
	     {  
	     driver.switchTo().window(Child_Window);  
	     // Performing actions on child window  
	     driver.findElement(By.id("dropdown_txt")).click();  
	     List  dropdownitems=driver.findElements(By.xpath("//div[@id='DropDownitems']//div"));  
	     int dropdownitems_Size=dropdownitems.size();  
	     System.out.println("Dropdown item size is:"+dropdownitems_Size);  
	     ((WebElement) dropdownitems.get(1)).click();  
	     driver.findElement(By.xpath("//*[@id='anotherItemDiv']")).click();  
	     }  
	     //Switching back to Parent Window  
	     driver.switchTo().window(Parent_Window);  
	     //Performing some actions on Parent Window  
	     driver.findElement(By.className("btn_style")).click();  
	     }  
	      @AfterClass  
	      public void close() {  
	      driver.quit();  
	      }   
	     }  