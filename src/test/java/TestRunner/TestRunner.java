package TestRunner;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import Utility.TestBase;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features = {"src/test/resource/Featuresss"} , 
plugin = {"json:target/cucumber.json"},
glue = "StepDefff")//tags= {"@kjhjk, @knmn,"})
public class TestRunner extends AbstractTestNGCucumberTests{
	
	@BeforeTest
	public void seetup() {
	TestBase test = new TestBase();
	test.initn();
		
	}
	@AfterTest
	public void closeApplication() {
		TestBase test = new TestBase();
		test.driver.quit();
	
		
	}
	
	
	
	

}
