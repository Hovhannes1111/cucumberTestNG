package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = {"src/test/java/features"},plugin = {"json:target/cucumber.json","html:target/site/cucumber-pretty"})
public class TestRunner extends AbstractTestNGCucumberTests {

}
