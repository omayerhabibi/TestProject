package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultPageLocators {

	@FindBy(xpath = "//div[@class='pagination pagination--unified centered']//a[contains(text(),'9')]")
	public WebElement lastPage;
	
}
