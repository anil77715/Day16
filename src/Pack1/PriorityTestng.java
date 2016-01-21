package Pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PriorityTestng {
	WebDriver driver;

	@BeforeMethod
	public void openBrowser() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}

	@Test
	public void google() {
		driver.get("http://google.com");
	}

	@Test(dependsOnMethods = "google")
	public void gmail() {
		driver.get("http://gmail.com");
	}

	@Test(priority = 2)
	public void quikr() {
		driver.get("http://quikr.com");
	}

	@Test(priority = 1)
	public void carwale() {
		driver.get("http://carwale.com");
	}

}
