package junit_examples;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class A {
	@Test
	public void test1() {
		System.out.println("From Test1");
	}
	@Test
	public void test2() {
		System.out.println("From Test2");
	}
	@Before
	public void beforeTest() {
		System.out.println("Before Test");
	}
	@After
	public void afterTest() {
		System.out.println("After Test");
		
	}
}
