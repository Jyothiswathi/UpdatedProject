package practiceExtentMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hello {

	public static void main(String[] args) {
		
		table();

		
	}
	
	
	public static void table()
	{
		WebDriver driver;
		driver=new ChromeDriver();
		driver.get("https://letcode.in/table");
		driver.manage().window().maximize();
		
		
		int totalRows = driver.findElements(By.xpath("//table[@class='mat-sort table is-bordered is-striped is-narrow is-hoverable is-fullwidth']/descendant::tr")).size();
		System.out.println(totalRows);
int totalColumns	=	driver.findElements(By.xpath("//table[@class='mat-sort table is-bordered is-striped is-narrow is-hoverable is-fullwidth']/descendant::th")).size();
String eachElement="";
		for(int i=1;i<=totalRows;i++)	
		{
			for(int j=1;j<=totalColumns;j++)
			{
			
			 eachElement = driver.findElement(By.xpath("//table[@class='mat-sort table is-bordered is-striped is-narrow is-hoverable is-fullwidth']/descendant::tr["+i+"]/descendant::td[3]")).getText();

		
			
		
			}
			System.out.println(eachElement);

		}
		driver.close();
	}

}
