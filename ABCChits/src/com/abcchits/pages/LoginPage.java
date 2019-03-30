package com.abcchits.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.ID, using="id") WebElement userID;
	@FindBy(how=How.ID, using="password") WebElement password;
	@FindBy(how=How.ID, using="submit") WebElement submit;
	
	public void setID(String ID)
	{
		userID.sendKeys(ID);
	}
	public void setPassword(String Password)
	{
		userID.sendKeys(Password);
	}
	public void clickSubmit()
	{
		submit.click();
	}
}
