package listeners;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class Listeners extends TestListenerAdapter{

	public void onTestStart(ITestResult tr)
	{
		System.out.println("Test started");
	}

	public void onTestSuccess(ITestResult tr)
	{
		System.out.println("Test passed");
	}

	
	public void onTestFailure(ITestResult tr)
	{
		System.out.println("Test failed");
	}

	
	public void onTestSjipped(ITestResult tr)
	{
		System.out.println("Test skipped");
	}

}
