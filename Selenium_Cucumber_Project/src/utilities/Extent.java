package utilities;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Extent {
	private static final ExtentReports report = new ExtentReports();
	private static ExtentTest test = null;

	@Test
	public static void startTest(String testName) {
		test = report.createTest(testName);
	}

	@Test
	public static void testPass() {
		test.log(Status.PASS, "Test Passed");
		test.addScreenCaptureFromPath("C:\\Users\\vb4\\Pictures\\Saved Pictures\\Pass.jpg");
	}

	@Test
	public static void testFail() {
		test.log(Status.FAIL, "Test Failed");
		test.addScreenCaptureFromPath("C:\\Users\\vb4\\Pictures\\Saved Pictures\\Fail.jpg");
	}

	@Test
	public static void testInfo() {
		test.log(Status.SKIP, "Test Skipped");
	}

	@Test
	public static void testSkip() {
		test.log(Status.INFO, "Test Info");
	}

	@Test
	public static void endTest() {
		ExtentSparkReporter destination = new ExtentSparkReporter(".\\test-output\\ExtentReports\\report.html");
		report.attachReporter(destination);
		report.flush();
	}
}
