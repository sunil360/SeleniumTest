import java.awt.AWTException;
import java.awt.Robot;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.glass.events.KeyEvent;

public class IFrameDemo {
	
	public static void main(String args[]) throws AWTException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sunilk\\workspace\\Learnings\\Drivers\\chromedriver.exe");
    	WebDriver driver=new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get("http://toolsqa.com/iframe-practice-page/");
    	
    	      //By executing a java script
    			//JavascriptExecutor exe = (JavascriptExecutor) driver;
    			//Integer numberOfFrames = Integer.parseInt(exe.executeScript("return window.length").toString());
    			//System.out.println("Number of iframes on the page are " + numberOfFrames);
    	 
    			//By finding all the web elements using iframe tag
    			//List<WebElement> iframeElements = driver.findElements(By.tagName("iframe"));
    			//System.out.println("The total number of iframes are " + iframeElements.size());
    			//System.out.println(iframeElements);
    			
    			//driver.switchTo().frame(0);
    			
    			Robot iframescroll= new Robot();
    			iframescroll.keyPress(KeyEvent.VK_PAGE_DOWN);
    			iframescroll.keyRelease(KeyEvent.VK_PAGE_DOWN);
    			    			
    			//WebElement framename=driver.findElement(By.xpath("html/body/div[1]/div[5]/div[2]/div/div/div[2]/iframe"));
    			//driver.switchTo().frame(framename);
    			
		
	}

}
