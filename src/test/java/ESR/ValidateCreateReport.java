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

public class ValidateCreateReport  extends base {
	
	WebDriver driver;
	
	
	public void initialize() throws IOException
	{
		driver =initializeDriver();
		
	}}
	
	/*@Test
	public void multipleSites(String url) 
	{
		driver.get("https://qa4.eservicereport.com");
	
		/*sap.selectClient().click();
		sap.addClient().click();
		sap.selectCustomer().click();
		sap.addCustomer().click();
		
		
	}}*/
	
		
		
		
	/*@AfterTest
	public void teardown()
		{
			driver.close();
			driver=null;
			//driver.quit();
		}
		}
*/


