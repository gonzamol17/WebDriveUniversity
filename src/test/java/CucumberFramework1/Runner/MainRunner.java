package CucumberFramework1.Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;

    @RunWith(Cucumber.class)

    @CucumberOptions(
            features = {"src/test/java/CucumberFramework1/Features/"},
            glue = {"stepsDefinition"},
            monochrome = true,
            //tags = {},
            plugin = {"pretty", "html:target/cucumber","json:target/cucumber.json", "com.cucumber.listener.ExtentCucumberFormatter:target/report.html"}
    )

    public class MainRunner extends AbstractTestNGCucumberTests {
    }


