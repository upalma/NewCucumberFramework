package testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features    = "/Users/palmauzzal/PraticeBDDCucumber/src/main/java/features/Login.feature"
        , glue        = {"stepDefinitions"}
        //, dryRun      = true
       // , monochrome  = true
        ,plugin = {"pretty", "html:TestResult"}
)

public class TestRunnerFile { }
