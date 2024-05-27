package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObject {

	public WebDriver driver;

	private By EnterEMailAddress = By.xpath("//input[@id='input-email']");
	private By Password = By.xpath("(//input[@class='form-control'])[2]");
	private By Login = By.xpath("//input[@type='submit']");

	private By LoginSuccessfulText = By.xpath("//h2[text()='My Account']");

	private By LoginFailedText = By.xpath("//div[@class='alert alert-danger alert-dismissible']");

	public WebElement getLoginSuccessfulText() {
		return driver.findElement(LoginSuccessfulText);
	}

	public WebElement LoginFailedText() {
		return driver.findElement(LoginFailedText);
	}

	public LoginPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement EnterEmailAddress() {

		return driver.findElement(EnterEMailAddress);
	}

	public WebElement Password() {

		return driver.findElement(Password);
	}

	public WebElement ClickOnLogin() {

		return driver.findElement(Login);
	}

}
