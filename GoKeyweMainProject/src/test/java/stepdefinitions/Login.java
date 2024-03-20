package stepdefinitions;

import org.openqa.selenium.By;

import baseclass.BaseClass;
import io.cucumber.java.en.*;


public class Login extends BaseClass {
	

	@Given("User navigates to login page")
	public void user_navigates_to_login_page() {
	
		
//		driver = new ChromeDriver();
		//driver.get("https://stage.testrunz.com/");
		System.out.println("User enters into the applications");
				
	}

	@When("User enters the valid email address {string} and valid password {string}")
	public void user_enters_the_valid_email_address_and_valid_password(String Email, String Password) {
		driver.findElement(By.id("email")).sendKeys(Email);
		driver.findElement(By.id("password")).sendKeys(Password);
		
	}

	@When("User clicks on the login button")
	public void user_clicks_on_the_login_button() throws InterruptedException {

		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		Thread.sleep(2000);
	
	}


	@When("User enters the invalid email address {string} and invalid password {string}")
	public void user_enters_the_invalid_email_address_and_invalid_password(String Email, String Password) {
		driver.findElement(By.id("email")).sendKeys(Email);
		driver.findElement(By.id("password")).sendKeys(Password);
	}

	@When("User enters the valid email address {string} and invalid password {string}")
	public void user_enters_the_valid_email_address_and_invalid_password(String Email, String Password) {
		driver.findElement(By.id("email")).sendKeys(Email);
		driver.findElement(By.id("password")).sendKeys(Password);
	}



	@When("User enters the invalid email address {string} and valid password {string}")
	public void user_enters_the_invalid_email_address_and_valid_password(String Email, String Password) {
		driver.findElement(By.id("email")).sendKeys(Email);
		driver.findElement(By.id("password")).sendKeys(Password);
	}

}
