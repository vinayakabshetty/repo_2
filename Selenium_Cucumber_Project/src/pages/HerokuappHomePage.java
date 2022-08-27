package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HerokuappHomePage {
	@FindBy(how = How.LINK_TEXT, using = "Complete Web Form")
	public WebElement completeWebFormNavigationLink;

	public HerokuappHomePage(final WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
