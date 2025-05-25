package StepDef;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class orange_StepDef {

	WebDriver driver;

	@Given("user is on login page")
	public void user_is_on_login_page() {

		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();	
		
	}
	@When("user enters username and password")
	public void user_enters_username_and_password() {

		driver.findElement(By.xpath("//*[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("admin123");

	}
	@When("user clicks login button")
	public void user_clicks_login_button() {

		driver.findElement(By.xpath("//*[@type='submit']")).click();
	}
	@Then("Login is successful")
	public void login_is_successful() throws IOException {

		boolean status = driver.findElement(By.xpath("(//*[text()='Dashboard'])[2]")).isDisplayed();
		Assert.assertTrue("login failed", status); // it will only print when the test fails
		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File srcSS = new File("./screenshots/img.png");
		FileHandler.copy(srcFile, srcSS);

		driver.quit();
		
	}

}


