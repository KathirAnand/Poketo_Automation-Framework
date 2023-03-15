package com.poketo.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageObjects {
	public HomePageObjects(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	/**
	 * Element for Login Button, using clickEvent
	 */
	@FindBy(xpath = "(//a/child::span[text()='Login'])[1]")
	public WebElement loginBtn;

	@FindBy(xpath = "(//span[text()='Shop All'])[1]")
	public WebElement sourceShopAllLink;

	@FindBy(xpath = "//span[@title='Open cart']/child::a")
	public WebElement linkCart;
	/**
	 * Element is to perform searchOperation, using clickEvent
	 */
	@FindBy(xpath = "//span[text()='Search']")
	public WebElement btnSearch;

	@FindBy(xpath = "//div[@id='site-nav--desktop']/descendant::span[text()='Wholesale']")
	public WebElement linkWholeSale;

	@FindBy(xpath = "//a[starts-with(text(),'New Spectrum')]")
	public WebElement linkNewSpectrum;
	/**
	 * The element is for to check whether the logo is displayed or not
	 */
	@FindBy(xpath = "//a/child::img[@alt='Poketo']")
	public WebElement linkPoketoLog;
	
	

}
