package Header_Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class LocatorManager {
	static Properties pr = new Properties();
	static {
		FileInputStream f = null;
		try {
			f = new FileInputStream("C:\\Users\\govin\\eclipse-workspace\\Devops_Heroku_Maven\\src\\test\\resources\\Xpath.properties");
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		
		
		try {
			pr.load(f);
		}
		catch (java.io.IOException e) {
			e.printStackTrace();
		}
		
	}
	public String getXpath(String name) {
		return pr.getProperty(name);
	}
}