package test;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

public class Testrunner {

	@RunWith(Cucumber.class)
	@CucumberOptions(features = "src/Feature/Facebook-Login.feature", glue = { "Feature" }, tags = { "tag" }, plugin = {
			"pretty", "html:target/cucumber-html-report" })

	public class Testrun {

	}

}
