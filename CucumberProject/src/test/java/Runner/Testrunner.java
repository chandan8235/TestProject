package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features", glue = { "StepDefinations" }, monochrome = true, plugin = {
		"pretty", "json:target/JSONReport/report.json", "html:target/HTMLreport/reports",
		"junit:target/JUnitReport/report.xml", }

)

public class Testrunner {

}
