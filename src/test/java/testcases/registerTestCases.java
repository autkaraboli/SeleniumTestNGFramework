package testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.HomePageObject;
import PageObjectModel.RegisterPageObject;
import Resources.TestData;
import Resources.baseClass;

public class registerTestCases extends baseClass {

	
	//valid data
	
	@Test
	public void verifyRegistrationWithValiddata() throws IOException, InterruptedException {

		// use implicite method
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		// driver from base class -- scope are availble

		HomePageObject hpo = new HomePageObject(driver);

		Thread.sleep(4000);
		hpo.clickOnmyaccount().click();
		hpo.clickOnRegister().click();

		RegisterPageObject rpo = new RegisterPageObject(driver);

		rpo.EnterFirstName().sendKeys(TestData.Firstname);
		rpo.EnterLastName().sendKeys(TestData.Lastname);
		rpo.EnterEMail().sendKeys(emailId);
		rpo.EnterTelephone().sendKeys(TestData.telephone);
		rpo.EnterPassword().sendKeys(TestData.password);
		rpo.EnterPasswordConfirm().sendKeys(TestData.PasswordConfirm);
		rpo.ClickOnagree().click();
		rpo.ClickOnContinue().click();

		String expected = "Your Account Has Been Created"; // Requirement document
		String actual = rpo.getregistrationsuccessfullytext().getText(); // after running the script

		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actual, expected, "your text is not matching");
		sa.assertAll();
	}

	//invalid data 
	@Test (enabled= false)
	public void verifyRegistrationWithInValiddata() throws IOException, InterruptedException {

		HomePageObject hpo = new HomePageObject(driver);

		Thread.sleep(4000);
		hpo.clickOnmyaccount().click();
		hpo.clickOnRegister().click();

		
		RegisterPageObject inv = new RegisterPageObject(driver);

		inv.EnterFirstName().sendKeys(TestData.Firstname);
		inv.EnterLastName().sendKeys(TestData.Lastname);
		inv.EnterInEMailID().sendKeys("user0000@gmail.com");
		inv.EnterTelephone().sendKeys(TestData.telephone);
		inv.EnterPassword().sendKeys(TestData.password);
		inv.EnterPasswordConfirm().sendKeys(TestData.PasswordConfirm);
		inv.ClickOnagree().click();
		inv.ClickOnContinue().click();
	}

	//blank data
	
	@Test
	public void verifyRegistrationWithblankdata() throws IOException, InterruptedException {

		HomePageObject hpo = new HomePageObject(driver);

		Thread.sleep(4000);
		hpo.clickOnmyaccount().click();
		hpo.clickOnRegister().click();

		RegisterPageObject blk = new RegisterPageObject(driver);
       
		blk.FirstnameError().sendKeys("");
		blk.LastNameError().sendKeys("");
		blk.EMailError().sendKeys("");
		blk.TelephoneError().sendKeys("");
		blk.PasswordError().sendKeys("");
		blk.ClickOnagree().click();
	    blk.ClickOnContinue().click();

		/*SoftAssert sa = new SoftAssert();

		String fnExpected = "First Name must be between 1 and 32 characters!"; // Requirement document
		String fnActual = blk.fnnameError().getText(); // after running the script

		String lnExpected = "Last Name must be between 1 and 32 characters!";
		String lnActual = blk.lnError().getText();

		String emailExpected = "E-mail Address does not appear to be valid!";
		String emailActual = blk.EMailError().getText();

		String telephoneExpected = "Telephone must be between 1 and 32 characters!";
		String telephoneActual = blk.telephoneError().getText();

		String PasswordExpected = "Password must be between 4 and 20 characters!";
		String PasswordActual = blk.passwordError().getText();

		String privacypolicyExpected = "Warning: You must agree to the Privacy Policy";
		String privacypolicyActual = blk.privacypolicy().getText();

		sa.assertEquals(fnActual, fnExpected);
		sa.assertEquals(emailActual, emailExpected);
		sa.assertAll();*/

	}

}
