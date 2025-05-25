package StepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.time.Duration;

public class practice {
	
	WebDriver driver;
	
	@Given("n is on the login page")
	public void n_is_on_the_login_page() {
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	    
	}
	@When("n enters the {string} and {string}")
	public void n_enters_the_and(String user, String pass) {
		driver.findElement(By.xpath("//*[@name='username']")).sendKeys(user);
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys(pass);
	}


	@Then("n logging in or not")
	public void n_logging_in_or_not() {
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		driver.quit();
	}




}
