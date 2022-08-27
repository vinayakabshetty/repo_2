package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SnapdealHomePage {

	@FindBy(how = How.XPATH, using = "//button[@id='pushAllow']")
	public WebElement sendOffers_allow;

	@FindBy(how = How.XPATH, using = "//div[@class='banner-link bar']//div[@class='banner-item active']")
	public WebElement activeBannerSelection;

	@FindBy(how = How.XPATH, using = "//div[@class='banner-link bar']//preceding-sibling::div[@id='top-banner']//div[@class='banner-image platBanner banner-active shown']//a")
	public WebElement linkToActiveBannerDisplay;

	public void MSNPage(final WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
