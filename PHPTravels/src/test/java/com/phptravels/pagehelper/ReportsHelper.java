package com.phptravels.pagehelper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.phptravels.locator.LocatorReader;
import com.phptravels.util.DriverHelper;

public class ReportsHelper extends DriverHelper {
	
	private LocatorReader manageRegionLocator;	
	
	public ReportsHelper() {
		//super(driver);	
		manageRegionLocator = new LocatorReader("ManageRegion.xml");
	}
	public void clickManageRegion()
	{
		String locator = manageRegionLocator.getLocator("Settings.ManageRegions");
		clickOn(locator);
	}
	
	public void clickAddRegion()
	{
		String locator = manageRegionLocator.getLocator("Menu.AddRegion");
		clickOn(locator);
	}
	public void enterRegionName(String RegionName)
	{
		String locator = manageRegionLocator.getLocator("AddRegion.RegionName");
		sendKeys(locator, RegionName);
	}
	
	public void clickForwardAllButton(){
		String locator = manageRegionLocator.getLocator("AddRegion.ForwardAllButton");
		clickOn(locator);
	}
	public void clickDoneButton(){
		String locator = manageRegionLocator.getLocator("AddRegion.DoneButton");
		clickOn(locator);
	}
	
	//***************************************** search promotion *****************************************************************
	
	
	public void searchRegion(String Region){
		String locator = manageRegionLocator.getLocator("RegionList.Rows");
		Number str = getWebDriver().findElements(ByLocator(locator)).size();
		int totalrow = str.intValue();
		for(int i=1;i<=totalrow-1; i++){			
		    String str1 = getWebDriver().findElement(By.xpath("//table[@id='IC_REGIONS_TAB_GRID']/tbody/tr["+i+"]/td/div")).getText();			
			if(str1.equals(Region)){
				clickOn("//table[@id='IC_REGIONS_TAB_GRID']/tbody/tr["+i+"]/td/div");
				break;
			}
		}
	}
	
	public void clickDeleteRegion(){
		String locator = manageRegionLocator.getLocator("Menu.DeleteTax");
		clickOn(locator);
	}
	public void clickDeleteAlertYes(){
	 String locator = manageRegionLocator.getLocator("RegionList.DeleteAlertYes");
		clickOn(locator);
	}
	
}

