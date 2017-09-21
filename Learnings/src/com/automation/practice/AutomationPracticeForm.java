package com.automation.practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AutomationPracticeForm {
	public static void main(String[] args) throws InterruptedException, AWTException {		
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sunilk\\workspace\\Learnings\\Drivers\\chromedriver.exe");
        	WebDriver driver=new ChromeDriver();			
        		
        //Launching the site.	
        driver.manage().window().maximize();
        driver.get("http://toolsqa.com/automation-practice-form/");		
        
       //driver.findElement(By.cssSelector(".btn.btn-info")).click();
        
        
        	
       /* WebElement automationPracticeForm=driver.findElement(By.xpath("html/body/div[1]/div[1]/header/nav/ul/li[8]/ul/li[3]/a/span[1]/span/span"));
        WebElement demoSitestab= driver.findElement(By.linkText("DEMO SITES"));
        Actions action= new Actions(driver);
        
           //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
        
         action.moveToElement(demoSitestab).perform();
        
        
       //WebElement automationPracticeForm=driver.findElement(By.xpath("html/body/div[1]/div[1]/header/nav/ul/li[8]/ul/li[3]/a/span[1]/span/span"));
            
        action.moveToElement(automationPracticeForm).click().build().perform();
        */
        
        
        driver.findElement(By.name("firstname")).sendKeys("Sunil");
        driver.findElement(By.name("lastname")).sendKeys("Kumar");
        
        
         


        
        driver.findElement(By.id("sex-0")).click();
       
       
        //Select chkbox= new Select(driver.findElement(By.id("exp-0")));
        //chkbox.selectByValue("QTP");        
       // driver.findElement(By.id("exp-0")).click();
        List<WebElement> explist= driver.findElements(By.xpath("//input[@name='exp']"));
        
        System.out.println(explist);
        
        for(WebElement webexp : explist)
        {
        	webexp.click();
        }
        explist.get(5).click();
       
        driver.findElement(By.id("datepicker")).sendKeys("20/10/2016");
        driver.findElement(By.id("profession-0")).click();
       // driver.findElement(By.name("photo")).click();
        driver.findElement(By.name("photo")).sendKeys("C:\\Users\\sunilk\\Desktop\\GigsUIDistortedonIE.png");
        
        List<WebElement> toollist= driver.findElements(By.xpath("//input[@name='tool']"));
      //  System.out.println(toollist);
        
        for(WebElement webtool : toollist)
        {
        	webtool.click();
        }
        
         //Select select = new Select((WebElement)lst);
         //select.selectByVisibleText("QTP");
       // driver.findElement(By.id("tool-2")).click();
        WebElement continents=driver.findElement(By.tagName("select"));
        
        Select cselect= new Select(continents);
        int i= cselect.getOptions().size();
        cselect.selectByVisibleText("Africa");
        
        
        
         Select scommands= new Select(driver.findElement(By.id("selenium_commands")));
         scommands.selectByVisibleText("Browser Commands");
         //scommands.selectByVisibleText("Switch Commands");
         scommands.selectByVisibleText("WebElement Commands");
       
        
        
        WebElement txtlocator=driver.findElement(By.className("bcd"));
          
        System.out.println(txtlocator.getText());
        
        
       /* List<WebElement> scommandselement= scommands.getOptions();
        for(int a=0;a<scommandselement.size();a++)
        {
            System.out.println("Option Value : " + scommandselement.get(a).getAttribute("value"));
            System.out.println("Display Text : " + scommandselement.get(a).getText());
        }   */
        
        //System.out.println(scommandselement);
        
        
        int j= scommands.getOptions().size();
        //scommands.selectByIndex(1);
        
        System.out.println(i);
        System.out.println(j);
        
        
        
        
        WebElement sexRadiobtn= driver.findElement(By.id("sex-0"));
        WebElement professiontype=driver.findElement(By.id("profession-0"));
        
       // yearsofExp.click();        
               
        boolean bValue = sexRadiobtn.isSelected();
        boolean cValue = professiontype.isSelected();
        
        
        System.out.println(bValue);
        System.out.println(cValue);
        
        
       
        
        
	}

}
