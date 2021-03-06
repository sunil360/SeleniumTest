package com.phptravels.pagehelper;

import java.util.List;
import java.util.StringTokenizer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.phptravels.locator.LocatorReader;
import com.phptravels.util.DriverHelper;

public class AdvancedHelper extends DriverHelper {
	
	private LocatorReader advancedlocator;	
	
	public AdvancedHelper(WebDriver driver) {
		super(driver);	
		advancedlocator = new LocatorReader("Advanced.xml");
	}
	
	

	public void supervisedTheUser(String searchUser,String spuervisedUser )
	{
		searchUser(searchUser);
		enterSupervisedUser(spuervisedUser);
		clickOnPlusIcon();
		clickOnSaveButton();
		
	}
		
	//Search user in advanced page and click on edit icon
	public void searchUser(String searchUser)
	{
		List<WebElement> rows= getWebDriver().findElements(By.xpath("//*[@id='users-region']/div/table/tbody/tr"));
		for (int i=1; i<=rows.size(); i++)
		{
			String userName= getWebDriver().findElement(By.xpath("//*[@id='users-region']/div/table/tbody/tr["+i+"]/td[1]")).getText();
			if(userName.equals(searchUser))
			{	System.out.println("Click on edit gear button");
				getWebDriver().findElement(By.xpath("//*[@id='users-region']/div/table/tbody/tr["+i+"]/td[4]/div/button[1]")).click();
				break;
			}
		}
		
	}
	
	
	//Enter supervised user
	public void enterSupervisedUser(String spuervisedUser)
	{
		String locator = advancedlocator.getLocator("AdvancedEditUser.SupervisedUserTextbox");
		sendKeys(locator, spuervisedUser);
	}
	
	
	//Click on plus icon
	public void clickOnPlusIcon()
	{
		String locator = advancedlocator.getLocator("AdvancedEditUser.SupervisedUserPlusIcon");
		clickOn(locator);
	}
	
	//Click on Save User button
	
	public void clickOnSaveButton()
	{
		String locator = advancedlocator.getLocator("AdvancedEditUser.SaveUserButton");
		clickOn(locator);
	}
	
	
	
	public void deleteSupervisedUser(String user)
	{
		List<WebElement> noOfUsers= getWebDriver().findElements(By.xpath("//*[@id='tag-list']/span"));
		int  count = noOfUsers.size();
		
		for (int i= 1; i<=count; i++)
		{
			String getUser= getWebDriver().findElement(By.xpath("//*[@id='tag-list']/span["+i+"]/span")).getText();
			if(user.equalsIgnoreCase(getUser))
			{
				getWebDriver().findElement(By.xpath("//*[@id='tag-list']/span["+i+"]/span/span")).click();
				break;
			}
		}
		
	}
	
	
	
	
	
}