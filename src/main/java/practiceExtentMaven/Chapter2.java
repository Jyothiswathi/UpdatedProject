package practiceExtentMaven;

import java.awt.Desktop;
import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Chapter2 {
	public static void main(String args[])
	{
		File f=new File("reports.html");
		ExtentReports extent=new ExtentReports();
		ExtentSparkReporter  sparkReporter=new ExtentSparkReporter(f);
		extent.attachReporter(sparkReporter);
		ExtentTest test1=extent.createTest("Test1");
		test1.log(Status.PASS, "Pass");
		test1.log(Status.FAIL, "fail");
		test1.log(Status.INFO, "info");
		test1.log(Status.SKIP, "skip");
		test1.log(Status.WARNING, "worn");
		
		
		
		
	
		
		
		extent.flush();
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
	}
	

}
