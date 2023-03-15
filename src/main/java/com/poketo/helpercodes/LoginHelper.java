package com.poketo.helpercodes;

import org.openqa.selenium.WebDriver;

import com.poketo.pageactions.PageActions;
import com.poketo.pageobjects.LoginPageObjects;

public class LoginHelper extends PageActions {

	public void invalidUserNameWithInvalidPassword(String emailId, String Password, WebDriver driver) {
		LoginPageObjects login = new LoginPageObjects(driver);
		clear(login.emailInputField);
		sendKey(login.emailInputField, emailId);
		clear(login.passwordInputField);
		sendKey(login.passwordInputField, Password);
		javaScriptClicker(login.btnSignIn, driver);
	}

	public void withoutEmailidAndPassword(WebDriver driver) {
		LoginPageObjects login = new LoginPageObjects(driver);
		clear(login.emailInputField);
		clear(login.passwordInputField);
//		clicker(login.btnSignIn);
		jsClicker(login.btnSignIn, driver);
		
		
	}

	public void withoutEmailid(String userName, String Password, WebDriver driver) {
		LoginPageObjects login = new LoginPageObjects(driver);
		clear(login.emailInputField);
		clear(login.passwordInputField);
		sendKey(login.passwordInputField, Password);
		jsClicker(login.btnSignIn, driver);
	}

	public void withoutPassword(String userName, String Password, WebDriver driver) {
		LoginPageObjects login = new LoginPageObjects(driver);
		clear(login.emailInputField);
		sendKey(login.emailInputField, userName);
		clear(login.passwordInputField);
		jsClicker(login.btnSignIn, driver);

	}

	public void withInvalidLoginCredentials(String userName, String Password, WebDriver driver) {
		LoginPageObjects login = new LoginPageObjects(driver);
		clear(login.emailInputField);
		sendKey(login.emailInputField, userName);
		clear(login.passwordInputField);
		sendKey(login.passwordInputField, Password);
		jsClicker(login.btnSignIn, driver);

	}

	public void validatingEmailInputField(String userName, String Password, WebDriver driver) {
		LoginPageObjects login = new LoginPageObjects(driver);
		clear(login.emailInputField);
		sendKey(login.emailInputField, userName);
		clear(login.passwordInputField);
		sendKey(login.passwordInputField, Password);
		jsClicker(login.btnSignIn, driver);
	}

	public void validatingPasswordInputField(String userName, String Password, WebDriver driver) {
		LoginPageObjects login = new LoginPageObjects(driver);
		clear(login.emailInputField);
		sendKey(login.emailInputField, userName);
		clear(login.passwordInputField);
		sendKey(login.passwordInputField, Password);
		jsClicker(login.btnSignIn, driver);
	}

}
