package com.abcchits.tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.abcchits.pages.LoginPage;

public class LoginTest extends TestBase
{
	@Test
	public void LoginTest()
	{
		String actual=driver.getTitle();
		LoginPage loginPage=new LoginPage(driver);
		loginPage.setID(ID);
		loginPage.setPassword(Password);
		loginPage.clickSubmit();
		String expected=driver.getTitle();
		if(actual!=expected)
			assertTrue(true);
		else
			assertTrue(false);
	}
}
