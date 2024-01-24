package cucumber.Options;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/Features/Hello.feature",glue = {"StepDefinations"},tags= "@addplace")
public class TestRunner {
	
	
	

}
