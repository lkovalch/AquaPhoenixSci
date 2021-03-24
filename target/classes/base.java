package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class base {

	public static WebDriver driver;
	public Properties prop;


	// ************** The purpose of this class: Browser initialization, Taking screenshots ******************

	public WebDriver initializeDriver () throws IOException
	{
		prop= new Properties();
		FileInputStream fis=new FileInputStream ("C:\\Users\\lkovalchuk\\eclipse-workspace\\E2EProject1\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		try {
			fis = new FileInputStream ("C:\\Users\\lkovalchuk\\eclipse-workspace\\AquaPhoenixSCi\\src\\main\\java\\resources\\data.properties");
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		prop.load(fis);

		String browserName =prop.getProperty("browser");


		if(browserName.contains("chrome"))	//if browser is CHROME
		{
			System.setProperty("webdriver.chrome.driver", "C://work//browsers//chromedriver.exe"); 
			driver = new ChromeDriver();
			
		}
		
		else if (browserName.contains("headless")) {    //HEADLESS CHROME
			ChromeOptions option = new ChromeOptions();
			option.addArguments("headless"); 	
			driver= new ChromeDriver(option);}

		else if (browserName.equals("firefox")) 													//if browser is FIREFOX
		{
			System.setProperty("webdriver.gecko.driver", "C:/work/geckodriver.exe");
			driver= new FirefoxDriver();
			//DesiredCapabilities capabilities = DesiredCapabilities.firefox();
			//capabilities.setCapability("marionette",true);
			//driver= new FirefoxDriver(capabilities);
			}
		return driver;
	}
	public String getUrl () throws IOException {
		
		prop= new Properties();
		FileInputStream fis=new FileInputStream ("C:\\Users\\lkovalchuk\\eclipse-workspace\\AquaPhoenixSci\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		try {
			fis = new FileInputStream ("C:\\Users\\lkovalchuk\\eclipse-workspace\\AquaPhoenixSci\\src\\main\\java\\resources\\data.properties");
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		prop.load(fis);
		
	
		System.out.println(prop.getProperty("url"));
	
		String url = prop.getProperty("url").toString();
		
		return url;
		
	}
	public String useridProp () throws IOException {
	
		prop= new Properties();
		FileInputStream fis=new FileInputStream ("C:\\Users\\lkovalchuk\\eclipse-workspace\\AquaPhoenixSci\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		try {
			fis = new FileInputStream ("C:\\Users\\lkovalchuk\\eclipse-workspace\\AquaPhoenixSci\\src\\main\\java\\resources\\data.properties");
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		prop.load(fis);
		
	
		System.out.println(prop.getProperty("userid"));
		
		String userid = prop.getProperty("userid").toString();
		return userid;
	}
	
	public String passProp () throws IOException {
		
		prop= new Properties();
		FileInputStream fis=new FileInputStream ("C:\\Users\\lkovalchuk\\eclipse-workspace\\AquaPhoenixSci\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		try {
			fis = new FileInputStream ("C:\\Users\\lkovalchuk\\eclipse-workspace\\AquaPhoenixSci\\src\\main\\java\\resources\\data.properties");
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		prop.load(fis);
	
		String password = prop.getProperty("password").toString();
		System.out.println(prop.getProperty("password"));
		return password;
	}

	public void getScreenshots(String result) throws IOException {
		// TODO Auto-generated method stub
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\lkovalchuk\\eclipse-workspace\\E2EProject1\\src\\main\\java\\resources\\Screenshots"+result+"screenshot.png"));

	}

// *************************************************** NOTES ***********************************************
	//Remove hard coded part
	//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir"));
	//To run headless chrome: create option object and add argument "headless. add two lines
	//ChromeOptions option = new ChtomeOptions();
	//option.addArguments("headless"); and pass "option" object into driver= new ChromeDriver(option);	 
}
