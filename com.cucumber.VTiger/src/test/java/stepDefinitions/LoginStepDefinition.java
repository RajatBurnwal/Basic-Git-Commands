package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {

	WebDriver driver;
	
	@Then("close the browser")
	public void close_the_browser() {
	    driver.close();
	    
	}
	
	@Given("User launches the browser")
	public void user_launches_the_browser() {
		
	   driver = BaseClass.getDriver();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   driver.manage().window().maximize();
	   
	}
	
	@Given("Access the application")
	public void access_the_application() {
	    
		driver.get("http://localhost:8888/");
		
	}
	
	@When("User enter valid username and password")
	public void user_enter_valid_username_and_password() {
	    
		driver.findElement(By.xpath("//input[@name='user_nam']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
		
	}
	@When("click on Login button")
	public void click_on_login_button() {
	    
		driver.findElement(By.id("submitButton")).click();
		
	}
	
	@Then("Home page should be displayed")
	public void home_page_should_be_displayed() {
	    
		System.out.println("Home page is displayed");
		
	}
}
