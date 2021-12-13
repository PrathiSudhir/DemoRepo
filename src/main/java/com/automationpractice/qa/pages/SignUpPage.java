package com.automationpractice.qa.pages;

import org.openqa.selenium.support.PageFactory;

import com.automationpractice.qa.base.TestBase;

public class SignUpPage extends TestBase{
	
	
	//Initializing the Page Objects
	public SignUpPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String validateSignUpPageTitle() {
		return driver.getTitle();
	}

}
