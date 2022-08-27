package testcases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pages.FileUploadPage;
import utilities.DriverFactory;
import utilities.TestBase;

public class UploadFile extends TestBase {

	@Test
	public void uploadUsingRobotClass() throws AWTException, InterruptedException {
		WebDriver driver = DriverFactory.getInstance().getDriver();
		driver.get("https://formy-project.herokuapp.com/fileupload");
		driver.manage().window().maximize();

		FileUploadPage fileUploadPage = new FileUploadPage(driver);
		new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.elementToBeClickable(fileUploadPage.chooseButton)).click();
		Thread.sleep(3000);
		StringSelection s = new StringSelection(
				"..\\src\\resources\\UploadFile.txt");

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_C);

		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_C);

		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);

		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(5000);
	}
}
