package com.poketo.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountObjects {
	public CreateAccountObjects(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	/**
	 * xpath for heading Create Account,
	 * the element is displayed or not is validated 
	 */
	@FindBy(xpath="//h1[text()='Create Account']")
	public WebElement headingCreateAccount;
	
	@FindBy(xpath="//input[@id='FirstName']")
	public WebElement firstNameInputField;
	
	@FindBy(xpath="//label[text()='First Name']")
	public WebElement labelFirstName;
	
	
	@FindBy(xpath="//input[@id='LastName']")
	public WebElement lastNameInputField;

	@FindBy(xpath="//label[text()='Last Name']")
	public WebElement labelLastName;

	@FindBy(xpath="//input[@id='Email']")
	public WebElement emailInputField;
	
	@FindBy(xpath="//label[text()='Email']")
	public WebElement labelEmail;
	
	@FindBy(xpath="//input[@id='CreatePassword']")
	public WebElement passwordInputField;
	
	@FindBy(xpath="//label[text()='Password']")
	public WebElement labelPassword;
	
	@FindBy(xpath="//input[@value='Create']")
	public WebElement btnCreate;
	
	@FindBy(xpath="//a[text()=' Return to Store']")
	public WebElement linkReturnToStore;
	
}












