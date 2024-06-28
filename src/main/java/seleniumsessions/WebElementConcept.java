package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementConcept {
static	WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver	=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

	//driver.findElement(By.id("input-email")).sendKeys("demo.student");
	//	driver.findElement(By.id("input-password")).sendKeys("Ctu$0331");
//driver.findElement(By.name("Username"));
		//////////////////////////////////
		//By email_id=By.id("input-email");
		//By password=By.id("input-password");
		//WebElement emai=driver.findElement(email_id);
		//WebElement pass=driver.findElement(password);
		//emai.sendKeys("test");
		//pass.sendKeys("ndkjsa");
		////////////////////////////////3 approach////////
	//	By email_id=By.id("input-email");
		//By password=By.id("input-password");
		//getElement(email_id).sendKeys("test");
		//getElement(password).sendKeys("123");
		
		//4 approach
		
		By email_id=By.id("input-email");
		By password=By.id("input-password");
		
		//doSendKeys(email_id,"test");
		//doSendKeys(password,"test");
		ElementUtil ee= new ElementUtil(driver);
		//ee.doSendKeys(email_id,"test");
		//ee.doSendKeys(password,"test");
	}
	
	


}
