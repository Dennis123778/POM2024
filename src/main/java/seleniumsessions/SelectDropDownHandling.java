package seleniumsessions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownHandling {

	 static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/contact-sales");
		By country_select=By.id("Form_getForm_Country");
		By noofemp=By.id("Form_getForm_NoOfEmployees");
		System.out.println(noofemp);
		//Select select_country=new Select(driver.findElement(country_select));
		///Select select_noofemp=new Select(driver.findElement(noofemp));
		//select_country.selectByIndex(5);
		
		//select_noofemp.selectByIndex(1);

		doSelectByvisibleText(country_select,"India");
		doSelectByvalue(noofemp,"201 - 250");
	}
	
	public static  WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}

	public static void doselectByIndex(By locator, int index)
	{
		Select select=new Select(getElement(locator)); 
		select.selectByIndex(index);
	}
	
	public static void doSelectByvisibleText(By locator, String  visibletext)
	{
		
		Select select=new Select(getElement(locator));
		select.selectByVisibleText(visibletext);
	}
	public static void doSelectByvalue(By locator, String  value)
	{
		
		Select select=new Select(getElement(locator));
		select.selectByValue(value);
	}
}
