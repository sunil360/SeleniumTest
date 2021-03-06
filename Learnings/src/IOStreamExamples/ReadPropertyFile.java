package IOStreamExamples;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadPropertyFile {
	public static void main(String[] args)
	{
		File file= new File("PropertiesFolder\\Test.properties");
		FileInputStream fileInput= null;
		
		try
		{
			fileInput= new FileInputStream(file);
			
					}
		catch(FileNotFoundException fnfe)
		{
			System.out.println(fnfe);
		}
		
		Properties prop= new Properties();
		//load properties file
				try {
					 prop.load(fileInput);
				    } 
				catch (IOException e) {
					e.printStackTrace();
				   }
				
			System.out.println("URL ::" + prop.getProperty("URL"));
			System.out.println("User name::" +prop.getProperty("username"));
		    System.out.println("Password::" +prop.getProperty("password"));
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\sunilk\\workspace\\Learnings\\Drivers\\geckodriver.exe");		
		WebDriver driver = new FirefoxDriver();
		driver.get(prop.getProperty("URL"));
		driver.findElement(By.id("Email")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.id("Passwd")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.id("SignIn")).click();
				
				
				
	}

}
