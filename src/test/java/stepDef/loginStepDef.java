package stepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginStepDef {
        
	WebDriver driver;
	
	@Given("user is on the login page") //same as Login.feature page
	public void user_is_on_the_login_page() {
	    driver = new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	}

	@When("user enter {string} username")
	public void user_enter_the_username(String username) {
	   driver.findElement(By.id("email")).sendKeys(username);
	}

	@When("user enter {string} password")
	public void user_enter_the_password(String password) {
	    driver.findElement(By.name("pass")).sendKeys(password);
	}

	@When("user click on login button")
	public void user_click_on_button() {
	    driver.findElement(By.name("login")).click();;
	}

	@Then("user should be logged in successfully")
	public void user_should_be_logged_in_successfully() {
	   System.out.println("loggged in successfully");
	   driver.close();
	}
	
	
	//sce 2: 
	@Then("user should not be allowed to log in")
	public void user_should_not_be_allowed_to_log_in() {
		driver.close();
	}
	
	//regular expression
	@When("^user enters (.+) and (.+)$")
	public void entercre(String username,String password) {
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.name("pass")).sendKeys(password);
	}
	
}
