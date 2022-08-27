package testcases;

import java.util.function.Function;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.DriverFactory;
import utilities.TestBase;

public class FluentWaitExample extends TestBase {
	@Test
	public void fluentWaitMethod() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = DriverFactory.getInstance().getDriver();

		driver.get("https://www.snapdeal.com");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("return document.readyState").toString().equals("load");
		System.out.println("Done");

		new Function<String, Boolean>() {
			public Boolean apply(String s) {
				return true;
			}
		};
	}
}