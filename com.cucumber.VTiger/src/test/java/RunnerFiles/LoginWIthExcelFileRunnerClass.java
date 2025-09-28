package RunnerFiles;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {".\\src\\test\\java\\FeatureFiles\\LoginWithExcelFile.feature"},
		glue = "stepDefinitions",
		dryRun=false
		)

public class LoginWIthExcelFileRunnerClass extends AbstractTestNGCucumberTests{

}
