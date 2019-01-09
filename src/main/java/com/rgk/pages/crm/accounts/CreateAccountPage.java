package com.rgk.pages.crm.accounts;

import com.rgk.base.Page;

public class CreateAccountPage extends Page {

	public void createAccount(String accountName) {
		type("accountNameTxt_CSS", accountName);
	}

}
