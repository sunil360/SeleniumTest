package com.sampleprograminwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class HandleTextbox {
    public static void main(String args[]){
    	System.setProperty("webdriver.gecko.driver", "C:\\Users\\sunilk\\workspace\\TestExample\\Drivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.facebook.com");
        WebElement email= driver.findElement(By.id("email"));
        Actions builder = new Actions(driver);
       Action seriesOfActions=builder.moveToElement(email).click().sendKeys(email, "gati.naveen@gmail.com").build();
       
        seriesOfActions.perform();
        WebElement pass = driver.findElement(By.id("pass"));
        WebElement login =driver.findElement(By.id("u_0_b"));
        Actions seriesOfAction = builder.moveToElement(pass).click().sendKeys(pass, "naveench").click(login);
        seriesOfAction.perform();
               
      
    }    
}