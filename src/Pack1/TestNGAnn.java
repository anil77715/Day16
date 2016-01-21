package Pack1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGAnn {
	@BeforeClass
	public static void beforeclass() {
		System.out.println("Executing before class method");
	}

	@AfterClass
	public static void afterclass() {
		System.out.println("Executing after class method");
	}

	@BeforeMethod
	public void OpenBrowser() {
		System.out.println("Executing before method");
	}

	@AfterMethod
	public void closebrowser() {
		System.out.println("Executing after method");

	}

	@Test
	public void test1() {
		System.out.println("Executing test1 method");
	}

	@Test(enabled = false)
	public void test2() {
		System.out.println("Executing test2 method");
	}

	@Test
	public void test3() {
		System.out.println("Executing test3 method");
	}

}
