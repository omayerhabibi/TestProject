package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LastResultPageLocators {

	@FindBy(xpath = "//form[@id='product_60_1664DD5E-F1E2-DFD2-2FAF6997AE85D031']//input[@name='addToCartButton']")
	public WebElement addToCart;
	@FindBy(xpath = "//button[@name='addToCartButton']")
	public WebElement confirmAdd;
	@FindBy(xpath = "//span[contains(text(),'Cart')]")
	public WebElement goToCart;
}
