package StepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class tagged_Hooks_StepDef {
	
	@Given("This is first step")
	public void this_is_first_step() {
		System.out.println("First scenario from step definition");
	    
	}
	@When("This is second step")
	public void this_is_second_step() {
		System.out.println("Second scenario from step definition");
		
	}
	@Then("This is third step")
	public void this_is_third_step() {
		System.out.println("Third scenario from step definition");
	   
	}

}
