package cucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

//provide the feature and stepDefinition location
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features", //both feature and glue should have same parent
		glue = "stepDefinitions")   //gluse should have the package name
		
public class TestRunner {

}
