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
		driver.findElement(By.xpath("//span[@class='zicon-apps-crm zicon-apps-96']")).click();
		return new CRMHomePage();

	}

	public void goToChat() {
		driver.findElement(By.xpath("//span[@class='zicon-apps-chat zicon-apps-96']")).click();

	}
}
