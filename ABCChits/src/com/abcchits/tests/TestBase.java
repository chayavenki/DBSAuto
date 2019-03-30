package com.abcchits.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class TestBase {
  WebDriver driver;
  public  String ID="ID";
  public  String Password="Password";
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver",
				"E://chromedriver_win32//chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
