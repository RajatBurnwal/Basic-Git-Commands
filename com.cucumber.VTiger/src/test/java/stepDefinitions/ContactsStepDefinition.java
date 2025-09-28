package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContactsStepDefinition {

	WebDriver driver;
	
	@Given("User launches the browser and access the application")
	public void user_launches_the_browser_and_access_the_application() {
		driver=new ChromeDriver();
		driver.get("http://localhost:8888/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}
	
	@When("User enters valid username and password")
	public void user_enters_valid_username_and_password() {
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
	}
	
	@When("clicks on Login button")
	public void clicks_on_login_button() {
		driver.findElement(By.id("submitButton")).click();
	}
	
	@Then("Home Page should be displayed")
	public void home_page_should_be_displayed() {
		System.out.println("Home page is displayed");
	}
	
	@When("User clicks on Contacts option")
	public void user_clicks_on_contacts_option() {
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
	}
	
	@When("Performs sign out operation")
	public void performs_sign_out_operation() {
		WebElement accountsIcon = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		Actions act = new Actions(driver);
		act.moveToElement(accountsIcon).perform();
		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
	}
	
	@Then("login page should be displayed")
	public void login_page_should_be_displayed() {
		System.out.println("Login page is displayed");
	}

	@When("User clicks on Create New Contacts Icon")
	public void user_clicks_on_create_new_contacts_icon() {
		driver.findElement(By.xpath("//img[@title='Create Contact...']")).click();
	}
	
	@Then("Creating New Contacts page should be displayed")
	public void creating_new_contacts_page_should_be_displayed() {
		System.out.println("Creating new contact page is displayed");
	}
	
	@Then("closes the browser")
	public void closes_the_browser() {
	    driver.quit();
	}
	
	@When("user enters valid username {string} and password {string}")
	public void user_enters_valid_username_and_password(String username, String password) {
		driver.findElement(By.name("user_name")).sendKeys(username);
		driver.findElement(By.name("user_password")).sendKeys(password);
	}
}
