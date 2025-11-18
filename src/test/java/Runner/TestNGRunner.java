package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//monochrome = true: to display the output in plain english
//AbstractTestNGCucumberTests: A class where the exact logics are present

@CucumberOptions(features = "src/test/java/Feature", glue={"StepDefinitions"}, monochrome=true )
public class TestNGRunner extends AbstractTestNGCucumberTests {

}
