package com.maventest.TestExample.MultipleActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class RightClickAction {
	

WebDriver driver;
	
	String URL = "http://medialize.github.io/jQuery-contextMenu/demo.html";
	
	@BeforeClass
	public void Setup() {
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\sunilk\\workspace\\TestExample\\Drivers\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sunilk\\workspace\\TestExample\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void rightClickTest() throws InterruptedException {
		driver.get("https://accounts.google.com"); 	
		Actions action = new Actions(driver);
		
		
	   // Enter the data in Uppercase
		 WebElement nextBtn = driver.findElement(By.xpath("//content[@class='CwaK9']"));
		 WebElement element = driver.findElement(By.xpath("//input[@id='identifierId']"));
		 Action testact= action.moveToElement(element).click()
		.keyDown(element,Keys.SHIFT).sendKeys(element, "sunil")
		.keyUp(element, Keys.SHIFT).build();
		testact.perform();
		System.out.println("Entered data in Uppercase");
		
		
		 //Open the context menu i.e. right click		
		 action.contextClick(element).perform();
		
		
		 //Click on Hold action
		 action.moveToElement(nextBtn).clickAndHold().perform();
		 System.out.println("Click and Hold performed");
		 
		 //Release action
		 action.moveToElement(nextBtn).release();
		 System.out.println("Release method call");
		 
		 //Double click action
		 action.doubleClick(nextBtn).perform();
		 System.out.println("Double Clicked");
		 
		 //move by offset
		 Thread.sleep(3000);
		 action.clickAndHold(nextBtn).moveByOffset(50, 50).release().build().perform();
		 System.out.println("Moved by offset");
			
		 //Thread.sleep just for user to notice the event
		 Thread.sleep(3000);
		
		//Closing the driver instance
		driver.quit();
		
		driver.get("http://jqueryui.com/resources/demos/droppable/default.html");
		WebElement drag=driver.findElement(By.id("draggable"));
		WebElement drop=driver.findElement(By.id("droppable"));
		action.dragAndDrop(drag, drop).perform();
		System.out.println("Drag and Drop functionality is working fine.");
		
	}
	
	
}

