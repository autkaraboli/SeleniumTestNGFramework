package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPageObject {

	
	
	// valid data
	public WebDriver driver;

	private By EnterFirstname = By.xpath("//input[@name='firstname']");
	private By EnterLastName = By.xpath("//input[@name='lastname']");
	private By EnterEMail = By.xpath("//input[@name='email']");
	private By EnterTelephone = By.xpath("//input[@name='telephone']");
	private By EnterPassword = By.xpath("//input[@name='password']");
	private By EnterPasswordConfirm = By.xpath("//input[@name='confirm']");
	private By Enteragree = By.xpath("//input[@name='agree']");
	private By EnterContinue = By.xpath("//input[@value='Continue']");

	private By RegistrationSuccessfully = By.xpath("//h1[text()= 'Your Account Has Been Created!']");

	public WebElement EnterFirstName() {
		// driver.findElement()by.xpath " ")
		return driver.findElement(EnterFirstname);
	}

	public WebElement EnterLastName() {

		return driver.findElement(EnterLastName);
	}

	public WebElement EnterEMail() {

		return driver.findElement(EnterEMail);
	}

	public WebElement EnterTelephone() {

		return driver.findElement(EnterTelephone);
	}

	public WebElement EnterPassword() {

		return driver.findElement(EnterPassword);
	}

	public WebElement EnterPasswordConfirm() {

		return driver.findElement(EnterPasswordConfirm);
	}

	public WebElement ClickOnagree() {

		return driver.findElement(Enteragree);
	}

	public WebElement ClickOnContinue() {

		return driver.findElement(EnterContinue);
	}

	public WebElement getregistrationsuccessfullytext() {

		return driver.findElement(RegistrationSuccessfully);
	}

	
	
	// invalid data

	public WebDriver driver1;

	private By EnterInEMailID = By.xpath("//input[@name='email']");

	public WebElement EnterInEMailID() {

		return driver.findElement(EnterInEMailID);
	}

	
	
	// blank data
	public WebDriver driver11;

	//private By FirstnameError = By.xpath("(//div[@class='text-danger'])[1]");
	private By FirstnameError = By.xpath("//div[text()='First Name must be between 1 and 32 characters!']");
	private By LastNameError = By.xpath("(//div[@class='text-danger'])[2]");
	private By EMailError = By.xpath("(//div[@class='text-danger'])[3]");
	private By TelephoneError = By.xpath("(//div[@class='text-danger'])[4]");
	private By PasswordError = By.xpath("(//div[@class='text-danger'])[5]");

	private By agreeblank = By.xpath("//input[@name='agree']");
	private By Continueblank = By.xpath("//input[@type='submit']");
	private By PrivacyPolicy = By.xpath("//div[@class='alert alert-danger alert-dismissible']");

	public RegisterPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement FirstnameError() {
		// driver.findElement()by.xpath " ")
		return driver.findElement(FirstnameError);
	}

	public WebElement LastNameError() {

		return driver.findElement(LastNameError);
	}

	public WebElement EMailError() {

		return driver.findElement(EMailError);
	}

	public WebElement TelephoneError() {

		return driver.findElement(TelephoneError);
	}

	public WebElement PasswordError() {

		return driver.findElement(PasswordError);
	}

	public WebElement agreeblank() {

		return driver.findElement(agreeblank);
	}

	

	public WebElement PrivacyPolicy() {

		return driver.findElement(PrivacyPolicy);
	}

	public WebElement Continueblank() {
		
		return driver.findElement(Continueblank);
	}

}
