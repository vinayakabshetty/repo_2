package testcases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.GoogleHomePage;
import utilities.DriverFactory;
import utilities.TestBase;

public class Google extends TestBase {

	@Test
	public void navigateToHomePage() {
		WebDriver driver = DriverFactory.getInstance().getDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
	}	

	@Test
	public void search() throws InterruptedException {
		WebDriver driver = DriverFactory.getInstance().getDriver();
		GoogleHomePage googleHomePage = new GoogleHomePage(driver);
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.elementToBeClickable(googleHomePage.searchBar)).click();
		googleHomePage.searchBar.sendKeys("regression testing");
		googleHomePage.searchBar.sendKeys(Keys.ENTER);
		Thread.sleep(3000);

		List<WebElement> searchResults = googleHomePage.searchResults;
		Assert.assertTrue(searchResults.get(0).getText().trim()
				.equals("What is Regression Testing? Definition, Tools & Guide - Katalon"));
	}
}
