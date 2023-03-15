package com.poketo.testbase;

import java.io.File;

public class ConstantFilePaths {
	public final static  String USER_HOME=System.getProperty("user.dir")+File.separator+File.separator;
	public static final String TESTDATA_HOME=USER_HOME+"TestData"+File.separator;
	public static final String TESTDATA_FILE="C:\\Users\\kathiravan\\Documents\\Poketo\\TestDatas\\poketo_LoginTestDatas.xlsx";
	public static final String EXTENTREPORT_HOME="C:\\Users\\kathiravan\\Documents\\Poketo\\";
	public static final String EXTENTREPORT_FILE=EXTENTREPORT_HOME+"test-output\\FailedTestsScreenshots\\";

}
