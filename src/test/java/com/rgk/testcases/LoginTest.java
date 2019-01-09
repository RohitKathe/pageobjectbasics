package com.rgk.testcases;

import java.util.Hashtable;

import org.testng.annotations.Test;

import com.rgk.pages.HomePage;
import com.rgk.pages.LoginPage;
import com.rgk.utilities.Utilities;

public class LoginTest extends BaseTest {

	//Using EGIT plugin
	@Test(dataProviderClass=Utilities.class, dataProvider="dp")
	public void loginTest(Hashtable<String, String> data) {

		HomePage home = new HomePage();
		LoginPage lp = home.goToLogin();
		lp.doLogin(data.get("username"), data.get("password"));
	}
}
