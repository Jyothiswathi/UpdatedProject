package practiceExtentMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		//driver.manage().window().maximize();
	int rows = driver.findElements(By.xpath("//table[@id='customers']/descendant::tr")).size();
	int columns = driver.findElements(By.xpath("//table[@id='customers']/descendant::tr[2]/td")).size();

	
//	for(int i=1;i<rows;i++)
//	{
		
	for(int j=0;j<columns;j++)	
	{
		
		String eachElement = driver.findElement(By.xpath("//table[@id='customers']/descendant::tr["+rows+"]/td["+(j+1)+"]")).getText();
		System.out.println(eachElement);
//if(eachElement.contains("Francisco Chang"))	
//{
//	System.out.println(eachElement);
//}
	}
	}
		

	}

//}
