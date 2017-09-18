package com.cybage.alm.sample.buildata;

import java.io.File;
import java.util.Iterator;
import java.util.ArrayList;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LoginData {

	public String userName;
	public String passowrd;
	public int result;
	XSSFWorkbook workbook;
	XSSFSheet sheet;

	public static LoginData buildLoginData(Row row) {
		LoginData ld = new LoginData();
		ld.setUserName(row.getCell(0).toString().trim());
		ld.setPassowrd(row.getCell(1).toString().trim());
		return ld;
	}

	public ArrayList<LoginData> setLoginData() {
		ArrayList<LoginData> arrayList = new ArrayList<LoginData>();
		File file = new File("D:\\Mars Workspace\\Data_driven\\src\\main\\resources\\inputdata.xlsx");
		try {
			FileInputStream fis = new FileInputStream(file);
			workbook = new XSSFWorkbook(fis);
		} catch (Exception e) {
		}
		sheet = workbook.getSheetAt(0);

		Iterator<Row> rowIterator = sheet.iterator();
		while (rowIterator.hasNext()) {
			Row row = (Row) rowIterator.next();
			if (row.getRowNum() == 0)
				continue;
			arrayList.add(LoginData.buildLoginData(row));
		}
		return arrayList;

	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassowrd() {
		return passowrd;
	}

	public void setPassowrd(String passowrd) {
		this.passowrd = passowrd;
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}
}
