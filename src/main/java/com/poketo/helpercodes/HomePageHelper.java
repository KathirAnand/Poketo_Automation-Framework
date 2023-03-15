package com.poketo.helpercodes;

import org.openqa.selenium.WebDriver;

import com.poketo.pageactions.PageActions;
import com.poketo.pageobjects.HomePageObjects;

public class HomePageHelper extends PageActions{
	public void btnLoginClick(WebDriver driver) {
		HomePageObjects home=new HomePageObjects(driver);
		clicker(home.loginBtn);
	}

}
