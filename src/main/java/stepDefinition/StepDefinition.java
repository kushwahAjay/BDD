package stepDefinition;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features="feature" , glue="stepDefinition")
public class StepDefinition extends AbstractTestNGCucumberTests{

}
