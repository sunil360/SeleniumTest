package com.phptravels.pagehelper;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.phptravels.locator.LocatorReader;
import com.phptravels.util.DriverHelper;


public class LoginHelper extends DriverHelper {
	
	private LocatorReader loginLocator;	
	public WebDriver driver;
	public LoginHelper(WebDriver driver) {
		super(driver);	
		loginLocator = new LocatorReader("Login.xml");
	}
	
	public void verifyLoginPage(){		
		String locator = loginLocator.getLocator("Login.UserName");
		String userName = getText(locator);
		Assert.assertTrue(userName.contains("testauto123@gmail.com"));
		String locator1 = loginLocator.getLocator("Login.Password");
		String password = getText(locator1);		
		Assert.assertTrue(password.contains("360logica"));
	}
	
	public void enterUserName(String username)
	{
		String locator = loginLocator.getLocator("Login.UserName");
		System.out.println(locator);
		sendKeys(locator, username);
	}
	
	public void enterPossword(String password)
	{
		String locator = loginLocator.getLocator("Login.Password");
		sendKeys(locator, password);
	}	
	
	public void clickOnSignIn()
	{
		String locator = loginLocator.getLocator("Login.SignIn");
		clickOn(locator);
		//clickOn(com.videomanager.locators.login_locators.clicksign);
		//javaScriptExecute("window.document.getElementsByClassName('btn btn-lg btn-primary btn-block')[0].click()");
		getWebDriver().manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		
	}
		
		
		
		
	public void clickLogin()
	{
		String locator = loginLocator.getLocator("Login.SignIn");
		clickOn(locator);
	}
	
	public void verifyLoginValidation(){
		String locator = loginLocator.getLocator("Login.ValidationMessage");
		String text = getText(locator);
		Assert.assertTrue(text.contains("Your username and password were not recognised"));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
