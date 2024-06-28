package testngsessions;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testNGAnnotations {
	
	@BeforeSuite
	public void connectwithDB()
	{
		System.out.println("test NG");
	}
	
	@Test
	public void connectuser()
	{
		System.out.println("test NG--create user");
	}
	
	@Test
	public void connecttestuser()
	{
		System.out.println("after NG--create user");
	}


}
