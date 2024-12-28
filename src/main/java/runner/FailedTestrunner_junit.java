package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features ={"@target/failed.txt"},
		glue = {"com.stepdefinitions"},
		dryRun=false,
		plugin={"pretty", "html:target/cuucmber-reports/cucumber-reports.html",
				"json:target/cuucmber-reports/cucumber-reports.json",
				"junit:target/cuucmber-reports/cucumber-reports.xml"},
		tags = ("@reg or @sanity"),
		monochrome=true
		
		)

public class FailedTestrunner_junit {

}
