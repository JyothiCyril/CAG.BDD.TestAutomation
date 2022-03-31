package com.qa.testrunner;

import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;



@RunWith(Cucumber.class)
@CucumberOptions(
		features={"D:\\Capgemini\\CAG.BDD.TestAutomation\\src\\test\\java\\com\\qa\\features\\Amazon.feature"},
		glue={"com.qa.Amazon"},		
		monochrome=true,
		//format = {"pretty","html:test-output"},
		//tags= "@SmokeTest",
		plugin= {"pretty","json:target/MyReports/report.json",
				"json:target/cucumber.json",
		"junit:target/MyReports/report.xml"},
		publish=true


		)

public class TestRunner extends AbstractTestNGCucumberTests {
	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
		return super.scenarios();
	}

}
