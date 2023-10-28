package practiceExtentMaven;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Practice {
	@Test

		public void verifyTable() throws InterruptedException
		{
WebDriver driver=new ChromeDriver();	
driver.get("https://seleniumpractise.blogspot.com/2021/08/");
//find all the headerrs
List<WebElement> AllHeaders = driver.findElements(By.xpath("//table[contains(@id,'cust')]//th"));
//find the header size
System.out.println(AllHeaders.size());
//validation
Assert.assertEquals(AllHeaders.size(), 5,"column namwe is not matching");

boolean status=false;
//if country is present return true else false
for(WebElement x:AllHeaders)
{
String headerValues = x.getText();


if(headerValues.equals("Country"))
{
	status=true;
	break;
}
System.out.println(headerValues);
}
Assert.assertTrue(status);

List<WebElement> data = driver.findElements(By.xpath("//table[@id='customers']//td"));
boolean olastatus=false;
for(WebElement x:data)
{
	if(x.getText().contains("Ola"))
	{
	driver.findElement(By.xpath("//td[text()='Ola']/preceding-sibling::td//input"))	.click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//td[text()='Ola']/following-sibling::td[3]/a")).click();
	}
}





		}





	}


