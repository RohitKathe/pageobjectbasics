package com.rgk.pages;

import org.openqa.selenium.By;

import com.rgk.base.Page;
import com.rgk.pages.crm.CRMHomePage;

public class ZohoAppPage extends Page {

	// WebDriver driver;
	//
	// public ZohoAppPage(WebDriver driver) {
	// this.driver = driver;
	// }

	public CRMHomePage goToCRM() {
		click("crmLink_XPATH");
		return new CRMHomePage();

	}

	public void goToChat() {
		click("chatLink_XPATH");
		

	}
}
