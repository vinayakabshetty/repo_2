package utilities;

import org.openqa.selenium.WebDriver;

public class DriverFactory {

	private static final DriverFactory instance = new DriverFactory();

	public static DriverFactory getInstance() {
		return instance;
	}
	
	public static final ThreadLocal<WebDriver> threadLocal = new ThreadLocal<>();

	public void setDriver(WebDriver driver) {
		threadLocal.set(driver);
	}

	public WebDriver getDriver() {
		return threadLocal.get();
	}

	public void removeThread() {
		threadLocal.remove();
	}

}