package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pageobject.POOrangehrm.OrangeHRMreporitorys;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import testcases.LoginOrangeHRM;

public class StepDefinations extends LoginOrangeHRM {
            
	By username = By.xpath("//input[@name = 'txtUsername']");
	By password = By.cssSelector("input[id = 'txtPassword']");
	By Login = By.name("Submit");
	// OrangeHRMreporitorys or = new OrangeHRMreporitorys(driver);
	 public WebDriver driver;
	 public  static void driver_initialization() {
		 WebDriver driver = new ChromeDriver();
	 }
	 @Given("^User navigates to \"([^\"]*)\" on  chrome browser$")
	    public void user_navigates_to_something_on_chrome_browser(String strArg1) throws Throwable {
	         driver.get(strArg1);
	    }

	@When("^user enters username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
	public void user_enters_username_as_and_password_as(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		  driver.findElement(username).sendKeys(arg1);
		  driver.findElement(password).sendKeys(arg2);
	}

	@When("^click on login button$")
	public void click_on_login_button() throws Throwable {
	     driver.findElement(Login).click();
	    
	}

	@Then("^validate user able to login successfully\\.$")
	public void validate_user_able_to_login_successfully() throws Throwable {
	    System.out.println("The login is successfull");
	     
	}
	
}
