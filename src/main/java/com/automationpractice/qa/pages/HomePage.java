package com.automationpractice.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationpractice.qa.base.TestBase;

public class HomePage extends TestBase{
	
	//Page Factory - Object Repository(OR)
	
	@FindBy(name = "submit_search")
	WebElement searchBtn;
		
	@FindBy(xpath = "//span[contains(text(),'Paula Sudhir')]")
	//@FindBy(xpath = "//a[@title='View my customer account']")
	WebElement userNameLabel;
	
	@FindBy(xpath = "//span[@class='shop-phone']")
	WebElement callUsNowLabel;
	
	@FindBy(xpath = "//a[@title=\"Contact Us\"]")
	WebElement contactUsLabel;
	
	//@FindBy(xpath = "//a[@title=\"Log me out\"]")
	@FindBy(xpath = "//a[@class='logout']")
	WebElement signOutLabel;
	
	@FindBy(xpath = "//a[@title='View my shopping cart']")
	WebElement cartBtn;	
	
	@FindBy(xpath = "//a[@title='Check out']")
	WebElement checkOutBtn;	
	
	@FindBy(xpath = "//a[@title='Dresses']")
	WebElement dressesBtn;
	
	
		
	//Initializing the Page Objects
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitleTest() {
		return driver.getTitle();
	}
	
	public boolean verifyUserNameTest() {
		return userNameLabel.isDisplayed();
	}
	
	public void clickOnSignOutLink() {
		signOutLabel.click();
	}
	
	public boolean validateCallUsNowLabel() {
		return callUsNowLabel.isDisplayed();
	}
	
	public boolean validateContactUsLabel() {
		return contactUsLabel.isDisplayed();
	}
	
	public void clickOnCartLink() {
		//performMouseHower(cartBtn);
		cartBtn.click();
		//return new CheckOutPage();
	}
	
	public void clickOnDressesBtn() {
		//dressesBtn.click();
		performMouseHower(dressesBtn);
	}
	
}
