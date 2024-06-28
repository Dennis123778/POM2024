package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginTest {

	public static void main(String[] args) {
		
		BrowserUtil bul=new BrowserUtil();
		WebDriver driver=bul.launchbrowser("chrome");
				
		bul.LaunchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		// TODO Auto-generated method stub
		System.out.println(bul.getPageTitle());
		System.out.println(bul.getPageCurrentUrl());
		By email_id=By.id("input-email");
		By password=By.id("input-password");
		ElementUtil ee= new ElementUtil(driver);
	//	ee.doSendKeys(email_id,"test");
		//ee.doSendKeys(password,"test");
	}

}
