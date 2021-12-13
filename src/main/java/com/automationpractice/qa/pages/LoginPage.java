package com.automationpractice.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationpractice.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	//Page Factory - Object Repository(OR)
	
	@FindBy(name = "email")
	WebElement emailaddress;
	
	@FindBy(name = "passwd")
	WebElement password;
	
	//@FindBy(xpath = "//button[@type='submit']")
	@FindBy(name = "SubmitLogin")
	WebElement signInBtn;
	
	@FindBy(xpath = "//img[contains(@class, 'logo img-responsive')]")
	WebElement logoBtn;
	
	//Initializing the Page Objects
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public boolean validateAutomationPracticeImage() {
		return logoBtn.isDisplayed();
	}
	
	public HomePage login(String ea, String pwd ) {
		emailaddress.sendKeys(ea);
		password.sendKeys(pwd);
		signInBtn.click();
		
		return new HomePage();
	}

}
