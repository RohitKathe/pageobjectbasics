package com.rgk.pages.crm.accounts;

import com.rgk.base.Page;

public class AccountsPage extends Page {

	public CreateAccountPage goToCreateAccount() {
		click("createAccountBtn_XPATH");
		return new CreateAccountPage();
	}

	public void goToImportAccounts() {

	}
}
