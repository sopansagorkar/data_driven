package com.test.selenium;

import java.util.ArrayList;

import com.cybage.alm.sample.buildata.LoginData;

public class GetData extends LoginData{

	public static ArrayList<LoginData> getData(LoginData ld) {
		ArrayList<LoginData> arrayList = ld.setLoginData();
		for (int i = 0; i < arrayList.size(); i++) {
			arrayList.get(i).getUserName();
			arrayList.get(i).getPassowrd();
		}
		return arrayList;
	}

}
