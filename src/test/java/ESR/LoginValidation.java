package ESR;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.WebDriver;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import resources.base;

public class LoginValidation extends base {

	WebDriver driver;
	Properties prop;
	LoginPage lp = new LoginPage(driver);
	
	public static Logger log =LogManager.getLogger(base.class.getName());
	

	@BeforeTest
	public void initialize() throws IOException
	{
		driver =initializeDriver();
		driver.manage().deleteAllCookies();
		
	}
	
	@Test
	public void validatingUserCanLogin ( ) throws InterruptedException, Exception 
	{
		//Launch URL listed in data.properties file
		driver.get(getUrl());
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		
		System.out.println("URL is correct and site is launched");
	
		lp.getUserid().click();
		lp.getUserid().sendKeys(useridProp());
		System.out.println("user ID is provided");
		
		//WebElement email = driver.findElement(By.id("loginUsername"));  // HARDCODED
		
		//getUserid().sendKeys(prop.getProperty("userid"));
		lp.getPassword().sendKeys(prop.getProperty("password"));
		lp.getSubmit().click();
		
		  }
	

		
	/*	WebElement pass = driver.findElement(By.id("loginPassword"));
		pass.click();
		pass.sendKeys("Bl4ck0ut#");
		System.out.println("user password is provided"); 
		//log.info(text);
		
		driver.findElement(By.xpath(".//button[@type='submit']")).click();
		
					//User click on Sign in button
		System.out.println("User clicked on Sign in button)");
		
		 Thread.sleep(6000);
		
		System.out.println(driver.getTitle());
		
	//	driver.findElement(By.id("treports")).click();  							//REPORTS
		
	
		 Thread.sleep(3000);
		 
		 driver.findElement(By.id("top")).click(); // CLIENT
		 driver.findElement(By.xpath(".//a[@id='menu2']")).click();
			 Thread.sleep(3000);	
			driver.findElement(By.xpath(".//*[@class='scrollInside']/li[2]")).click();
			 Thread.sleep(3000);
			 
		driver.findElement(By.xpath("//*[@id='menuprofile']/div[2]")).click(); //Admin button
		driver.findElement(By.xpath(".//div[@class='profile-usermenu']ul/li[7]")); //LOG OUT
		
	
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		
	}
		
		//String errorMessage=lp.getAlert().getText();
		//Assert.assertEquals("Invalid email or password.", errorMessage);
		//System.out.println(errorMessage);
	
	//*[@id="profileMenu"]/div[4]/ul/li[7]
			

	
		
	/*@Test
	public void forgotPassword () {
		
		lp.forgotPassword().click();
		System.out.println("User clicked on Forgot password link");
	}
	*/

	@AfterTest
	public void teardown()
	{
		
	
		driver.close();
	
		
	}

	
	/*@DataProvider
	public Object[][] getData()
	{
		// Row stands for how many different data types test should run
		//coloumn stands for how many values per each test
		
		// Array size is 2
		// 0,1
		Object[][] data=new Object[2][3];
		//0th row
		data[0][0]="masterchief";
		data[0][1]="Bl4ck0ut#";
		data[0][2]="Authorized User";
		//1st row
		data[1][0]="masterchief";
		data[1][1]="Likalika1";
		data[1][2]= "Restricted User";
		
		return data;
		
	
		
	}*/
	
}
