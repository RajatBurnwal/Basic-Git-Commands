package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginWithScenarioOutline {
	
	WebDriver driver;
	
	@Given("User launch the browsers and opens the application")
	public void user_launch_the_browsers_and_opens_the_application() {
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    driver.get("http://localhost:8888/");
	}
	@When("user enters valid usernames {string} and password {string}")
	public void user_enters_valid_usernames_and_password(String username, String password) {
		driver.findElement(By.name("user_name")).sendKeys(username);
		driver.findElement(By.name("user_password")).sendKeys(password);
	}
	@When("clicks on Login buttons")
	public void clicks_on_login_buttons() {
		driver.findElement(By.id("submitButton")).click();
	}
	@Then("home page should be displayed")
	public void home_page_should_be_displayed() {
	    System.out.println("Home page is displayed");
	}
}
