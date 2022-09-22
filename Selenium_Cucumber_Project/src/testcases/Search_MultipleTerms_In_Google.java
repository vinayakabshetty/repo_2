package testcases;

import org.testng.annotations.Test;

import pages.GoogleHomePage;
import utilities.DriverFactory;
import utilities.TestBase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;

public class Search_MultipleTerms_In_Google extends TestBase {

	@Test(dataProvider = "dp")
	public void search(String url) {
		WebDriver driver = DriverFactory.getInstance().getDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}

	@DataProvider(parallel = false)
	public Object[][] dp() {
		return new Object[][] { new Object[] { "https://www.google.com" }, new Object[] { "https://www.amazon.in" } };
	}
}
