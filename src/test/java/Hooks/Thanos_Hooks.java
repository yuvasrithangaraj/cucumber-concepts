package Hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Thanos_Hooks {
	
	@Before(order = 1) // second priority for @Before
	public void beforeSnapping() {
		System.out.println("Thanos is collecting infinity stones");
	}
	
	@After(order = 1) // first priority for @After
	public void afterSnapping() {
		System.out.println("After killing, he is taking rest at garden");
	}

	@Before(order = 0) // first priority for @Before
	public void beforeScenario() {
		System.out.println("Thanos has to be born first");
	}
	
	@After (order = 0) // second priority for @After
	public void afterScenario() {
		System.out.println("Finally Thanos is also died");
	}
}
