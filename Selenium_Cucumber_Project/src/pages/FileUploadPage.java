package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class FileUploadPage {
	// Locators
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Choose')]")
	public WebElement chooseButton;

	public FileUploadPage(final WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
