package com.rgk.base;

import org.openqa.selenium.WebDriver;

import com.rgk.pages.crm.accounts.AccountsPage;

public class TopMenu {

	/*
	 * HomePage has a TopMenu Accounts page HASA TopMenu Encapsulation takes
	 * place
	 * 
	 */

	WebDriver driver;

	public TopMenu(WebDriver driver) {
		this.driver = driver;
	}

	public void goToHome() {

	}

	public void goToLeads() {

	}

	public AccountsPage goToAccounts() {
		Page.click("accountsTab_CSS");
		return new AccountsPage();
	}

	public void goToContacts() {

	}

	public void signOut() {

	}
}
