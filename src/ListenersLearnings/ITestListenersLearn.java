package ListenersLearnings;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ITestListenersLearn implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("this is on Test Start");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("this is onTestSuccess");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("this is onTestFailure");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("this is onTestSkipped");
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("this is onTestFailedWithTimeout");
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("this is on Start");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("this is on Finish");
	}
	

}
