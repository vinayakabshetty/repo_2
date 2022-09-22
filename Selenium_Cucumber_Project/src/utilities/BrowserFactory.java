package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.InvalidPropertiesFormatException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserFactory {

	Properties prop = new Properties();

	public void browserSetUp(String browserType) throws InvalidPropertiesFormatException, IOException {
		if (browserType.equalsIgnoreCase("chrome")) {

			WebDriverManager.chromedriver().setup();

			FileInputStream fis = new FileInputStream(
					new File("..\\Selenium_Cucumber_Project\\src\\configuration\\ChromeBrowserConfigiration.xml"));
			prop.loadFromXML(fis);

			if (prop.getProperty("loadChromeOptions").equalsIgnoreCase("True")) {
				ChromeOptions opt = new ChromeOptions();
				opt.addArguments(prop.getProperty("chromeBrowserConfigurationFromUser"));
				DriverFactory.getInstance().setDriver(new ChromeDriver(opt));
			} else {
				DriverFactory.getInstance().setDriver(new ChromeDriver());
			}

			fis.close();

		} else if (browserType.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			DriverFactory.getInstance().setDriver(new FirefoxDriver());
		} else if (browserType.equalsIgnoreCase("internet explorer")) {
			WebDriverManager.iedriver().setup();
			DriverFactory.getInstance().setDriver(new InternetExplorerDriver());
		}
	}
}