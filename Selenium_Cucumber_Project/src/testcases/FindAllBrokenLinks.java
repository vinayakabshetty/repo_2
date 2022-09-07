package testcases;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pages.GoogleHomePage;
import utilities.DriverFactory;
import utilities.TestBase;

public class FindAllBrokenLinks extends TestBase {

	@Test
	public void brokenLinks() throws IOException {
		WebDriver driver = DriverFactory.getInstance().getDriver();
		driver.get("https://www.google.com");
		GoogleHomePage googleHomePage = new GoogleHomePage(driver);
		List<WebElement> allLinksInPage = googleHomePage.allLinks;

		for (WebElement link : allLinksInPage) {
			testLink(new URL(link.getAttribute("href")));
		}
	}

	public void testLink(URL url) throws IOException {
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		con.setConnectTimeout(10000);
		con.connect();
		if (con.getResponseCode() < 400) {
			System.out.println(url + " is a Good link");
		} else {
			System.out.println(url + " is a Bad link");
		}
	}
}
