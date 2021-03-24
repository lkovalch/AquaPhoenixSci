package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class ReadProp {

	public static void main(String[] args) throws IOException {
		WebDriver driver;
		Properties prop =new Properties();
		
		FileInputStream fis = new FileInputStream ("C:\\Users\\lkovalchuk\\eclipse-workspace\\AquaPhoenixSci\\src\\main\\java\\resources\\data.properties");
		
		//Full path to file: ("C:\\Users\\lkovalchuk\\eclipse-workspace\\AquaPhoenixSci\\src\\main\\java\\resources\\data.properties")
		
		prop.load(fis);
		
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("url"));
		System.out.println(prop.getProperty("userid"));
		System.out.println(prop.getProperty("password"));
		
		String browser = prop.getProperty("browser");
		String url = prop.getProperty("url");
		String userid = prop.getProperty("userid");
		String password = prop.getProperty("password");
		
		
	}
	}


