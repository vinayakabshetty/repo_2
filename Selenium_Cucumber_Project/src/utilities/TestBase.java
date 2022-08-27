package utilities;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class TestBase extends BrowserFactory {

	@BeforeMethod
	@Parameters({"browserType"})
	public void setUpBrowser(String browserType) {
		browserSetUp(browserType);
	}

	@AfterMethod
	public void quitBrowser() {
		//DriverFactory.getInstance().getDriver().quit();
		DriverFactory.getInstance().removeThread();
	}
}