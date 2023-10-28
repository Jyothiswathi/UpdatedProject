package TestNG;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Register extends Base {
	WebDriver driver;
	
	public Register() throws IOException
	{
		super("config");
	}
	
	
	
	
	
	
	
	
	@BeforeMethod
	public void setup() throws InterruptedException, IOException {
		driver=browserinitialization();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Register']")).click();

	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();

	}
	
	@Test
	public void register() throws InterruptedException
	{
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("joy")	;
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("jyo");
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("jyothisahu"+Utilities.timeStamp()+"507@gmail.com");
	driver.findElement(By.xpath("//input[@name='telephone']")).sendKeys("7993685486");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("1234");
	driver.findElement(By.xpath("//input[@name='confirm']")).sendKeys("1234");
	driver.findElement(By.xpath("//input[@name='agree']")).click();

	driver.findElement(By.xpath("//input[@value='Continue']")).click();
	
	String actualResult=driver.findElement(By.xpath("//h1[text()='Your Account Has Been Created!']")).getText();
	Assert.assertEquals(actualResult, "Your Account Has Been Created!","registration failed");
	Thread.sleep(3000);


	}
	
	
	
	
	


}
