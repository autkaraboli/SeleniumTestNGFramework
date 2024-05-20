package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageObject {
                    // same class driver 
	public WebDriver driver;  //null driver --dont have any scope

	private By myAccount = By.xpath("//i[@class='fa fa-user']");
	private By register = By.xpath("//a[text()='Register']");
	private By login = By.xpath("//a[text()='Login']");
	

	public HomePageObject(WebDriver driver) {
		this.driver= driver;
	}

	public WebElement clickOnmyaccount() {
		// driver.findElement()by.xpath " ")
		return driver.findElement(myAccount);
	}

	public WebElement clickOnRegister() {

		return driver.findElement(register);
	}

	public WebElement clickOnLogin() {

		return driver.findElement(login);
	}

	public void EnterEMailAddress() {
		this.driver= driver;
	}

	public void Password() {
		this.driver= driver;
	}
}
