package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HerokuappWebFormHomePage {

	@FindBy(how = How.XPATH, using = "//input[@id='first-name']")
	public WebElement firstName;

	@FindBy(how = How.ID, using = "last-name")
	public WebElement lastName;

	@FindBy(how = How.ID, using = "radio-button-1")
	public WebElement educationLevelHighSchool;
	
	@FindBy(how = How.ID, using = "radio-button-3")
	public WebElement educationLevelGradStudent;

	@FindBy(how = How.ID, using = "checkbox-1")
	public WebElement sexRadioButtonMale;

	@FindBy(how = How.ID, using = "checkbox-2")
	public WebElement sexRadioButtonFemale;

	@FindBy(how = How.ID, using = "select-menu")
	public WebElement yearsOfExperience;

	@FindBy(how = How.ID, using = "datepicker")
	public WebElement date;

	@FindBy(how = How.LINK_TEXT, using = "Submit")
	public WebElement submitButton;

	@FindBy(how = How.XPATH, using = "//div[contains(text(),'The form was successfully submitted!')]")
	public WebElement successMessage;

	public HerokuappWebFormHomePage(final WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}