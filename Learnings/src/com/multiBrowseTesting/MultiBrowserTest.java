package com.multiBrowseTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultiBrowserTest {

       private WebDriver driver;

       // Configure for multi browser drivers
       @Parameters("browser")
       @BeforeClass
       public void beforeTest(String browser) throws InterruptedException {
              if (browser.equalsIgnoreCase("firefox")) {
            	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\sunilk\\workspace\\Learnings\\Drivers\\geckodriver.exe");
                     driver = new FirefoxDriver();
                     Thread.sleep(5000);
              } else if (browser.equalsIgnoreCase("chrome")) {
                     // Set Path for the executable file
                     System.setProperty("webdriver.chrome.driver",
                                  "C:\\Users\\sunilk\\workspace\\Learnings\\Drivers\\chromedriver.exe");
                     driver = new ChromeDriver();
                     Thread.sleep(5000);
              } else if (browser.equalsIgnoreCase("ie")) {
                     // Set Path for the executable file
                     System.setProperty("webdriver.ie.driver", "C:\\Users\\sunilk\\workspace\\Learnings\\Drivers\\IEDriverServer.exe");
                     driver = new InternetExplorerDriver();
                     Thread.sleep(5000);
              } else {
                     throw new IllegalArgumentException("The Browser Type is Undefined");
              }
              System.out.println(browser);
              // Open App
              driver.get("http://demo.opensourcecms.com/wordpress/wp-login.php");
       }

       @Test
       public void login() throws InterruptedException {
              // Enter UserName
              driver.findElement(By.id("user_login")).clear();
              driver.findElement(By.id("user_login")).sendKeys("admin");
              // Enter Password
              driver.findElement(By.id("user_pass")).clear();
              driver.findElement(By.id("user_pass")).sendKeys("demo123");
              // Click on Submit button
              driver.findElement(By.id("wp-submit")).submit();
       }

       @AfterClass
       public void afterTest() {
              try {
                     driver.quit();
              } catch (Exception e) {
                     driver = null;
              }
       }
}
