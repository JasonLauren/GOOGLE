package CW.CAP;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AppTest2 
{
	
	public WebDriver driver;
	@Given("^opens chrome and enter the link$")
	public void opens_chrome_and_enter_the_link() throws InterruptedException
	{
		Thread.sleep(3000);
		System.out.println("Hello");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\KITTU\\eclipse-workspace\\CAP2\\chromedriver.exe");
		// DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		//capabilities.setCapability("marionette", true);
		driver= new ChromeDriver();
		System.out.println("chrome opened");
		driver.get("https://ui.cogmento.com");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		System.out.println("method 1 finished");
		System.out.println("user entered login page");
		//driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
		Thread.sleep(1000);
	}
	
	@When("^entres crdntls$")
	public void entres_crdntls() throws InterruptedException
	{
				
		try
		{	
			driver.findElement(By.xpath("//input[@name='email' and @type='text']")).sendKeys("madasukrishna22@gmail.com");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@name='password' and @type='password']")).sendKeys("Jason/2079");
			driver.findElement(By.xpath("//div[contains(text(),'Login') and @class='ui fluid large blue submit button']")).click();
			
		}
		catch(Exception ex)
		{
			System.out.println(ex.getStackTrace());
		}
		
	}
	@Then("^quit driver$")
	public void quit_driver() throws InterruptedException
	{	
		
		driver.close();
		driver.quit();
		System.out.println("Class finished: Brower closed");

	}
}
