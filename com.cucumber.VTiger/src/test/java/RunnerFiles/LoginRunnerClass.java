package RunnerFiles;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {".\\src\\test\\java\\FeatureFiles\\Login.feature"},
		glue = "stepDefinitions",
		dryRun = false,
		plugin = {"pretty","html:Reports/report.html"}
//		snippets = CucumberOptions.SnippetType.CAMELCASE
		)

public class LoginRunnerClass extends AbstractTestNGCucumberTests{

}
