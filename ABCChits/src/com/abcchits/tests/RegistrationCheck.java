package com.abcchits.tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.abcchits.pages.SignUp;

public class RegistrationCheck extends TestBase {
  @Test
  public void RegistrationCheck() {
	  SignUp signUp=new SignUp(driver);
	  signUp.setEmail("");
	  signUp.setUsername("");
	  signUp.setPassword("");
	  signUp.clickRegister();
	  if(driver.getPageSource().contains("User Register Successfully"))
	  	assertTrue(true);
	  else
		assertTrue(false);  
  }
}
