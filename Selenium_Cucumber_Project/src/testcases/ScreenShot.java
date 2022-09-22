package testcases;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import utilities.DriverFactory;
import utilities.TestBase;

public class ScreenShot extends TestBase {
	@Test(enabled=true)
	public void visibleScreen() throws IOException {
		WebDriver driver = DriverFactory.getInstance().getDriver();
		driver.get("https://www.snapdeal.com");
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File(".\\src\\screenshots\\test.jpg"));
	}

	@Test
	public void fullScreen() throws IOException {
		WebDriver driver = DriverFactory.getInstance().getDriver();
		driver.get("https://www.snapdeal.com");

		Screenshot s = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
		ImageIO.write(s.getImage(), "PNG", new File(".\\src\\screenshots\\test2.jpg"));
	}
}
