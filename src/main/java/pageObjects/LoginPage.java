package pageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginPage {

	
	public WebDriver driver;
	
	By userID=By.id("loginUsername");
	By password=By.id("loginPassword");
	By signIn=By.cssSelector("[type='submit']");
	By forgotPassword = By.cssSelector("[href*='password/new']");
	
	
		public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub

	this.driver=driver;
	}

	public WebElement getUserid() {
		
	return driver.findElement(userID);
	
	}

	public WebElement getPassword() {
	return driver.findElement(password);
	}

	public WebElement getSubmit() {
	return driver.findElement(signIn);
	}	

	public WebElement forgotPassword() {
		return driver.findElement(forgotPassword);
	}
	
	public String getInvalidLoginAlertText() {
		
		return driver.findElement(forgotPassword).getText();
	}



	public void readUrl(CharSequence url) {
		// TODO Auto-generated method stub
		
	}
	
	
}
