package com.test.xlsx;

import java.util.ArrayList;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.cybage.alm.sample.buildata.LoginData;
import com.cybage.alm.sample.pom.Loginpage;
import com.cybage.alm.sample.util.Driver;
import com.test.selenium.GetData;

public class SampleTest {
	LoginData ld;
	ArrayList<LoginData> ldList;

	@BeforeTest
	public void setUp() {
		ld = new LoginData();
		ldList = GetData.getData(ld);

	}

	@Test
	public void loginTest() {
		Loginpage lp = new Loginpage();
		for (LoginData loginData : ldList) {
			lp.signin(loginData);
		}
	}

	@AfterTest
	public void tearDown() {
		Driver.closeDriver();

	}

}
