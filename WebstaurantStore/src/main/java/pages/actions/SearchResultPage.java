package pages.actions;

import org.openqa.selenium.support.PageFactory;

import base.Page;
import pages.locators.SearchResultPageLocators;

public class SearchResultPage extends Page {

public SearchResultPageLocators search;
	
	public SearchResultPage() {
		
		this.search = new SearchResultPageLocators();
		PageFactory.initElements(driver, this.search);
	}
	
	public void clickLastPage(String product) {
		
		search.lastPage.click();
	}
}
