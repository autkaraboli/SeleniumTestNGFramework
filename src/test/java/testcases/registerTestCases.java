package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObjectModel.HomePageObject;
import PageObjectModel.RegisterPageObject;
import Resources.TestData;
import Resources.baseClass;
import Resources.commonMethods;

public class registerTestCases extends baseClass {

	
	//valid data
	
	@Test(priority=1)
	public void verifyRegistrationWithValiddata() throws IOException, InterruptedException {

		// use implicite method
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		// driver from base class -- scope are availble

		HomePageObject hpo = new HomePageObject(driver);

		commonMethods.handleExplictWait(driver, 2, hpo.clickOnmyaccount());
				
				
		hpo.clickOnmyaccount().click();
		hpo.clickOnRegister().click();

		RegisterPageObject rpo = new RegisterPageObject(driver);

		rpo.EnterFirstName().sendKeys(TestData.firstname);
		rpo.EnterLastName().sendKeys(TestData.lastname);
		rpo.EnterEMail().sendKeys(emailId);
		rpo.EnterTelephone().sendKeys(TestData.telephone);
		rpo.EnterPassword().sendKeys(TestData.password);
		rpo.EnterPasswordConfirm().sendKeys(TestData.confirmPassword);
		rpo.ClickOnagree().click();
		rpo.ClickOnContinue().click();

		String expected = "Your Account Has Been Created"; // Requirement document
		String actual = rpo.getregistrationsuccessfullytext().getText(); // after running the script

		  commonMethods.handleAssertion(actual, expected);
	}

	//invalid data 
	@Test (enabled=false)
	public void verifyRegistrationWithInValiddata() throws IOException, InterruptedException {

		HomePageObject hpo = new HomePageObject(driver);

		Thread.sleep(4000);
		hpo.clickOnmyaccount().click();
		hpo.clickOnRegister().click();

		
		RegisterPageObject inv = new RegisterPageObject(driver);

		inv.EnterFirstName().sendKeys(TestData.firstname);
		inv.EnterLastName().sendKeys(TestData.lastname);
		inv.EnterInEMailID().sendKeys("user0000@gmail.com");
		inv.EnterTelephone().sendKeys(TestData.telephone);
		inv.EnterPassword().sendKeys(TestData.password);
		inv.EnterPasswordConfirm().sendKeys(TestData.confirmPassword);
		inv.ClickOnagree().click();
		inv.ClickOnContinue().click();
	}

	//blank data
	
	@Test(priority=2)
	public void verifyRegistrationWithblankdata() throws IOException, InterruptedException {

		HomePageObject hpo = new HomePageObject(driver);

		commonMethods.handleExplictWait(driver, 1, hpo.clickOnmyaccount());
		
		hpo.clickOnmyaccount().click();
		hpo.clickOnRegister().click();

		RegisterPageObject blk = new RegisterPageObject(driver);
       

	    blk.ClickOnContinue().click();

		

		String fnExpected = TestData.firstNameExpectedText; // Requirement document
		String fnActual = blk.FirstnameError().getText(); // after running the script

		String lnExpected = TestData.lastNameExpectedText;
		String lnActual = blk.LastNameError().getText();

		String emailExpected = TestData.EmailExpectedText;
		String emailActual = blk.EMailError().getText();

		String telephoneExpected = TestData.telephoneExpectedText;
		String telephoneActual = blk.TelephoneError().getText();

		String PasswordExpected = TestData.passwordExpectedText;
		String PasswordActual = blk.PasswordError().getText();

		String privacypolicyExpected = TestData.privacypolicyExpectedText;
		String privacypolicyActual = blk.PrivacyPolicy().getText();

		  commonMethods.handleAssertion(fnActual, fnExpected);
		  commonMethods.handleAssertion(lnActual, lnExpected);
		  commonMethods.handleAssertion(emailActual, emailExpected);
		  commonMethods.handleAssertion(telephoneActual, telephoneExpected);
		  commonMethods.handleAssertion(PasswordActual, PasswordExpected);
		  commonMethods.handleAssertion(privacypolicyActual, privacypolicyExpected);
		  
		  
		

	}

}
