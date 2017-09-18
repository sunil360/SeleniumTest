import org.openqa.selenium.By;

public class LocatorTest {

	public static void main(String args[])
	{
		    String locator="#username";
		    FindLocator fl= new FindLocator();
		    By res= fl.ByLocator(locator);
		    System.out.println(res);
		    
		   
	}
}
	
	class FindLocator
	{
		       public By ByLocator(String locator) {
				By result = null;
				if (locator.startsWith("//")) {
					result = By.xpath(locator);
				} else if (locator.startsWith("css=")) {
					result = By.cssSelector(locator.replace("css=", ""));
				} else if (locator.startsWith("#")) {
					result = By.name(locator.replace("#", ""));
					
				} else if (locator.startsWith("link=")) {
					result = By.linkText(locator.replace("link=", ""));
				}
					
				  else if(locator.startsWith("class=")) {
						result=By.className(locator.replace("class=", ""));
					}
				  else if(locator.startsWith("name=")) {
						result=By.name(locator.replace("name=", ""));
					}
				  
				  else if(locator.startsWith("id=")) {
					  result=By.id(locator.replace("id=", ""));
				  }
				  else if(locator.startsWith("(")) {
					  result = By.xpath(locator);
				  }
				else {
					result = By.id(locator);
				}
				return result;
	}
	}

