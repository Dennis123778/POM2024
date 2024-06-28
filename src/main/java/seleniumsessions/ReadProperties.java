package seleniumsessions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {
	
	Properties pp;
	public Properties intiprop(){
		
		try {
			FileInputStream ip=new FileInputStream("./src/main/java/Config/config.properties");
			pp=new Properties();
			pp.load(ip);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return pp;
		
	}

}
