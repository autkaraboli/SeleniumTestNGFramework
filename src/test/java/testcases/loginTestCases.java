package testcases;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.HomePageObject;
import PageObjectModel.LoginPageObject;
import Resources.baseClass;

public class loginTestCases extends baseClass {

	@Test
	public void verifyLoginwithValidData() throws InterruptedException, IOException {
		
		HomePageObject hpo = new HomePageObject(driver);
		
		Thread.sleep(3000);
		
		hpo.clickOnmyaccount();
		hpo.clickOnLogin();
		Thread.sleep(3000);
		LoginPageObject lpo = new LoginPageObject(driver);
		
		
		lpo.EnterEmailAddress().sendKeys(emailId);
		lpo.Password().sendKeys("abcd@1234");
		lpo.ClickOnLogin().click();
		
		
		
	
		/*String expected= "My Account ";     // Requirement document 
		String Actual = lpo.getLoginSuccessfulText().getText();    //after running the script
		
		SoftAssert sa= new SoftAssert();
		
		sa.assertEquals(Actual, expected, "your text is not matching");

        sa.assertAll();*/
		
	}
		
	
	@Test(enabled = false)
	public void verifyLoginwithInValidData() throws InterruptedException, IOException {
		
		
		HomePageObject hpo = new HomePageObject(driver);
		
		Thread.sleep(3000);
		
		hpo.clickOnmyaccount();
		hpo.clickOnLogin();
		
		LoginPageObject lpo = new LoginPageObject(driver);
		
		
		lpo.EnterEmailAddress().sendKeys("");
		lpo.Password().sendKeys("abc@123");
		lpo.ClickOnLogin().click();
		
		
		
	
		/*String expected= "Waring: No match  for Email Address and/or Password ";     // Requirement document 
		String Actual = lpo.LoginFailedText().getText();    //after running the script
		
		SoftAssert sa= new SoftAssert();
		
		sa.assertEquals(Actual, expected, "please enter proper cred.");

        sa.assertAll();*/
		
	}
}
