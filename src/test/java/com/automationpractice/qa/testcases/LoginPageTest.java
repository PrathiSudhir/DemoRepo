package com.automationpractice.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.automationpractice.qa.base.TestBase;
import com.automationpractice.qa.pages.HomePage;
import com.automationpractice.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
	}
	
	@Test(priority=1,enabled=false)
	public void loginPageTitleTest() {
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "Login - My Store");
	}
	
	@Test(priority=2, enabled=false)
	public void automationPracticeLogoImageTest() {
		boolean flag = loginPage.validateAutomationPracticeImage();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=3)
	public void loginTest() {
		homePage = loginPage.login(prop.getProperty("emailaddress"), prop.getProperty("password"));
	}
	
	@AfterMethod
	public void tearDown() {
		//driver.quit();
	}

}
