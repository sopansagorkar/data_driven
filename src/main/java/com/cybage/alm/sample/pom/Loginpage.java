package com.cybage.alm.sample.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.cybage.alm.sample.buildata.LoginData;
import com.cybage.alm.sample.util.Driver;

public class Loginpage extends Driver {

	WebDriver driver;

	
	public void signin(LoginData data) {

		driver = Driver.getDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.name("userName")).sendKeys(data.getUserName());
		driver.findElement(By.name("password")).sendKeys(data.getPassowrd());
		driver.findElement(By.name("login")).click();
	}
}
