package stepDefinitions;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginWithDataTableAsMaps {

	WebDriver driver;

	@Given("user lunches the browser and access the application")
	public void user_lunches_the_browser_and_access_the_application() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://localhost:8888/");
	}
	@When("user pass valid credentials as below")
	public void user_pass_valid_credentials_as_below(DataTable dataTable) {
		List<Map<String, String>> credential = dataTable.asMaps(String.class, String.class);
		String username = credential.get(0).get("username");
		String password = credential.get(0).get("password");
		driver.findElement(By.name("user_name")).sendKeys(username);
		driver.findElement(By.name("user_password")).sendKeys(password);
	}
	@When("clicking on Login button")
	public void clicking_on_login_button() {
		driver.findElement(By.id("submitButton")).click();
	}
	@Then("home page has to be displayed")
	public void home_page_has_to_be_displayed() {
		System.out.println("Home page is displayed");
	}
}
