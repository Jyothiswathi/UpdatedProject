package Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ItestListener implements ITestListener {

	public void onTestStart(ITestResult result) {
		
		
		System.out.println("on test start");
		}

	public void onTestSuccess(ITestResult result) {
		
		System.out.println("on test pass");

	
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("on test fail");


	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("on test skipped");


	}

	public void onStart(ITestContext context) {
		System.out.println("on test started");

	
	}

	public void onFinish(ITestContext context) {
		System.out.println("on test close");


	}
	
	
	

}
