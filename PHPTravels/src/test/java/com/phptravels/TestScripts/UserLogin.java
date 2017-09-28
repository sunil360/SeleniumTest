package com.phptravels.TestScripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.phptravels.pagehelper.HeaderHelper;
import com.phptravels.pagehelper.LoginHelper;
import com.phptravels.util.DriverTestCase;
import com.phptravels.util.PropertyReader;

import static org.junit.Assert.*;

import org.junit.Assert;



public class UserLogin extends DriverTestCase{
	
	//object initialization	

	
   
	@Test
	public void loginWithblankFileds() {
		
		
		Reporter.log("URL is Launched!");
		//PropertyReader propertyReader = new PropertyReader();		
		LoginHelper loginHelper = new LoginHelper(getWebDriver());
		//HeaderHelper headerHelper = new HeaderHelper(getWebDriver());
		
		//Log into application with blank username and password	
		reportLog("User is not entered PHPTravels username and password.");
		loginHelper.clickLogin();
		loginHelper.verifyLoginValidation();
		System.out.println("Please enter correct username and password.");
				
	}
	
	
	@Test
	public void loginWithInvalidUserName()
	{
		    PropertyReader propertyReader = new PropertyReader();		
			LoginHelper loginHelper = new LoginHelper(getWebDriver());
			
			//Log into application with invalid username
			String username =  propertyReader.readApplicationFile("InvalidUserName");	
			String password =  propertyReader.readApplicationFile("Password");	
			loginHelper.enterUserName(username);
			loginHelper.enterPossword(password);
			loginHelper.clickOnSignIn();
			loginHelper.verifyLoginValidation();
			System.out.println("Please enter correct username.");
	}
    
	
	@Test
	public void loginWithInvalidPassword()
	{
		    PropertyReader propertyReader = new PropertyReader();		
			LoginHelper loginHelper = new LoginHelper(getWebDriver());
			
			//Log into application with invalid password
			String username =  propertyReader.readApplicationFile("UserName");	
			String password =  propertyReader.readApplicationFile("InvalidPassword");	
			loginHelper.enterUserName(username);
			loginHelper.enterPossword(password);
			loginHelper.clickOnSignIn();
			loginHelper.verifyLoginValidation();
			System.out.println("Please enter correct password.");
	}
	
	
	@Test
	public void validLogin() throws InterruptedException{
		
			
		
		PropertyReader propertyReader = new PropertyReader();		
		LoginHelper loginHelper = new LoginHelper(getWebDriver());
		HeaderHelper headerHelper = new HeaderHelper(getWebDriver());
		
		//Log into the application with valid credential
		reportLog("User is required to login using a valid PHPTravels username and password.");
		String username =  propertyReader.readApplicationFile("UserName");	
		String password =  propertyReader.readApplicationFile("Password");	
		loginHelper.enterUserName(username);
		loginHelper.enterPossword(password);
		loginHelper.clickOnSignIn();
		
		boolean bolConsole;
		bolConsole=true;
		Reporter.log("Driver Object Created!",bolConsole);
		System.out.println("Logged in successfully");
		
		
		//Verify that user logged into application successfully
		boolean result= headerHelper.isLogoutDropDownDisplayed();
		assertTrue("Logout button should be shown after login into application", result);
		
			
		//log out from the application 
		headerHelper.clickLogOutDropDownIcon();
		headerHelper.clickLogOut();	
		headerHelper.verifyLogoutValidation();
		System.out.println("User is successfully logout from the application");
		
	}
	
	
	
}
