package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class FunctionLibrary extends TestBase {

	public static void scrollDownPage() {
		WebDriver driver = DriverFactory.getInstance().getDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2000)", "");
		System.out.println("Scrolling down");
	}

	public static void scrollUpPage() {
		WebDriver driver = DriverFactory.getInstance().getDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-2000)", "");
		System.out.println("Scrolling up");
	}
}