package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserUtil {
	WebDriver driver;
	public WebDriver  launchbrowser(String browsername)
	{
		System.out.println("thr browser name: "  + "" +  browsername);
		switch (browsername.trim().toLowerCase()) {
		case "chrome":
			driver= new ChromeDriver();			
			break;
		case "firefox":
			driver=new FirefoxDriver();
			break;
		case "Edge":
				driver= new ChromeDriver();
			break;

		default:
			System.out.println("Please pass the right browser" + browsername);
			throw new BrowserException("Invalid browser" + browsername);
			
		}
		return driver;
	}	
	
	public void LaunchURL(String URL)
	{
		if(URL==null)
		{
			throw new BrowserException("Invalid URL" + URL);
		}
		
		if(URL.isBlank() && URL.isEmpty())
		{
			throw new BrowserException("Blank & Empty URL" + URL);
		}
		if(URL.indexOf("http")!=0)
		{
			throw new BrowserException("http is missing" + URL);
		}
		driver.get(URL.trim());
	}
	
	public  String  getPageTitle()
	
	{
		String title= driver.getTitle();
		System.out.println(title);
		if(title==null)
		{
			System.out.println("title is null");
			return null;
		}
		
		return title;
	}
	
	public String  getPageCurrentUrl()
	{
		
		return driver.getCurrentUrl();
	}
	public void quitBrowser()
	{
		driver.quit();
	}
	
	public void closeBrowser()
	{
		driver.close();
	}

}
