package com.adactin.runner;

import java.io.IOException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import com.adactin.baseclass.BaseClass;
import com.adactin.helper.ConfigurationReader;
import com.adactin.helper.FileReaderManager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/com/adactin/feature", 
					glue = "com\\adactin\\stepdefinition",
					plugin = {//"pretty","html:Report/CucumberReport",
							 //"json:Report/Cucumber.json",
							  "com.cucumber.listener.ExtentCucumberFormatter:Report/CucumberExtentReport.html"},
					//tags = {"@SmokeTest"},
					monochrome = true,
					dryRun = false,
					strict = true
					)

public class TestRunner {

	public static WebDriver driver;

	@BeforeClass
	public static void setUp() throws IOException {
		// ConfigurationReader cr = new ConfigurationReader();
		// String browsername = cr.getBrowserName();
		String browserName = FileReaderManager.getFrmInstance().grtCrInstance().getBrowserName();
		driver = BaseClass.getBrowser(browserName);
	}

	@AfterClass
	public static void tearDown() {
		driver.close();
	}
}
