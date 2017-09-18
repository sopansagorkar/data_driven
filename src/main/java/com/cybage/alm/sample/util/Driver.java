package com.cybage.alm.sample.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {

	static WebDriver driver;

	public static WebDriver getDriver() {
		driver = new FirefoxDriver();
		return driver;
	}

	public static void closeDriver() {
		driver.close();
	}

}
