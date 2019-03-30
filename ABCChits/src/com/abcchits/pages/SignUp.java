package com.abcchits.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
public class SignUp {
	WebDriver driver;
	public SignUp(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.ID, using="ID") WebElement email;
	@FindBy(how=How.ID, using="ID") WebElement username;
	@FindBy(how=How.ID, using="ID") WebElement password;
	@FindBy(how=How.ID, using="ID") WebElement register;
	
	
	public void setEmail(String ID)
	{
		email.sendKeys(ID);
	}
	public void setUsername(String Password)
	{
		username.sendKeys(Password);
	}
	public void setPassword(String Password)
	{
		password.sendKeys(Password);
	}
	public void clickRegister()
	{
		register.click();
	}
	
}
