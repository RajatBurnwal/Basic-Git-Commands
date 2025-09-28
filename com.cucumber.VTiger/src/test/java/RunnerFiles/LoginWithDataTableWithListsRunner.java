package RunnerFiles;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {".\\src\\test\\java\\FeatureFiles\\LoginWithDataTableAsLists.feature"},
		glue = "stepDefinitions",
		dryRun=false
		)

public class LoginWithDataTableWithListsRunner extends AbstractTestNGCucumberTests{

}
