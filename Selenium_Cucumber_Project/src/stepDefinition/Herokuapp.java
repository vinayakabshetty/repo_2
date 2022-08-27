package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.HerokuappHomePage;
import pages.HerokuappWebFormHomePage;

public class Herokuapp {

	WebDriver driver;

	@Before
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	@After
	public void quitBrowser() {
		driver.quit();
	}

	@Given("I am in herokuapp home page")
	public void i_am_in_herokuapp_home_page() {
		HerokuappHomePage herokuappHomePage = new HerokuappHomePage(driver);
		driver.get("https://formy-project.herokuapp.com");
		boolean completeWebFormLink = herokuappHomePage.completeWebFormNavigationLink.isDisplayed();
		Assert.assertTrue(completeWebFormLink);
	}

	@And("I navigate to herokuapp webform page")
	public void i_navigate_to_herokuapp_webform_page() {
		HerokuappHomePage herokuappHomePage = new HerokuappHomePage(driver);
		herokuappHomePage.completeWebFormNavigationLink.click();

		HerokuappWebFormHomePage herokuappWebFormHomePage = new HerokuappWebFormHomePage(driver);

		new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.visibilityOf(herokuappWebFormHomePage.firstName));
		boolean webFormPage = herokuappWebFormHomePage.firstName.isDisplayed();
		Assert.assertTrue(webFormPage);
	}

	@When("I enter name in herokuapp webform page")
	public void i_enter_name_in_herokuapp_webform_page() {
		HerokuappWebFormHomePage herokuappWebFormHomePage = new HerokuappWebFormHomePage(driver);
		herokuappWebFormHomePage.firstName.sendKeys("SampleFirstName01");
	}

	@When("I select date in date field in herokuapp webform page")
	public void i_select_date_in_date_field_in_herokuapp_webform_page() {
		HerokuappWebFormHomePage herokuappWebFormHomePage = new HerokuappWebFormHomePage(driver);
		herokuappWebFormHomePage.date.sendKeys("22/08/2022");
		herokuappWebFormHomePage.date.sendKeys(Keys.ENTER);
	}

	@When("I click on submit button in herokuapp webform page")
	public void i_click_on_submit_button_in_herokuapp_webform_page() {
		HerokuappWebFormHomePage herokuappWebFormHomePage = new HerokuappWebFormHomePage(driver);
		herokuappWebFormHomePage.submitButton.click();
	}

	@Then("I get success message for webform submission")
	public void i_get_success_message_for_webform_submission() {
		HerokuappWebFormHomePage herokuappWebFormHomePage = new HerokuappWebFormHomePage(driver);
		new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.visibilityOf(herokuappWebFormHomePage.successMessage));
		String getMessage = herokuappWebFormHomePage.successMessage.getText().trim();
		Assert.assertTrue(getMessage.equalsIgnoreCase("The form was successfully submitted!"));
	}

	@When("I enter first name {string} in herokuapp webform page")
	public void i_enter_first_name_in_herokuapp_webform_page(String string) {
		HerokuappWebFormHomePage herokuappWebFormHomePage = new HerokuappWebFormHomePage(driver);
		herokuappWebFormHomePage.firstName.sendKeys("SampleFirstName01");
	}

	@When("I enter last name {string} in herokuapp webform page")
	public void i_enter_last_name_in_herokuapp_webform_page(String string) {
		HerokuappWebFormHomePage herokuappWebFormHomePage = new HerokuappWebFormHomePage(driver);
		herokuappWebFormHomePage.lastName.sendKeys("SampleLastName01");
	}

	@When("I select education level {string} in herokuapp webform page")
	public void i_select_education_level_in_herokuapp_webform_page(String string) {
		HerokuappWebFormHomePage herokuappWebFormHomePage = new HerokuappWebFormHomePage(driver);
		if (string.equalsIgnoreCase("College")) {
			herokuappWebFormHomePage.educationLevelHighSchool.click();
		} else if (string.equalsIgnoreCase("Grad School")) {
			herokuappWebFormHomePage.educationLevelGradStudent.click();
		}
	}

	@When("I select sex as {string} in herokuapp webform page")
	public void i_select_sex_in_herokuapp_webform_page(String sexFieldValue) {
		HerokuappWebFormHomePage herokuappWebFormHomePage = new HerokuappWebFormHomePage(driver);
		if (sexFieldValue.equalsIgnoreCase("Male")) {
			herokuappWebFormHomePage.sexRadioButtonMale.click();
		} else if (sexFieldValue.equalsIgnoreCase("Female")) {
			herokuappWebFormHomePage.sexRadioButtonFemale.click();
		}
	}

	@When("I select {string} years of experience in herokuapp webform page")
	public void i_select_years_of_experience_in_herokuapp_webform_page(String yearOfExp) {
		HerokuappWebFormHomePage herokuappWebFormHomePage = new HerokuappWebFormHomePage(driver);
		Select yearOfExperience = new Select(herokuappWebFormHomePage.yearsOfExperience);
		if (Integer.parseInt(yearOfExp)<2) {
			yearOfExperience.selectByIndex(0);
		} else if ((Integer.parseInt(yearOfExp)<4) && Integer.parseInt(yearOfExp)>1) {
			yearOfExperience.selectByIndex(1);
		}
	}

}