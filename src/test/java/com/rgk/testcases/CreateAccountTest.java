package com.rgk.testcases;

import java.util.Hashtable;

import org.testng.annotations.Test;

import com.rgk.base.Page;
import com.rgk.pages.ZohoAppPage;
import com.rgk.pages.crm.accounts.AccountsPage;
import com.rgk.pages.crm.accounts.CreateAccountPage;
import com.rgk.utilities.Utilities;

public class CreateAccountTest {

	
	//i have added new comment here
	@Test(dataProviderClass = Utilities.class, dataProvider = "dp")
	public void createAccountTest(Hashtable<String, String> data) {
		ZohoAppPage zp = new ZohoAppPage();
		zp.goToCRM();
		AccountsPage account = Page.menu.goToAccounts();
		CreateAccountPage cap = account.goToCreateAccount();
		cap.createAccount(data.get("accountname"));
	}
}
