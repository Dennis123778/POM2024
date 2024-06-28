package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdownoptions {

	 static WebDriver driver;
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			driver=new ChromeDriver();
			driver.get("https://www.orangehrm.com/en/contact-sales");
			By country_select=By.id("Form_getForm_Country");
			
			By noofemp=By.id("Form_getForm_NoOfEmployees");
			
			List<String> countrylist=getDropdownoptionsTextlist(country_select);
			//System.out.println(countrylist);
			
			List<String> emplist=getDropdownoptionsTextlist(noofemp);
		//	System.out.println(emplist);
			By countryoptions=By.xpath("//select[@id='Form_getForm_Country']/option");
		
			selectValuefromDropdownwithoutselectclass(countryoptions,"India");
		}
		
		public static WebElement  getElement(By locator)
		
		{
			return driver.findElement(locator);
		}
		public static int getdropdownoptionscount(By locator)
		{
		
			Select select=new Select(driver.findElement(locator));
			return select.getOptions().size();
		}
		
		public static List<String> getDropdownoptionsTextlist(By locator)
		{
			Select select=new Select(getElement(locator));
			List<WebElement>	optionsList=select.getOptions();
			List<String>	optionsTextList=new ArrayList<String>();	
			
			
			for(WebElement e : optionsList)
			{
				String text=e.getText();
				optionsTextList.add(text);
			}
			
			return optionsTextList;
		}
		
		
		public static void selectValuefromDropdownwithoutselectclass(By locator, String optionsText)
		{
			List<WebElement> optionslist=driver.findElements(locator);
			for(WebElement e:optionslist)
			{
				String text=e.getText();
				
				if(text.equals(optionsText))
				{
					e.click();
					break;
				}
			}
		
		}
}


