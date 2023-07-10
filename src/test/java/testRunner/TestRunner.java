package testRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features ="Features/Login.feature",
        glue = "stepDefinations",
        dryRun = false,   // cross check for each test step corresponding test method is created or not
        monochrome = true,   // remove unnecessary character from console window.
        plugin ={"pretty","html:target/cucumber-report.html"},
        tags = "@sanity or @regression"    // for running specific scenario
)
public class TestRunner {

}
