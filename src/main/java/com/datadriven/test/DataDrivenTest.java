/*
 * 
 * @author: prathibha
 * 
 * 
 */

package com.datadriven.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.utility.TestUtil;

public class DataDrivenTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);		
		
		driver.get("https://signup.ebay.com/pa/crte");
	}
	
	@DataProvider
	public Iterator<Object[]> getTestData() {
		ArrayList<Object[]> testData= TestUtil.getDataFromExcel();
		return testData.iterator();
		
	}
	
	@Test(dataProvider="getTestData")
	public void EbayRegTest(String fn, String ln, String emailId, String pwd) {
		
		driver.findElement(By.id("firstname")).sendKeys(fn);
		driver.findElement(By.id("lastname")).sendKeys(ln);
		driver.findElement(By.id("Email")).sendKeys(emailId);
		driver.findElement(By.id("password")).sendKeys(pwd);			
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}