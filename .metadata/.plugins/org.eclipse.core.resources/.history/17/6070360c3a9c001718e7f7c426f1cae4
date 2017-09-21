package com.phptravels.TestScripts;

import org.testng.annotations.Test;

import com.phptravels.pagehelper.HeaderHelper;
import com.phptravels.pagehelper.LoginHelper;
import com.phptravels.util.DriverTestCase;
import com.phptravels.util.PropertyReader;

import static org.junit.Assert.*;



public class UserLogin extends DriverTestCase{

	@Test
	public void testLogin() throws InterruptedException{
		
		//object initialization		
		PropertyReader propertyReader = new PropertyReader();		
		LoginHelper loginHelper = new LoginHelper(getWebDriver());
		//HeaderHelper headerHelper = new HeaderHelper();
				
		//Log into the application with valid credential
		
		String username =  propertyReader.readApplicationFile("UserName");	
		String password =  propertyReader.readApplicationFile("Password");	
		loginHelper.enterUserName(username);
		loginHelper.enterPossword(password);
		loginHelper.clickOnSignIn();
		System.out.println("Logged in successfully");
		
		
		//Verify that user logged into application successfully
		//boolean result= headerHelper.isLogoutDropDownDisplayed();
		//assertTrue("Logout button should be shown after login into application", result);
		
			
		//log out from the application 
		//headerHelper.clickLogOutDropDownIcon();
		//headerHelper.clickLogOut();	
		
	}
	
}
