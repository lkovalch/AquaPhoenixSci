package resources;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MeasureLoadTime extends base{
	
	
	
	
	@BeforeTest
	public void initialize() throws IOException
	{
		driver =initializeDriver();
		driver.manage().deleteAllCookies();
	}
	
	@Test 
	public void performanceMeasure() 
	{

		long start=System.currentTimeMillis();
		
		driver.get("https://beta.kurita-elink.com/");  //TESTING URL
		
		new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.id("loginUsername")));
		//driver.get(prop.getProperty("url"));
		System.out.println("Site was successfully launched");
		
		long finish = System.currentTimeMillis();
		long totalTime = finish - start; 
		
		System.out.println("Page loading time is " +totalTime+ " milliseconds");
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
