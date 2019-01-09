package com.rgk.utilities;

import java.io.File;

import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;

public class ExtentManager {

	public static ExtentReports extent;

	public static ExtentReports getInstance() {
		if (extent == null) {
			// use display order constructor for below
			// generate and store in htm folder of surefire-reports
			extent = new ExtentReports(System.getProperty("user.dir") + "\\target\\surefire-reports\\html\\extent.html",
					true, DisplayOrder.OLDEST_FIRST);
			extent.loadConfig(new File(
					System.getProperty("user.dir") + "\\src\\test\\resources\\com\\rgk\\extentconfig\\ReportsConfig.xml"));
		}
		return extent;
	}
}
