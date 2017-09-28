package com.phptravels.util;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
//import com.phptravels.pagehelper.HeaderHelper;
import com.phptravels.pagehelper.LoginHelper;

import com.phptravels.pagehelper.AdvancedHelper;
//import com.thoughtworks.selenium.Selenium;

public abstract class DriverTestCase {
	
	private static final Logger logger = LoggerFactory.getLogger(DriverTestCase.class);
	private static final String BREAK_LINE = "\n";//"</br>";
	public static ExtentTest test;
	public static ExtentReports extent;
	
	enum DriverType {
		Firefox, IE, Chrome
	}

	private WebDriver driver;
	//private Selenium selenium;	
	
	@BeforeSuite
	public void before() {
		extent = new ExtentReports("target/surefire-reports/ExtentReport.html", true);
	}

	
	@BeforeMethod
	public void setUp(Method method) {		
		PropertyReader propertyReader = new PropertyReader();
		
		
		String driverType = propertyReader.readApplicationFile("BROWSER");		
		
		test = extent.startTest(method.getName(), this.getClass().getName());
		test.assignAuthor("360Logica");
		test.assignCategory(this.getClass().getSimpleName());
		
		//System.out.println(driverType);
							
		if (DriverType.Firefox.toString().equals(driverType)) {		
			 System.setProperty("webdriver.gecko.driver","C:\\Users\\sunilk\\workspace\\PHPTravels\\src\\test\\resources\\webdriver\\geckodriver.exe");
				driver = new FirefoxDriver();				
			
		} 
		else if (DriverType.IE.toString().equals(driverType)) {
			System.setProperty("webdriver.ie.driver","C:\\Users\\sunilk\\workspace\\PHPTravels\\src\\test\\resources\\webdriver\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			
		} else if (DriverType.Chrome.toString().equals(driverType)) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\sunilk\\workspace\\PHPTravels\\src\\test\\resources\\webdriver\\chromedriver.exe");
			driver = new ChromeDriver();
			
		} else {
			
			System.out.println("Please enter the correct browser name");
					
		}			
		//selenium = new WebDriverBackedSelenium(driver, "");
		
		//maxmize window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//open url
		openURL();
		//driver.manage().deleteAllCookies();
		
	}
	
	//set unique role names using time stamp
	Date now = new java.util.Date(); 
	Random random =new Random();
	java.text.DateFormat emailFormat = new java.text.SimpleDateFormat("HH_mm_SSS");	
	public String emailId = "test+account"+emailFormat.format(now)+"-"+getRandomInteger(10000,99999, random)+"@powa.com";
	public String userName = "UserAcc"+randomString(7);
	Random aRandom = new Random();
	public String sku = randomString(4)+"-"+getRandomInteger(100, 999, aRandom);
	public String productname = "POWA"+randomString(4)+"-"+getRandomInteger(100, 999, aRandom);
	
	
	//@AfterSuite
	public void afterMainMethod() {		
		driver.quit();
	}
	
	public WebDriver getWebDriver(){
		return driver;
	}
	
	/*public Selenium getSelenium(){		
		return selenium;		
	}*/
	
	public String switchPreviewWindow()
	{
		Set<String> windows = getWebDriver().getWindowHandles();
		Iterator<String> iter = windows.iterator();		
		String parent = iter.next();
		getWebDriver().switchTo().window(iter.next());
		return parent;
	}
	
	public void openURL(){
		//open admin control panel application URL 
		PropertyReader propertyReader = new PropertyReader();	
		String applicationUrl = propertyReader.readApplicationFile("WebURL");
		System.out.println("my application URL is: " +applicationUrl);
		//getWebDriver().get(applicationUrl+"/en/ControlPanel.html");
		//getWebDriver().get(applicationUrl + "/login");
		getWebDriver().get(applicationUrl);
	}
	
	public void loginAdminConsole(){
		  PropertyReader propertyReader = new PropertyReader();
		  AdvancedHelper userCreationHelper = new AdvancedHelper(getWebDriver());
		  String username =  propertyReader.readApplicationFile("AdminName"); 
		  String password =  propertyReader.readApplicationFile("AdminPassword"); 
		  //userCreationHelper.enterUserName(username);
		  //userCreationHelper.enterPassword(password);
		  //userCreationHelper.clickLogin();		  
	}
	
	public void login(){		
		LoginHelper loginHelper = new LoginHelper(getWebDriver());
		PropertyReader propertyReader = new PropertyReader();
		String username =  propertyReader.readApplicationFile("UserName");	
		String password =  propertyReader.readApplicationFile("Password");	
		loginHelper.enterUserName(username);
		loginHelper.enterPossword(password);
		loginHelper.clickLogin();
	}
	public int getRandomInteger(int aStart, int aEnd, Random aRandom){
	    if ( aStart > aEnd ) {
	      throw new IllegalArgumentException("Start cannot exceed End.");
	    }
	    //get the range, casting to long to avoid overflow problems
	    long range = (long)aEnd - (long)aStart + 1;
	    // compute a fraction of the range, 0 <= frac < range
	    long fraction = (long)(range * aRandom.nextDouble());
	    int randomNumber =  (int)(fraction + aStart);    
	    return randomNumber;
	}
	

	public String randomString( int len ) 
	{
		String AB = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		Random rnd = new Random();
		StringBuilder sb = new StringBuilder( len );
		for( int i = 0; i < len; i++ ) 
			sb.append( AB.charAt( rnd.nextInt(AB.length()) ) );
		return sb.toString();
	}

	public String getPath()
	{
		String path ="";		
		File file = new File("");
		String absolutePathOfFirstFile = file.getAbsolutePath();
		path = absolutePathOfFirstFile.replaceAll("\\\\+", "/");		
		return path;
	}
	
	/*Report logs*/
	public void reportLog(String message) {
		test.log(LogStatus.INFO, message);
		message = BREAK_LINE + message;
		logger.info("Message: " + message);
		Reporter.log(message);
		
	}
	
	
}
