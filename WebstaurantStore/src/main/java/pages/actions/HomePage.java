package pages.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Page;
import pages.locators.HomePageLocators;

public class HomePage extends Page {
	
	public HomePageLocators home;
	
	public HomePage() {
		
		this.home = new HomePageLocators();
		PageFactory.initElements(driver, this.home);
	}
	
	public void searchProduct(String product) {
		
		home.searchBar.sendKeys("stainless work table");
		home.searchButton.click();
	}
}
