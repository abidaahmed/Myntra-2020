package MyntraRunnerr;

import java.io.File;

import org.testng.annotations.AfterClass;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features={"src/test/resources/Feature/Contact.Feature"},
glue={"MyntraStepDefination","MyntraUtilitiess"}, tags={"@Sprint1, @Auto1"},
 plugin = {"pretty", "html:target/cucumber-htmlreport",
"json:target/cucumber-jsonreport/cucumber-report.json",
"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"}, 
monochrome = true,
dryRun= false)


public class ContactRunner extends AbstractTestNGCucumberTests{
	
	@AfterClass
	public static void generateExtentReport(){
		Reporter.loadXMLConfig(new File("Config/config.xml"));
	}
	
   



}
