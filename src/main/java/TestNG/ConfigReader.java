package TestNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	
	public Properties init( String propertyname) throws IOException
	{
	Properties prop=new Properties();
	File f=new File(System.getProperty("user.dir")+"\\src\\main\\java\\TestNG\\"+propertyname+".properties");
	System.out.println(System.getProperty("user.dir")+"\\src\\main\\java\\TestNG\\"+propertyname+".properties");
	FileInputStream fi=new FileInputStream(f);
	prop.load(fi);
	return prop;
	
	}
}
