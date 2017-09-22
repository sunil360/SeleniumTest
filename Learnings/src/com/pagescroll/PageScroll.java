package com.pagescroll;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PageScroll {
	WebDriver driver;
	String URL = "http://toolsqa.com/automation-practice-form/";

	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sunilk\\workspace\\Learnings\\Drivers\\chromedriver.exe");
    	driver=new ChromeDriver();
    	driver.manage().window().maximize();
		driver.get(URL);
		
	}
	    @Test(priority=1)
	    public void countSections() {
	    	
		List<WebElement> sectionlist= driver.findElements(By.xpath("//section[@class='widget widget_text']"));
		//List<WebElement> toollist= driver.findElements(By.xpath("//section[@class='widget widget_text']"));
		sectionlist.size();
		
		for(Object obj: sectionlist)
		{
			System.out.println(obj);
		}
		
	}
	
	

	//@Test(priority=1)
	public void scrollingToBottomofAPage() throws InterruptedException {
		//driver.navigate().to(URL);
		//JavascriptExecutor js= (JavascriptExecutor)driver;
		 ((JavascriptExecutor) driver)
         .executeScript("window.scrollTo(0, document.body.scrollHeight)");
		 Thread.sleep(5000);
	}

	//@Test(priority=2)
	public void scrollingToElementofAPage() throws InterruptedException {
		//driver.navigate().to(URL+"directory/companies?trk=hb_ft_companies_dir");
		WebElement element = driver.findElement(By.xpath("//input[@value='Subscribe']"));
		((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView();", element);
		 Thread.sleep(5000);
	}
	
	//@Test(priority=3)
	public void scrollingByCoordinatesofAPage() throws InterruptedException {
		driver.navigate().to(URL+"job/?trk=hb_ft_jobs");
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");
		 Thread.sleep(5000);
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
