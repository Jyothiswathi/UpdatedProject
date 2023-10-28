package TestNG;

import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Login extends Base {
	WebDriver driver;

	ConfigReader c = new ConfigReader();

	public Login() throws IOException {
		super("config");
	}

	@BeforeMethod
	public void setup() throws InterruptedException, IOException {
		driver = browserinitialization();
		HomePage homepage = new HomePage(driver);
		homepage.clickOnMyAccount();

		Thread.sleep(5000);
		homepage.clickOnLoginOption();
	}

	@Test(priority = 1, dataProvider = "supplyData")
	public void verifyLoginWithValidCredientials(String userName, String password)
			throws InterruptedException, IOException {
		// Properties prop = c.init("Login");
		LoginPage LoginPage = new LoginPage(driver);

		LoginPage.emailAddress();
		LoginPage.password();
		LoginPage.clickOnSubmit();

		Assert.assertTrue(LoginPage.editUserInformation(), "wrong");
	}

	@Test(priority = 2)
	public void verifyLoginWithInValidCredientials() throws InterruptedException {

		// Thread.sleep(5000);
		LoginPage LoginPage = new LoginPage(driver);

		driver.findElement(By.xpath("//label[text()='E-Mail Address']/following::input[1]"))
				.sendKeys("jyothisahu" + Utilities.timeStamp() + "507@gmail.co");
		LoginPage.password();
		LoginPage.clickOnSubmit();
		String actual = LoginPage.invalidLoginDispalyMessage();
		String Expected = "Warning: No match for E-Mail Address and/or Password.";
		Assert.assertTrue(actual.contains(Expected), "error");

	}

	@AfterMethod
	public void tearDown() {
		driver.close();

	}

	@DataProvider
	public Object[][] supplyData() {

		Object[][] data = { { "jyothisahu507@gmail.com", "12345" }, { "jyothisahu507@gmail.com", "12345" },
				{ "jyothisahu507@gmail.com", "12345" } };
		return data;

	}

}
