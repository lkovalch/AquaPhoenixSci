package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//rahulonlinetutor@gmail.com
public class ShowAllPage {

	
	public WebDriver driver;
	
	By clientDropDown=By.cssSelector("div.dropdown.toper.menu1");
	By addClient=By.cssSelector("#A1");
	By editClient=By.cssSelector("#A2");
	By deleteClient=By.cssSelector("#A3");
	
	By customerDropDown=By.cssSelector("div.dropdown.toper.menu2");
	By addCustomer = By.cssSelector("#A4");
	By editCustomer = By.cssSelector("#A5");
	By deleteCustomer = By.cssSelector("#A6");
	
	
	
	public ShowAllPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		
	}
	// Classes to work with CLIENT drop down
	
	public WebElement selectClient()
	{
		return driver.findElement(clientDropDown);
	}
	
	public WebElement addClient()
	{
		return driver.findElement(addClient);
	}
	public WebElement editClient()
	{
		return driver.findElement(editClient);
	}
	public WebElement deleteClient()
	{
		return driver.findElement(deleteClient);
	}
		 
	public WebElement selectCustomer()
	{
		return driver.findElement(customerDropDown);
		
	}
	public WebElement addCustomer()
	{
		return driver.findElement(addCustomer);
		
	}
	
	}
	
	
	

