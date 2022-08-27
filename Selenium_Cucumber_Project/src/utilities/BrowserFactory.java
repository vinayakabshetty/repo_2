package utilities;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserFactory {
	
	public void browserSetUp(String browserType) {
		if (browserType.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			DriverFactory.getInstance().setDriver(new ChromeDriver());	
		} else if (browserType.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			DriverFactory.getInstance().setDriver(new FirefoxDriver());
		} else if (browserType.equalsIgnoreCase("internet explorer")) {
			WebDriverManager.iedriver().setup();
			DriverFactory.getInstance().setDriver(new InternetExplorerDriver());
		}
	}
}