package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class GoogleHomePage {

	// Locators
	@FindBy(how = How.XPATH, using = "//input[@title='Search']")
	public WebElement searchBar;
	
	@FindBy(how = How.XPATH, using = "//a//h3")
	public List<WebElement> searchResults;
	
	@FindBy(how = How.XPATH, using = "//a")
	public List<WebElement> allLinks;
	
	public GoogleHomePage(final WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
