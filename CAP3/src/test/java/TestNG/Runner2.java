package TestNG;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
 
//@RunWith(Cucumber.class)
@CucumberOptions(
		
		features="C:\\Users\\KITTU\\eclipse-workspace\\CAP2\\src\\test\\java\\TestNG\\testNG.feature",
		dryRun=false,
		monochrome=true,
		glue= {"JavaClasses"},
		plugin = {"pretty","html:target/cucumber-reports.html","json:target/cucumber.json"}
		)

public class Runner2 extends AbstractTestNGCucumberTests {

}
