package StepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import java.time.Duration;

public class dataTableWithExampleDef {
	
	WebDriver driver;

	@Given("hy is on the login page")
	public void hy_is_on_the_login_page() {
	    
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
	}
	@When("hy enter the username {string} and password {string}")
	public void hy_enter_the_username_and_password(String username, String password) {
	   
		driver.findElement(By.xpath("//*[@name='username']")).sendKeys(username);
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys(password);
		
	}
	@When("hy clicks on the login button")
	public void hy_clicks_on_the_login_button() {
		
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		driver.quit();
	    
	}
	
}
