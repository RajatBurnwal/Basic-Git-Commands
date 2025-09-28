package stepDefinitions;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.google.common.io.Files;

import genericUtility.ExtentReportUtility;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
	
	ExtentReportUtility exUtil;
	
	@Before
	public void method1()
	{
		exUtil=new ExtentReportUtility();
		exUtil.createReport();
	}
	
	@After
	public void method2(Scenario scenario) throws IOException
	{
		if(scenario.isFailed())
		{
			TakesScreenshot ts=(TakesScreenshot)BaseClass.driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File dest = new File(".\\Screenshots\\image.png");
			Files.copy(src, dest);
		}
		exUtil.flushReport();
	}

}
