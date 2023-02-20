package CW.CAP;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
 
//@RunWith(Cucumber.class)
@CucumberOptions(
		
		features="C:\\Users\\KITTU\\eclipse-workspace\\CAP2\\src\\test\\java\\Features\\login.feature",
		//dryRun=true,
		monochrome=true,
		//tags = "@smoke",
		plugin = {"pretty","html:target/cucumber-reports.html","json:target/cucumber.json"}
		)

public class Runner extends AbstractTestNGCucumberTests
{

}
