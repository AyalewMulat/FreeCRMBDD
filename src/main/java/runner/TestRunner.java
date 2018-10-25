package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
	features="C:\\Users\\ayalt\\eclipse-workspace\\FreeCRMBDDFramework\\src\\main\\java\\Features",	
		glue= {"stepDefinitions"}
		//format= {"pretty","total:html:test-output"}
				
		)


public class TestRunner {
	
	

}
