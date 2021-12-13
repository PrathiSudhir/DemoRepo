package com.test.utility;

import java.util.ArrayList;
import com.excel.lib.util.Xls_Reader; 

public class TestUtil {
	static Xls_Reader reader;
	
	public static ArrayList<Object[]> getDataFromExcel() {
		
		ArrayList<Object[]> myData = new ArrayList<Object[]>();
		try {
			reader = new Xls_Reader("C:\\Users\\pb184f\\eclipse-workspace"
					+ "\\AutomationPracticeTest\\src\\main\\java\\com\\qa\\testdata\\EbayTestData.xlsx");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		for(int rowNum=2; rowNum <= reader.getRowCount("Sheet1"); rowNum++) {
			String firstname = reader.getCellData("Sheet1", "firstname", rowNum);
			String lastname = reader.getCellData("Sheet1", "lastname", rowNum);
			String emailId = reader.getCellData("Sheet1", "emailaddress", rowNum);
			String password = reader.getCellData("Sheet1", "password", rowNum);
			
			myData.add(new Object[] {firstname,lastname,emailId,password});			
		}
		return myData;
		
	}

}
