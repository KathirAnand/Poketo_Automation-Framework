package com.poketo.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObjects {
	public LoginPageObjects(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@id='CustomerEmail']")
	public WebElement emailInputField;
	
	@FindBy(xpath="//input[@id='CustomerPassword']")
	public WebElement passwordInputField;
	
	@FindBy(xpath="//input[@class='button' and  @value='Sign In']")
	public WebElement btnSignIn;
	
	@FindBy(xpath="//a[@id='RecoverPassword']")
	public WebElement linkForgetPwd;
	
	@FindBy(xpath="//a[text()='Sign Up']")
	public WebElement linkSignUp;
}
