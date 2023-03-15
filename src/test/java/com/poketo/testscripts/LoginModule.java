package com.poketo.testscripts;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.poketo.helpercodes.HomePageHelper;
import com.poketo.helpercodes.LoginHelper;
import com.poketo.testbase.TestBase;
import com.poketo.testdatas.LoginTestDatas;
import com.poketo.utills.ExtentReport;

public class LoginModule extends TestBase{
	
	LoginHelper login=new LoginHelper();
	HomePageHelper home=new HomePageHelper();
	
	
	@BeforeTest
	public void startReport() {
		startReport("LoginTest");
	}
	/**
	 * TS-08032023001
	 * TC-001
	 * @throws Exception
	 */
	@Test(priority=1)
	public void btnLoginClick() throws Exception {
		ExtentReport.logger=ExtentReport.extent.startTest("Loginbutton Clicked successfully");
			home.btnLoginClick(driver);
			ExtentReport.logPassedStepReportWithScreenshot(driver, logger, "passed", "HomePage LoginButton clicked successfully");
		
	}
	/**
	 *  TS-08032023002
	 *  TC-001
	 * @throws Exception 
	 */
	@Test(priority=2)
	public void withoutEmailAndPassword() throws Exception {
		ExtentReport.logger=ExtentReport.extent.startTest("LoginWithoutEmailidAndPassword");
		login.withoutEmailidAndPassword(driver);
		ExtentReport.logPassedStepReportWithScreenshot(driver, logger, "passed", "Login button is clicked without entering the email-Id and Password");
	}
	/**
	 * TS-08032023002
	 * TC-002
	 * @param userName
	 * @param Password
	 * @throws Exception 
	 */
	@Test(dataProvider="loginUsersData",dataProviderClass=LoginTestDatas.class,priority=3)
	public void withoutEmailId(String userName,String Password) throws Exception {
		ExtentReport.logger=ExtentReport.extent.startTest("LoginWithoutEmailid");
		login.withoutEmailid(userName, Password, driver);
		ExtentReport.logPassedStepReportWithScreenshot(driver, logger, "passed", "Login button is clicked without entering the email-Id");
	}
	/**
	 * TS-08032023002
	 * TC-003
	 * @param userName
	 * @param Password
	 * @throws Exception 
	 */
	@Test(dataProvider="loginUsersData",dataProviderClass=LoginTestDatas.class,priority=4)
	public void withoutPassword(String userName,String Password) throws Exception {
		ExtentReport.logger=ExtentReport.extent.startTest("LoginWithoutPassword");
		login.withoutPassword(userName, Password, driver);
		ExtentReport.logPassedStepReportWithScreenshot(driver, logger, "passed", "Login button is clicked without Password");
	}
	
	/**
	 * TS-08032023002
	 * TC-004
	 * @param userName
	 * @param Password
	 * @throws Exception
	 */
//	@Test(dataProvider="loginUsersData",dataProviderClass=LoginTestDatas.class,priority=5)
	public void loginWithInvalidLoginCredentials(String userName,String Password) throws Exception {
		Thread.sleep(5000);
		ExtentReport.logger=ExtentReport.extent.startTest("LoginWithInvalidCredentials");
		login.invalidUserNameWithInvalidPassword(userName,Password,driver);
//		ExtentReport.logPassedStepReportWithScreenshot(driver, logger, "Failed", "InvalidLoginCredentials");
	}
}
