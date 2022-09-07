package testcases;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.GoogleHomePage;
import utilities.DriverFactory;
import utilities.TestBase;

public class HighlightHtmlElement extends TestBase {
	@Test
	public void highlight() throws InterruptedException {
		WebDriver driver = DriverFactory.getInstance().getDriver();
		driver.get("https://www.google.com");
		GoogleHomePage googleHomePage = new GoogleHomePage(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		for (int i = 0; i <= 10; i++) {
			js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');", googleHomePage.searchBar);
			js.executeScript("arguments[0].setAttribute('style', 'border: none');", googleHomePage.searchBar);
			Thread.sleep(1000);
		}
	}
}
