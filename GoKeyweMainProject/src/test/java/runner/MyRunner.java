package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features", 
dryRun = false
,glue= {"stepdefinitions","hooks"}
)
public class MyRunner {

	
}

