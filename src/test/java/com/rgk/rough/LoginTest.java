package com.rgk.rough;

import com.rgk.base.Page;
import com.rgk.pages.HomePage;
import com.rgk.pages.LoginPage;
import com.rgk.pages.ZohoAppPage;
import com.rgk.pages.crm.accounts.AccountsPage;
import com.rgk.pages.crm.accounts.CreateAccountPage;

public class LoginTest {

	public static void main(String[] args) {

		HomePage home = new HomePage();
		LoginPage lp = home.goToLogin();
		ZohoAppPage zp = lp.doLogin("er.rohit.kathe@gmail.com", "Selenium@123");
		zp.goToCRM();
		AccountsPage account = Page.menu.goToAccounts();
		CreateAccountPage cap = account.goToCreateAccount();
		cap.createAccount("Rohit");
	
	}

}
