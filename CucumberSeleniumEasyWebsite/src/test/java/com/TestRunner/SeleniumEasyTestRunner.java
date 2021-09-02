package com.TestRunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(plugin = { "pretty", "html:target/Cucumber-ReportsHTML/HTML" ,
		"json:target/JSon/Cucumber.json" }, 
	features ="src/test/resources/Features",
	//tags= {"@SmokeTest", "@DummyTest3","@DummyTest1","@DummyTest2"},
	tags="@DummyTest2",
	//dryRun = false,
	//dryRun = true,
	monochrome = true,
	strict = true,
	glue= {"StepDefinitions"})
public class SeleniumEasyTestRunner extends AbstractTestNGCucumberTests{

}
