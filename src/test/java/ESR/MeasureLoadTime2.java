package ESR;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import resources.base;

public class MeasureLoadTime2 extends base{
	
	@DataProvider(name = "data-provider")
	 public Object[][] urldataProviderMethod() {
	 return new Object[][] { 
		 { "https://beta.kurita-elink.com/" },  // Kurita before merge
		 { "https://alpha2.eservicereport.com/" }, // Fremont before merge -?????
		 { "https://beta3.kurita-elink.com/" },  // MERGED 
		 { "https://qa4.eservicereport.com" }, 
		 { "https://qa1.eservicereport.com/"} 
		 };
	    }
	
	
	@BeforeTest
	public void initialize() throws IOException
	{
		driver =initializeDriver();
		driver.manage().deleteAllCookies();
	}
	
	@Test (dataProvider = "data-provider") 
	public void performanceMeasure(String url) 
	{

		long start=System.currentTimeMillis();
		
		driver.get(url);  //TESTING URL
		
		new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.id("loginUsername")));
	
		System.out.println("Site was successfully launched");
		
		long finish = System.currentTimeMillis();
		long totalTime = finish - start; 
		
		System.out.println("Page loading time for" +url+ "is " +totalTime+ " milliseconds");
	}
	
		
	@AfterTest
	public void teardown()
	{
		
		//
		//driver.quit();
		driver.close();
		//driver=null;
		
	}

	
}
