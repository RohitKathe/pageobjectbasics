package com.rgk.testcases;

import org.testng.annotations.AfterSuite;

import com.rgk.base.Page;

public class BaseTest {

	@AfterSuite
	public void tearDown() {
		Page.quit();
	}
}
