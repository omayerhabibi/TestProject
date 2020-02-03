package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageLocators {

	@FindBy(xpath = "//input[@id='searchval']")
	public WebElement searchBar;
	@FindBy(xpath = "//button[@class='btn btn-info banner-search-btn']")
	public WebElement searchButton;
	
}
