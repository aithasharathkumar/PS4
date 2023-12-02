package utilities;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListener implements ITestListener {
	
	public void onTestStart(ITestResult result) {
		System.out.println("Test Case Started");	
		}
	
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Case Passed");	
		}
	
	public void onTestFailure(ITestResult result) {
		System.out.println("Test Case Failed");	
		
		}
	
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Case Skipped");	
		}
	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
			
		}
	
	public void onStart(ITestResult result) {
		System.out.println("TestNG Started");	
		}
	
	public void onFinish(ITestResult result) {
		System.out.println("TestNG Finished");	
		}

}
