package seleniumsessions;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//total links
//fetch the text of each link
//check link is valid /not broken
public class TotalLinks {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/");
	//List<WebElement>	linklist=driver.findElements(By.tagName("a"));
	//System.out.println(" Total links" + linklist.size());
	//for(int i=0;i<linklist.size();i++)
	//{
		//String text=linklist.get(i).getText();
		//System.out.println(text);
		//if(text.length()!=0)
		//{
		//System.out.println(text);
		//}
		
	//}
	//System.out.println("---------------");
	//for(WebElement e: linklist)
	//{
		
		//String text=e.getText();
		//System.out.println(text);
	//	if(text.length()!=0)
		//{
		//System.out.println(text);
		//}
	//}
	By links=By.tagName("a");
	By images=By.tagName("img");
	System.out.println("Total links =" +getElementCount(links));
	System.out.println("Total images =" +getElementCount(images));
	List<String> linksTextList= getElementsTextList(links);
	System.out.println(linksTextList);
	}
	
	
	public static List<WebElement> getElements(By locator)
	{
		return  driver.findElements(locator);
	}
	
	public static int  getElementCount(By locator)
	{
		return getElements(locator).size();
	}
	
	public static List<String> getElementsTextList(By locator)
	
	{
		List<WebElement> eleList=getElements(locator);
		System.out.println(eleList);
		List<String> eleTextList=new ArrayList<String>();
		
		
		for(WebElement e: eleList)
		{
		
		String text=e.getText();
		//System.out.println(text);
			if(text.length()!=0)
			{
				eleTextList.add(text);
			}
		}
		return eleTextList;
		
	}
	
	

}
