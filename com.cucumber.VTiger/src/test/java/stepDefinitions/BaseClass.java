package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	public static WebDriver driver;
	
	public static WebDriver getDriver()
	{
		driver=new ChromeDriver();
		return driver;
	}
}
