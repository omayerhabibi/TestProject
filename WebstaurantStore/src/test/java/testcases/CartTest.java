package testcases;

import base.Page;
import pages.actions.HomePage;

public class CartTest {

	public static void main (String[] args) {
		
		Page.initConfiguration();
		HomePage home = new HomePage();
		home.searchProduct("stainless work table");
		
	}
}
