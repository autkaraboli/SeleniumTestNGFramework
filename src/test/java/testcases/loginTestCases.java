package testcases;

import java.io.IOException;

import org.testng.annotations.Test;
import PageObjectModel.HomePageObject;
import PageObjectModel.LoginPageObject;
import Resources.TestData;
import Resources.baseClass;
import Resources.commonMethods;

public class loginTestCases extends baseClass {

	@Test
	public void verifyLoginwithValidData() throws InterruptedException, IOException {
		
		HomePageObject hpo = new HomePageObject(driver);
		
                                      //driver  sec  element
		commonMethods.handleExplictWait(driver, 2, hpo.clickOnmyaccount());
		
		hpo.clickOnmyaccount();
		hpo.clickOnLogin();
		Thread.sleep(3000);
		LoginPageObject lpo = new LoginPageObject(driver);
		
		
		lpo.EnterEmailAddress().sendKeys(emailId);
		lpo.Password().sendKeys("abcd@1234");
		lpo.ClickOnLogin().click();
		
		
		
	
		String expected= TestData.loginExpectedText;     // Requirement document 
		String actual = lpo.getLoginSuccessfulText().getText();    //after running the script
	
		
        commonMethods.handleAssertion(actual, expected);
	}
		
	
	@Test
	public void verifyLoginwithInValidData() throws InterruptedException, IOException {
		
		
		HomePageObject hpo = new HomePageObject(driver);
	
		
		commonMethods.handleExplictWait(driver, 1, hpo.clickOnmyaccount());
		
		hpo.clickOnmyaccount();
		hpo.clickOnLogin();
		
		LoginPageObject lpo = new LoginPageObject(driver);
		
		
		lpo.EnterEmailAddress().sendKeys("");
		lpo.Password().sendKeys("abc@123");
		lpo.ClickOnLogin().click();
		
		
		
	
		String expected= TestData.loginErrorTextExpected;     // Requirement document 
		String actual = lpo.LoginFailedText().getText();    //after running the script
	
		  commonMethods.handleAssertion(actual, expected);
	}
}
