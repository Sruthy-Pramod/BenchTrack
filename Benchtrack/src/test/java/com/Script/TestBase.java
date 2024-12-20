package com.Script;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import reports.ExtentManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class TestBase {
	public WebDriver driver;
  @Test
  public void f() {
  }
  @BeforeClass
  public void beforeTest() throws InterruptedException {
	  WebDriverManager.firefoxdriver().setup();
		 driver=new FirefoxDriver();
		 driver.get("https://benchtrack.ai/");
		 driver.manage().window().maximize();
		 Thread.sleep(6000);
		
  }
  @BeforeSuite
  public void beforeSuite() {
    ExtentManager.setExtent();
  }

  @AfterSuite
  public void afterSuite() {
	 
    
    ExtentManager.endReport();
  }
  @AfterClass
  public void afterTest() {
	 driver.close();
  }

}
