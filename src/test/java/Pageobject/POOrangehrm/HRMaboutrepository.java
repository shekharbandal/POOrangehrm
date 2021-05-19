package Pageobject.POOrangehrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class HRMaboutrepository {

	 WebDriver driver;
	By Welcome = By.id("welcome"); 
	By about = By.id("aboutDisplayLink");
	
	public HRMaboutrepository(WebDriver driver) {
		 this.driver = driver;
		 PageFactory.initElements(driver, this);
	}
	
	public WebElement welcome_admin() 
	{
		return driver.findElement(Welcome);
		  
	}
	public WebElement about_option()
	{
		return driver.findElement(about);
	}
	
	
	
	
}
