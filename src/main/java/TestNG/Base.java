package TestNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {

	static ConfigReader	c=new ConfigReader();
	static Properties confProperty=null;
	
public	Properties prop;
	
	public   Base( String propertyname) throws IOException
	{
	
	 prop=new Properties();
	File f=new File(System.getProperty("user.dir")+"\\src\\main\\java\\TestNG\\"+propertyname+".properties");
	System.out.println(System.getProperty("user.dir")+"\\src\\main\\java\\TestNG\\"+propertyname+".properties");
	FileInputStream fi=new FileInputStream(f);
	prop.load(fi);
	}


	public  WebDriver browserinitialization() throws IOException
	{
		confProperty= c.init("config");
		


		WebDriver driver = null;

		String brows="chrome";
		System.out.println(brows);
		if(brows.equalsIgnoreCase(confProperty.getProperty("browser")))
		{
			driver = new ChromeDriver();
			

		}
		else if(brows.equalsIgnoreCase("firefox"))
			
		{
			driver = new FirefoxDriver();
	
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Utilities.implicitWait));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Utilities.implicitWait));
		driver.get(prop.getProperty("url"));
		return driver;
	}
	
	
	
	
	
	
	
	
	

}
