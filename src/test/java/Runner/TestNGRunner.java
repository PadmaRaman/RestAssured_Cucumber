package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//monochrome = true: to display the output in plain english
//AbstractTestNGCucumberTests: A class where the exact logics are present

@CucumberOptions(features = "src/test/java/Feature", dryRun = true,
        glue = {"StepDefinitions"},
        monochrome = true, tags="@Smoke or @Regression",
        plugin= {"pretty", "html:target/cucumber_reports/cucumber.html", "json:target/cucumber_reports/cucumber.json"})
public class TestNGRunner extends AbstractTestNGCucumberTests {

}
