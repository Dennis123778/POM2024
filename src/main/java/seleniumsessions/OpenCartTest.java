package seleniumsessions;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class OpenCartTest {

	public static void main(String[] args) {
		
		ReadProperties rp=new ReadProperties();
		Properties prop=rp.intiprop();


		String browser="firefox";
		
		BrowserUtil brutil=new BrowserUtil();
	WebDriver  driver=	brutil.launchbrowser(prop.getProperty("browser").trim());
	brutil.LaunchURL(prop.getProperty("url")); 
	String actutitle=brutil.getPageTitle();
	System.out.println(actutitle);
	//System.out.println("sree.." + actutitle);
	
	if(actutitle.equals("Google"))
	{
		System.out.println("title is correct");
		
	}
	else
	{
		System.out.println("title is incorrect");
		
	}
	

	String appurl=brutil.getPageCurrentUrl();
	System.out.println(appurl);

	
	
	
	}

}
