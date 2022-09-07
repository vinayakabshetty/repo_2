package testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import utilities.DriverFactory;
import utilities.TestBase;

public class Amazon extends TestBase {
	
	@Test(enabled=false)
	public void navigateToHomePage() {
		WebDriver driver = DriverFactory.getInstance().getDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
	}
}
