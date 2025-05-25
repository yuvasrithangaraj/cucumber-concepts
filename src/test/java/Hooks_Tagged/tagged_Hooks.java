package Hooks_Tagged;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class tagged_Hooks {
	
	@Before
	public void defaultbefore() {
		System.out.println("Default before that runs before every scenario");
	}
	@After
	public void defaultafter() {
		System.out.println("Default after that runs before every scenario");
	}
	@Before("@First")
	public void before1() {
		System.out.println("before first");
	}
	@Before("@Second")
	public void before2() {
		System.out.println("before second");
	}
	@Before("@Third")
	public void before3() {
		System.out.println("before third");
	}
	@After("@First")
	public void after1() {
		System.out.println("after first");
	}
	@After("@Second")
	public void after2() {
		System.out.println("after second");
	}
	@After("@Third")
	public void after3() {
		System.out.println("after third");
	}
	
}
