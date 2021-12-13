package com.automationpractice.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.automationpractice.qa.base.TestBase;
import com.automationpractice.qa.pages.CheckOutPage;
import com.automationpractice.qa.pages.HomePage;
import com.automationpractice.qa.pages.LoginPage;

public class HomePageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	CheckOutPage checkOutPage;
	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("emailaddress"), prop.getProperty("password"));		
	}
	
	@Test(priority=1,enabled=false)
	public void verifyHomePageTitleTest() {
		String homePageTitle = homePage.verifyHomePageTitleTest();
		System.out.println(homePageTitle);
		Assert.assertEquals(homePageTitle, "My account - My Store","Home Page title not matched");
	}
	
	@Test(priority=2,enabled=false)
	public void verifyContactUsTest() {
		boolean contactUs = homePage.validateContactUsLabel();
		Assert.assertTrue(contactUs);
	}
	
	@Test(priority=3,enabled=false)
	public void verifyCallUsNowTest() {
		boolean callUs = homePage.validateCallUsNowLabel();
		Assert.assertTrue(callUs);
	}
	
	@Test(priority=4, enabled=false)
	public void verifyUserNameTest() {
		boolean userName = homePage.verifyUserNameTest();
		System.out.println(userName);
		Assert.assertTrue(userName);
	}
	
	@Test(priority=5,enabled=false)
	public void verifyClickOnCartLinkTest() {
		homePage.clickOnCartLink();		
	}
	
	@Test(priority=6,enabled=false)
	public void verifySignOutTest() {
		homePage.clickOnSignOutLink();
	}	
	
	@Test(priority=6,enabled=true)
	public void verifyDressesBtnTest() {
		homePage.clickOnDressesBtn();
	}	
	
	
	@AfterMethod
	public void tearDown() {
		//driver.quit();
	}
}
