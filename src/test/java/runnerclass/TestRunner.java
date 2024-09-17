package runnerclass;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//java//features",glue="stepdefinition",
plugin= {"pretty","html:Reports//Html_Report",
		"json:Reports//Json_Report.json",
		"com.cucumber.listener.ExtentCucumberFormatter:Reports/Extent_Report.html"
}
)



public class TestRunner {
	
	
	
	@BeforeClass
	public static void setUp() {
		
	}
	
	@AfterClass
	public static void tearDown() {
		
	}
}



