package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;

	@FindBy(xpath = "//label[text()='E-Mail Address']/following::input[1]")
	private WebElement emailaddress;

	@FindBy(xpath = "//label[text()='Password']/following::input[1]")
	private WebElement password;

	@FindBy(xpath = "//input[@type='submit']")
	private WebElement clickOnSumit;
	
	@FindBy(linkText="Edit your account information")
	private WebElement edituserInformation;
	
	
	@FindBy(xpath="//div[text()='Warning: No match for E-Mail Address and/or Password.']")
	WebElement loginFailedDisplayMessage;
	
	
	public LoginPage(WebDriver driver)
	{
	this.driver=driver;	
	PageFactory.initElements(driver, this);
	
	}
	
	public void emailAddress()
	{
		emailaddress.sendKeys("jyothisahu507@gmail.com");
		
	}
	
	public void password()
	{
		password.sendKeys("12345");
	}
	
	public void clickOnSubmit()
	{
		clickOnSumit.click();
	}
	
	
	public boolean editUserInformation()
	{
		boolean a = edituserInformation.isDisplayed();
		return a;
	}
	
	
	public String invalidLoginDispalyMessage()
	{
	String message = loginFailedDisplayMessage.getText();
	return message;
	}
	
	
	

}
