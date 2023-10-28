package practiceExtentMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class calendar {
	public static void main(String args[]) throws InterruptedException
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://phptravels.net/");
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//input[@id='departure'])[1]")).click();
		Thread.sleep(3000);
		for(int i=5;i<12;i++)
		{
	String date = driver.findElement(By.xpath("(//div[@class='datepicker dropdown-menu'])[3]/descendant::th[@class='switch']")).getText();
		if(date.equalsIgnoreCase("July 2023"))
		{
		driver.findElement(By.xpath("(//div[@class='datepicker dropdown-menu'])[3]/descendant::td[text()='17'][1]")).click()	;
		}
		else
			
		{
		driver.findElement(By.xpath("(//div[@class='datepicker dropdown-menu'])[3]/descendant::th[@class='next'][1]")).click();
		}
		}
		
	
	
	//	driver.close();
		
		
	}
	
	

}
