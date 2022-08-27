package cucumberRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src/feature", glue = {
		"stepDefinition" }, monochrome = true, plugin = "html:.\\test-output\\cucumber reports\\cucumberHtmlReport.html", dryRun = false, tags = "@SmokeTest and not @RegressionTest")
public class TestRunner {

}