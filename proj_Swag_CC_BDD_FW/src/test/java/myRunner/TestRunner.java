package myRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features ="C:\\JavaNewWorkSpace\\proj_Swag_CC_BDD_FW\\src\\test\\java\\features\\End2End.feature", //the path of the feature files
		glue={"stepDefinitions"}, 		//the path of the step definition files
		format= {"pretty","html:test-outout","junit:junit_xml/cucumber.xml"}, 		//to generate different types of reporting
		monochrome = true, 	//display the console output in a proper readable format
		strict = true, 		//it will check if any step is not defined in step definition file
		dryRun = false		//to check the mapping is proper between feature file and step Definitions file
		//tags = {"~@SmokeTest" , "~@RegressionTest", "~@End2End"}			
		)

//ORed : tags = {"@SmokeTest , @RegressionTest"} -- execute all tests tagged as @SmokeTest OR @RegressionTest
//ANDed : tags = tags = {"@SmokeTest" , "@RegressionTest"} -- execute all tests tagged as @SmokeTest AND @RegressionTest
 
public class TestRunner {
 
}

