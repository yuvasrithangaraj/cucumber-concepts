package StepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Thanos_StepDef_Hooks {

	@Given("Thanos has the infinity stone")
	public void thanos_has_the_infinity_stone() {
	    
		System.out.println("Thanos has the infinity stone");
	}
	@When("he snaps his fingers")
	public void he_snaps_his_fingers() {
	   
		System.out.println("he snaps his fingers");
	}
	@Then("half of the living things died")
	public void half_of_the_living_things_died() {
	 
		System.out.println("half of the living things died");
		
	}



	
}
