package practiceExtentMaven;

import java.awt.Desktop;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.CodeLanguage;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Chapter5 {
	public static void main(String args[])
	{
		File f=new File("reports.html");
		ExtentReports extent=new ExtentReports();
		ExtentSparkReporter  sparkReporter=new ExtentSparkReporter(f);
		extent.attachReporter(sparkReporter);
		
		
		
		String xmData="<note>\r\n"
				+ "<to>Tove</to>\r\n"
				+ "<from>Jani</from>\r\n"
				+ "<heading>Reminder</heading>\r\n"
				+ "<body>Don't forget me this weekend!</body>\r\n"
				+ "</note>";
		String jsonData="{\r\n"
				+ "    \"firstName\": \"John\",\r\n"
				+ "    \"lastName\": \"Doe\"\r\n"
				+ "}";
		//this will log the information in different format
		ExtentTest xmlData=extent.createTest("xmlData").fail(MarkupHelper.createCodeBlock(xmData, CodeLanguage.XML));
		ExtentTest jsonData1=extent.createTest("jsonData").info(MarkupHelper.createCodeBlock(jsonData, CodeLanguage.JSON));
		//this will lofg the information of list,set, or map
		
		List<String> listData=new ArrayList<String>();
		listData.add("a");
		listData.add("b");
		listData.add("c");
		
		Map<Integer,String> mapData=new HashMap<Integer,String>();
		mapData.put(1, "a");
		mapData.put(2, "b");
		extent.createTest("listData").pass(MarkupHelper.createOrderedList(listData));
		extent.createTest("listData").fail(MarkupHelper.createUnorderedList(mapData));
		//heighlight the test
		
		extent.createTest("heighlight the test").pass(MarkupHelper.createLabel("This is the highlighted text", ExtentColor.GREEN));
		//log the exceptions
		
		
		try {
			int i=5/0;
		}
		catch(Exception e)
		{
			extent.createTest("Exception Test1").fail(e);
		}
		//customised exception
		Throwable t=new RuntimeException("This ts custom exception");
		extent.createTest("customised exception").fail(t);
			


		
		
		
		

		
		
		
		
	
		
		
		extent.flush();
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
	}
	

}
