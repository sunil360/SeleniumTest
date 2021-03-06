package com.maventest.TestExample.MultipleActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DemoDragDrop {

	WebDriver driver;
	@BeforeClass
	public void Setup() {
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\sunilk\\workspace\\TestExample\\Drivers\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sunilk\\workspace\\TestExample\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void dragAndDropTest() throws InterruptedException {
	
     // Open webpage
     driver.get("http://jqueryui.com/resources/demos/droppable/default.html");

     // Add 5 seconds wait
     Thread.sleep(5000);

     // Create object of actions class
     Actions act=new Actions(driver);

     // find element which we need to drag
     WebElement drag=driver.findElement(By.xpath(".//*[@id='draggable']"));

     // find element which we need to drop
     WebElement drop=driver.findElement(By.xpath(".//*[@id='droppable']"));

     // this will drag element to destination
     act.dragAndDrop(drag, drop).build().perform();
     System.out.println("Drag and drop functionality has been performed");
     
     
     act.dragAndDropBy(drag, 100, 100).perform();
     System.out.println("Drag and drop by offset has been performed");
     
     act.moveToElement(drop).moveByOffset(100, 100).perform();
     System.out.println("moved by offset");
     
     Thread.sleep(5000);
     
     driver.quit();

}
}
