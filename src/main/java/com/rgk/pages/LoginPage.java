package com.rgk.pages;

import com.rgk.base.Page;

public class LoginPage extends Page {

	// WebDriver driver;
	//
	// public LoginPage(WebDriver driver) {
	// this.driver = driver;
	// }

	public ZohoAppPage doLogin(String username, String password) {
		type("email_XPATH", username);
		type("password_XPATH", password);
		click("signinBtn_XPATH");
		click("closeBtn_XPATH");

		return new ZohoAppPage();
	}

}
