import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowandTabDemo {
	
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sunilk\\workspace\\Learnings\\Drivers\\chromedriver.exe");
    	WebDriver driver=new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get("http://toolsqa.com/automation-practice-switch-windows/");
    	
    	 // Store and Print the name of the First window on the console
    	 
        String handle= driver.getWindowHandle();

        System.out.println(handle);

        // Click on the Button "New Message Window"

        driver.findElement(By.xpath("html/body/div[1]/div[5]/div[2]/div/div/p[3]/button")).click();

        // Store and Print the name of all the windows open	              

        Set handles = driver.getWindowHandles();
        
        System.out.println(handles);

        // Pass a window handle to the other window

        for (String handle1 : driver.getWindowHandles()) {

        	System.out.println(handle1);

        	driver.switchTo().window(handle1);

        	}

         //Closing Pop Up window

        driver.close();
        
        driver.switchTo().window(handle);  
        
        // Click on the Button "New Beowser Window"
        driver.findElement(By.xpath("html/body/div[1]/div[5]/div[2]/div/div/p[2]/button")).click();
        Set<String> handlesnew = driver.getWindowHandles();
        
       // Store and Print the name of all the windows open
        System.out.println(handlesnew);
        
        // Pass a window handle to the other window
        
        for (String handle2 : handlesnew ) {

        	System.out.println(handle2);

        	driver.switchTo().window(handle2);
             
        	}
        driver.close();
        driver.switchTo().window(handle); 
        
     // Click on the Button "New Tab Window"
        driver.findElement(By.xpath("html/body/div[1]/div[5]/div[2]/div/div/p[4]/button")).click();
        Set handlestab = driver.getWindowHandles();
        
        // Store and Print the name of all the windows open
        System.out.println(handlestab);
        
        // Pass a window handle to the other window
        
        for (String handle3 : driver.getWindowHandles()) {

        	System.out.println(handle3);

        	driver.switchTo().window(handle3);

        	}
        driver.close();
        
       driver.switchTo().window(handle);
       // Close Original window

        //driver.quit();
	}

}