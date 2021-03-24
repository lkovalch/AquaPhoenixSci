package ESR;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import resources.base;

public class MultipleSitesLogin extends base {
	
	WebDriver driver;
	
	@BeforeTest
	public void initialize() throws IOException
	{
	
				
				driver =initializeDriver();
	
	}
	
	@Test(dataProvider="data-provider")
	public void multipleSites(String url) throws InterruptedException 
	{
		driver.get(url);
		System.out.println(url);
		new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.id("loginUsername")));
		
		driver.findElement(By.id("loginUsername")).sendKeys("Masterchief");
		driver.findElement(By.id("loginPassword")).sendKeys("Bl4ck0ut#");
		driver.findElement(By.xpath(".//button[@type='submit']"));
		
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='menuprofile']/div[2]")).click();
		
		driver.findElement(By.xpath("//div[@class='profile-usermenu']/ul/li[7]")).click();
	
	}
		
		//System.out.println("Page successfully loaded for "+ url);
		
		/*String currentUrld = driver.getCurrentUrl();
		if (url.equalsIgnoreCase(currentUrld)) {
			
			System.out.println("The "+ url + "landed on the correct page");
		}
		else System.out.println("Something is wrong with "+ url + "Please check it!");
	}*/
	
		
	@AfterTest
	public void teardown () {
		driver.close();
	}
	
		

@DataProvider(name ="data-provider")
public Object[][] urldataProviderMethod() {
return new Object[][] { 
	 { "https://aquavyp.tech/" }, 
	 { "https://www.aswcreports.com/" },
	 { "https://auto.eservicereport.com/"}, 
	 {"https://www.mhwtec-reports.com/"},
	 {"https://www.miuracanadasolutions.com/"},
	 {"https://www.mwtreports.com/"},
	 {"https://www.myawcwaterreports.com/"},
	 {"https://www.myscireports.com/"},
	 {"https://www.myswtreports.com/"},
	 {"https://www.mywtsreports.com/"},
	 {"https://www.nashchemreports.com/"},
	 {"https://www.nwsreports.com/"},
	 {"https://www.xelera-eservice.com/"},
	 {"https://www.zeeclientportal.com/"}};
	 }}



