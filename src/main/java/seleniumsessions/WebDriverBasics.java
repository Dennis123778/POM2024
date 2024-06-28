package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		
		WebDriver dr=new ChromeDriver();
	//String s=	dr.getCurrentUrl();
		String z1=	dr.getTitle();
		System.out.println(z1);
	dr.get("https://www.google.com");
	String s=	dr.getCurrentUrl();
	System.out.println(s);
	dr.quit();
	
	WebDriver dr1=new ChromeDriver();
	String s1=	dr1.getCurrentUrl();
	System.out.println(s1);
	dr1.close();
		
		// TODO Auto-generated method stub

	}

}
