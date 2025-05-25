package StepDef;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import java.time.Duration;

public class dataTableWithHeaderDef {

	WebDriver driver;

	@Given("cat is on the login page")
	public void cat_is_on_the_login_page() {

		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();	

	}
	@When("cat enter the below credentials")
	public void cat_enter_the_below_credentials(DataTable dataTable) {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
		// Map<K, List<V>>. E,K,V must be a String, Integer, Float,
		// Double, Byte, Short, Long, BigInteger or BigDecimal.
		//
		// For other transformations you can register a DataTableType.

		//		Use asMaps() when DataTable has a header row (like "username" and "password").
		//		Use asLists() when DataTable doesn't have headers (just plain rows and columns).


		List<Map<String,String>> keyValue = dataTable.asMaps(String.class, String.class);
		String user = keyValue.get(0).get("username");	
		String pass = keyValue.get(0).get("password");

		driver.findElement(By.xpath("//*[@name='username']")).sendKeys(user);
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys(pass);


	}
	@When("cat click on the login button")
	public void cat_click_on_the_login_button() {

		driver.findElement(By.xpath("//*[@type='submit']")).click();
		driver.quit();
	}

}
