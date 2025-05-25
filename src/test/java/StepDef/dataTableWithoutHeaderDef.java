package StepDef;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import java.time.Duration;

public class dataTableWithoutHeaderDef {

	WebDriver driver;

	@Given("you are on the login page")
	public void you_are_on_the_login_page() {

		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();	

	}
	@When("you enter the below credentials")
	public void you_enter_the_below_credentials(DataTable dataTable) {

		//		if data table is like this,|Admin | admin123| then we should use
		//		List<List<String>> and asLists as it is consider this as 2 columns & 1 row
		//		
		//		if data table is like,
		//		|Admin |
		//		|admin123 |
		//		then we should use List<String> and asList as it is consider this as 1 column & 2 row

		//		Use asMaps() when DataTable has a header row (like "username" and "password").
		//		Use asLists() when DataTable doesn't have headers (just plain rows and columns).


		List<List<String>> credentials = dataTable.asLists(String.class);
		// dataTable as list & data type value is string and storing in list of string

		String username = credentials.get(0).get(0); // indicating index value 
		String password = credentials.get(0).get(1); // 1st(0) is username & 2nd(1) is password

		driver.findElement(By.xpath("//*[@name='username']")).sendKeys(username);
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys(password);
	}
	@When("you click on the login button")
	public void you_click_on_the_login_button() {

		driver.findElement(By.xpath("//*[@type='submit']")).click();
		driver.quit();

	}

}


