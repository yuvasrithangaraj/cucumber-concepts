package StepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class background_StepDef {

	@Given("Student finished high school")
	public void student_finished_high_school() {
	   System.out.println("Student finished high school - 1");
	}
	@Given("Student finished higher secondary")
	public void student_finished_higher_secondary() {
	    System.out.println("Student finished higher secondary - 2 ");
	}
	
	@Given("Student applied for the medical course")
	public void student_applied_for_the_medical_course() {
		System.out.println("Student applied for the medical course");
	}
	@When("Student cleared the entrace exam")
	public void student_cleared_the_entrace_exam() {
		System.out.println("Student cleared the entrace exam");
	}
	@Then("student is eligible to join medical college")
	public void student_is_eligible_to_join_medical_college() {
		System.out.println("student is eligible to join medical college");
	}

	@Given("Student applied for the engineering course")
	public void student_applied_for_the_engineering_course() {
		System.out.println("Student applied for the engineering course");
	}
	@When("Student should have cut off")
	public void student_should_have_cut_off() {
		System.out.println("Student should have cut off");
	}
	@Then("student is eligible to join engineering college")
	public void student_is_eligible_to_join_engineering_college() {
		System.out.println("student is eligible to join engineering college");
	}


}
