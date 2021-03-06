
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.NoAlertPresentException;	
import org.openqa.selenium.Alert;

public class AlertDemo {
	
	public static void main(String[] args) throws NoAlertPresentException,InterruptedException  {									
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sunilk\\workspace\\Learnings\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	
        
        // Alert Message handling
                    		
        driver.get("http://demo.guru99.com/selenium/delete_customer.php");			
                            		
     	      	
        driver.findElement(By.name("cusid")).sendKeys("53920");					
        driver.findElement(By.name("submit")).submit();			
        		
        // Switching to Alert        
        Alert alert = driver.switchTo().alert();		
        		
        // Capturing alert message.  
        System.out.println(driver.switchTo().alert().getText());
       // String alertMessage= driver.switchTo().alert().getText();		
        		
        // Displaying alert message		
       // System.out.println(alertMessage);	
        Thread.sleep(5000);
        		
        // Accepting alert		
        alert.accept();		
        driver.quit();
        
        //System.out.println(msg);
         
        WebDriver driver1 = new ChromeDriver();
 		driver1.manage().window().maximize();
 		driver1.get("http://demo.guru99.com/selenium/delete_customer.php");	
        driver1.findElement(By.name("cusid")).sendKeys("53920");					
        driver1.findElement(By.name("submit")).submit();	
        
        Alert alert2= driver1.switchTo().alert();
        
        alert2.dismiss();
        
    }	

}