package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
		features= {"src\\test\\resources\\features\\HotelSearch.feature"},
		glue ={"com.stepdefinitions","Hooks"},
		dryRun=false,
		plugin={"pretty", "html:target/cuucmber-reports/cucumber-reports.html",
				"json:target/cuucmber-reports/cucumber-reports.json",
				"junit:target/cuucmber-reports/cucumber-reports.xml",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		        "rerun:target/failed.txt"},
		

		tags = ("@reg or @sanity"),

		monochrome=true
		
		
		)



public class TestRunnerJunit {

}
