package StepDef;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.time.Duration;

public class loginStepDefWithData {
	
	WebDriver driver;

	@Given("user is on the login page")
	public void user_is_on_the_login_page() {
		
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();	
	   
	}
	@When("user enters username as {string} and password as {string}")
	public void user_enters_username_as_and_password_as(String user, String pass) {
	   

		driver.findElement(By.xpath("//*[@name='username']")).sendKeys(user);
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys(pass);

	}
	@When("user clicks on the login button")
	public void user_clicks_on_the_login_button() {
	   
		driver.findElement(By.xpath("//*[@type='submit']")).click();
	}
	@Then("user logged in successfully")
	public void user_logged_in_successfully() {
	   
		boolean status = driver.findElement(By.xpath("(//*[text()='Dashboard'])[2]")).isDisplayed();
		Assert.assertTrue("login failed", status); // it will only print when the test fails
		driver.quit();
	
	}	
}
