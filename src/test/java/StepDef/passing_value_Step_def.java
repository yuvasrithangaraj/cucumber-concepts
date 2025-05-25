package StepDef;

import io.cucumber.java.en.Given;

public class passing_value_Step_def {

	@Given("I have {int} laptop")
	public void i_have_laptop(Integer count) {
		System.out.println("I have " +count + " laptop");
	    
	}
	@Given("I have a {double} CGPA")
	public void i_have_a_cgpa(Double cgpa) {
		System.out.println("I have scored "+cgpa );
	    
	}
	@Given("{string} is elder to {string} and {string}")
	public void is_elder_to_and(String name, String name2, String name3) {
	   System.out.println(name +" is an angel, " + name2 +" is a scene, " + name3 +" is cute");
	}


}
