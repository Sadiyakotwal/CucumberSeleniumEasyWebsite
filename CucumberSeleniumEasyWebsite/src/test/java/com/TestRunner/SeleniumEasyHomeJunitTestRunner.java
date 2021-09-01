package com.TestRunner;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features ="src/test/resources/Features",
	tags="@SmokeTest",
	//dryRun = false,
	//dryRun = true;
	monochrome = true,
	glue= {"StepDefinitions"})

public class SeleniumEasyHomeJunitTestRunner 
{
		
}
