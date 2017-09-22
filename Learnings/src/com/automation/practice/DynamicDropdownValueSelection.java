package com.automation.practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class DynamicDropdownValueSelection {
	
	@Test
	public void dynamicValueSelection() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sunilk\\workspace\\Learnings\\Drivers\\chromedriver.exe");
 	WebDriver driver=new ChromeDriver();	
 	
 	//JavascriptExecutor jsdriver= (JavascriptExecutor) driver; 
 		
    //Launching the site.	
    driver.manage().window().maximize();
    driver.get("https://bankifsccode.com");
    
    WebElement bankname=driver.findElement(By.xpath("html/body/table[1]/tbody/tr[9]/td[2]/table/tbody/tr/td[1]/div/form[1]/div/select"));
    WebElement statename=driver.findElement(By.xpath("html/body/table[1]/tbody/tr[9]/td[2]/table/tbody/tr/td[1]/div/form[2]/div/select"));
    WebElement districttname=driver.findElement(By.xpath("html/body/table[1]/tbody/tr[9]/td[2]/table/tbody/tr/td[1]/div/form[3]/div/select"));
    WebElement branchname=driver.findElement(By.xpath("html/body/table[1]/tbody/tr[9]/td[2]/table/tbody/tr/td[1]/div/form[4]/div/select"));
    
    
    Select bankselect= new Select(bankname);
    int i= bankselect.getOptions().size();
    System.out.println(i);
    
    
    if(bankselect.getOptions().size() !=0)
    {
    bankselect.selectByVisibleText("PUNJAB NATIONAL BANK");
    Thread.sleep(5000);
    }
    
    
   
    
   List<WebElement> liststate= driver.findElements(By.xpath("html/body/table[1]/tbody/tr[9]/td[2]/table/tbody/tr/td[1]/div/form[2]/div/select"));   
   for(WebElement elstate : liststate)
   {
	   System.out.println(elstate.getText());
	   
	   Select stateselect= new Select(elstate);
    
       stateselect.selectByVisibleText("UTTAR PRADESH");
   
         Thread.sleep(5000);
      }   
   
   
   List<WebElement> listdistrict= driver.findElements(By.xpath("html/body/table[1]/tbody/tr[9]/td[2]/table/tbody/tr/td[1]/div/form[3]/div/select"));   
   for(WebElement eldistrict : listdistrict)
   {
	   System.out.println(eldistrict.getText());
	   
	   Select selectdistrict= new Select(eldistrict);
    
	   selectdistrict.selectByVisibleText("BULANDSHAHR");
   
         Thread.sleep(5000);
      }   
   
   List<WebElement> listbranch= driver.findElements(By.xpath("html/body/table[1]/tbody/tr[9]/td[2]/table/tbody/tr/td[1]/div/form[4]/div/select"));   
   for(WebElement elbranch : listbranch)
   {
	   System.out.println(elbranch.getText());
	   
	   Select selectbranch= new Select(elbranch);
    
	   selectbranch.selectByVisibleText("AURANGABAD");
   
         Thread.sleep(5000);
      }   
    	
	}
}
