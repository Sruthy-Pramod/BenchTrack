package com.Script;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Pages.RegistrationPage;



public class RegistrationTest  extends TestBase{
	RegistrationPage obj;
 
  @Test(priority=1)
  public void verifLoginuserpage() throws InterruptedException {
	  
		obj=new RegistrationPage(driver);
	 Thread.sleep(4000);
	 obj.registerNow();
	 
	 Assert.assertEquals(obj.selectLoginUser(),"Who you are ?");
  }
  @Test(priority=2)
  public void verifyTermsandconditionnotacceptvalidationmessage() {
	  
	 obj=new RegistrationPage(driver);
	 String s=obj.termsandconditionnotAccept();
	 Assert.assertEquals(s,"You must agree to the terms and conditions to proceed.");
	 
  }
  
  @Test(priority=3)
  public void verifyCreateAccountt() {
	  
	 
	  obj=new RegistrationPage(driver);
	  String s=obj.termsandconditionAccept();
	  Assert.assertEquals(s,"Create Account");
		  
		  
  }
  @Test(priority=4)
  public void verifyWrongemailid() {
	  
	 
	  obj=new RegistrationPage(driver);
	  String s=obj.wrongemailvalidation();
	  Assert.assertEquals(s,"The email field must be a valid email address.");
		  
		  
  }
  @Test(priority=5)
  public void verifyotpalertmessage() {
	  
	 
	  obj=new RegistrationPage(driver);
	  String s=obj.otpVerificationmessage();
	  Assert.assertEquals(s,"OTP sent to Your Email!");
		  
		  
  }
  @Test(priority=6)
  public void verifyverifiedlabel() {
	  
	 
	  obj=new RegistrationPage(driver);
	  String s=obj.Verifiedlabel();
	  Assert.assertEquals(s," Verified");
		  
		  
  }
  @Test(priority=7)
  public void verifyAccountCreation() {
	  
	 
	  obj=new RegistrationPage(driver);
	  Assert.assertEquals(obj.VerifyAccountcreation(),"Congratulation!");
	  
	  
		  
		  
  }
}