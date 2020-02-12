package br.com.rsinet.hub_BDD.Runner;

import java.io.File;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "feature/",
		glue = { "br.com.rsinet.hub_BDD.StepDefinition" },
		plugin = {"pretty", "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
		snippets = SnippetType.CAMELCASE,
		monochrome = true,
		dryRun = false)
public class TestRunner {
	
	@AfterClass
	public static void  writeExtentReport() {
		Reporter.loadXMLConfig(new File("Config/extent-config.xml"));
	}
}
