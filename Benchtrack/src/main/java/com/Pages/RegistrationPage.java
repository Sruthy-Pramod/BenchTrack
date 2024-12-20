package com.Pages;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationPage {
	 WebDriver driver;
	@FindBy(xpath="//body/div[@id='root']/div[2]/div[1]/div[2]/button[2]")
	WebElement registernow;
	
	@FindBy(xpath="//h2[contains(text(),'Who you are ?')]")
	WebElement whoareu;
	@FindBy(xpath="//button[contains(text(),'Jobseeker')]")
	WebElement jobseeker;
	@FindBy(xpath="//button[contains(text(),'Submit')]")
	WebElement submit;
	@FindBy(xpath="//p[contains(text(),'You must agree to the terms and conditions to proc')]")
	WebElement validation;
	@FindBy(xpath="//input[@id='terms']")
	WebElement checkbox;
	@FindBy(xpath="//h2[contains(text(),'Create Account')]")
	WebElement createaccount;

	@FindBy(xpath="//body/div[@id='root']/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")
	WebElement email;
	@FindBy(xpath="//button[contains(text(),'Get OTP')]")
	WebElement otp;
	@FindBy(xpath="//p[contains(text(),'The email field must be a valid email address.')]")
	WebElement emailvalidation;
	@FindBy(xpath="//div[contains(text(),'OTP sent to Your Email!')]")
	WebElement otpalertmessage;
	@FindBy(xpath="//body/div[@id='root']/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/input[1]"
			)
	WebElement enterotp;
	@FindBy(xpath="//button[contains(text(),'Verify OTP')]")
	WebElement verifyotp;
	@FindBy(xpath="//body/div[@id='root']/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/small[1]")
	WebElement veriflabel;
	
	
	@FindBy(xpath="//input[@name='first_name']")
	WebElement firstname;
	@FindBy(xpath="//input[@name='last_name']")
	WebElement lastname;
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	@FindBy(xpath="//body/div[@id='root']/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[6]/div[1]/input[1]")
	WebElement confirmpassword;
	@FindBy(xpath="//button[contains(text(),'Save & Next')]")
	WebElement savenext;
	@FindBy(xpath="//h3[contains(text(),'Congratulation!')]")
	WebElement successmessage;
	
	
	public  RegistrationPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void registerNow()
	{
		registernow.click();
}
	public String selectLoginUser()
	{
	String s=whoareu.getText();
	return s;
	
	}
	public String termsandconditionnotAccept()
	{
		jobseeker.click();
		
		submit.click();
		String s=validation.getText();
		return s;
	}
	public String termsandconditionAccept()
	{
		checkbox.click();
		submit.click();
		String s=createaccount.getText();
		return s;
		
	}
	public String wrongemailvalidation()
	{
		email.sendKeys("sr.c");
		otp.click();
		String s=emailvalidation.getText();
		return s;
	}
	public String otpVerificationmessage()
	{
		email.clear();
		email.sendKeys("sruthymk1992@gmail.com");
		otp.click();
		String s=otpalertmessage.getText();
		return s;
		
	}
	public String Verifiedlabel()
	{
		enterotp.sendKeys("OTP");
		verifyotp.click();
		String s=veriflabel.getText();
		return s;
		
	}
	public String VerifyAccountcreation()
	{
		firstname.sendKeys("Sruthy");
		lastname.sendKeys("MK");
		password.sendKeys("Sru123@");
		confirmpassword.sendKeys("Sru123@");
		savenext.click();
		String s=successmessage.getText();
		return s;
	}
	 }
