package com.qa.DDT;

import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;


@RunWith(Cucumber.class)
@CucumberOptions(
		features="D:\\Capgemini\\CAG.BDD.TestAutomation\\src\\test\\java\\com\\qa\\DDT\\AmazonDDT.feature",
		glue={"com.qa.DDT"},
		//dryRun=false,
		//strict=true,
		monochrome=true,
		plugin= {"pretty","json:target/cucumber.json",
				"json:target/MyReports/report.json",
				"json:target/cucumber.json",
		"junit:target/MyReports/report.xml"},
		publish=true
		)

public class AmazonDDTRunner extends AbstractTestNGCucumberTests{
	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {	        
		return super.scenarios();
	}


}
