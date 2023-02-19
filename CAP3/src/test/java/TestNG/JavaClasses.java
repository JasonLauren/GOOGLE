package TestNG;

import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

@Test
public class JavaClasses 
{
	@Given("^print1$")
	public void print1()
	{
		System.out.println("Print1");
	}
	@Then("^print2$")
	public void print2()
	{
		System.out.println("Print2");
	}

}
