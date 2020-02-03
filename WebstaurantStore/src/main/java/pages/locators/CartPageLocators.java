package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPageLocators {

	@FindBy(xpath = "//a[@class='emptyCartButton btn btn-mini btn-ui pull-right']")
	public WebElement emptyCart;
	@FindBy(xpath = "//button[contains(text(),'Empty Cart')]")
	public WebElement confirmEmpty;
}
