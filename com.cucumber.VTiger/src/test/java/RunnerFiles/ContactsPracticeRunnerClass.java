package RunnerFiles;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {".\\src\\test\\java\\FeatureFiles\\Name.feature"},
		glue = {"stepDefinitions"},
		dryRun = true		
		
		)

public class ContactsPracticeRunnerClass extends AbstractTestNGCucumberTests {

}
