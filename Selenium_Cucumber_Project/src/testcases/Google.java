package testcases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import pages.GoogleHomePage;
import utilities.DriverFactory;
import utilities.Extent;
import utilities.FunctionLibrary;
import utilities.TestBase;

public class Google extends TestBase {

	@Ignore
	@Test
	public void navigateToHomePage() {
		Extent.startTest("Navigate to google home page");
		WebDriver driver = DriverFactory.getInstance().getDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		FunctionLibrary.scrollDownPage();
		Extent.testPass();
		Extent.endTest();
	}

	@Test
	public void search() throws InterruptedException {
		Extent.startTest("Search something in google");
		WebDriver driver = DriverFactory.getInstance().getDriver();
		GoogleHomePage googleHomePage = new GoogleHomePage(driver);
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.elementToBeClickable(googleHomePage.searchBar)).click();
		googleHomePage.searchBar.sendKeys("regression testing");
		googleHomePage.searchBar.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		Extent.testFail();
		List<WebElement> searchResults = googleHomePage.searchResults;
		Assert.assertTrue(searchResults.get(0).getText().trim()
				.equals("What is Regression Testing? Test Cases (Example) - Guru99"));
		FunctionLibrary.scrollDownPage();
		Extent.endTest();
	}
}
