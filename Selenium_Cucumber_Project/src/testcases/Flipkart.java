package testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import utilities.DriverFactory;
import utilities.TestBase;

public class Flipkart extends TestBase {
	
	@Test
	public void navigateToHomePage() {
		WebDriver driver = DriverFactory.getInstance().getDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
	}
}
