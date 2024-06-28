package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtil {
	
	
	private WebDriver driver;
	
	public ElementUtil(WebDriver driver)
	{
		
		this.driver=driver;
	}
	//public  void   doSendKeys(By locator,String Value)
	//{
		
		// getElement(locator).sendKeys(Value);
		 
	//}
	
	
	public  WebElement getElement(By locator)
	{
		
		return driver.findElement(locator);
	}
	

}
