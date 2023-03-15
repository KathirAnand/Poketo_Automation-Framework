package com.poketo.testdatas;

import org.testng.annotations.DataProvider;

import com.poketo.testbase.ConstantFilePaths;
import com.poketo.utills.TestDataProvider;

public class LoginTestDatas {
	@DataProvider(name = "loginUsersData")
	public static Object[][] testData() throws Exception {
		Object[][] loginDatas = TestDataProvider.singleTestData(ConstantFilePaths.TESTDATA_FILE, 0);
		return loginDatas;
	}
	@DataProvider(name = "emailInputFieldDatas")
	public static Object[][] emailInputTestDatas() throws Exception {
		Object[][] emailTestDatas=TestDataProvider.testData(ConstantFilePaths.TESTDATA_FILE, 1);
		return emailTestDatas;
	}
//	public static void main(String[] args) throws Exception {
//		emailInputTestDatas();
//		testData();
//	}

//ConstantFilePaths.TESTDATA_FILE
}
