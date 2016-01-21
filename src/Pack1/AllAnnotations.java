package Pack1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AllAnnotations {
	@BeforeSuite
	public void beforesuite() {
		System.out.println("Executing Beforesuite method");
	}

	@AfterSuite
	public void aftersuite() {
		System.out.println("Executing AfterSuite method");
	}

	@BeforeTest
	public void beforetest() {
		System.out.println("Executing beforetest");
	}

	@AfterTest
	public void aftertest() {
		System.out.println("Executing aftertest");
	}

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
