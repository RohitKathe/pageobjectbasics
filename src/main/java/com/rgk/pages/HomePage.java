package com.rgk.pages;

import org.openqa.selenium.By;

import com.rgk.base.Page;

public class HomePage extends Page {

	// WebDriver driver;
	//
	// public HomePage(WebDriver driver) {
	// this.driver = driver;
	// }

	public void goToSupport() {
		driver.findElement(By.xpath("//div[@class='zh-user-account']/a[@href='https://help.zoho.com/portal/home']"))
				.click();
	}

	public void goToSignUp() {
		driver.findElement(By.xpath("//a[@href='signup.html']")).click();
	}

	public LoginPage goToLogin() {
		click("loginLink_CSS");
		return new LoginPage();
	}

	public void validateFooterLinks() {
		driver.findElement(By.xpath("//span[@class='zlang-text']"));
		driver.findElement(By.xpath("//li[@class='comlink zcurrentdomain']/a[@href='https://www.zoho.com/']")).click();
		;
	}
}
