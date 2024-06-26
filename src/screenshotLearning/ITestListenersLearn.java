package screenshotLearning;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ITestListenersLearn extends Base implements ITestListener 
{

	

	@Override
	public void onTestFailure(ITestResult result) 
	{
		captureScreenshot(result.getMethod().getMethodName()+ ".jpg");
		
	}

	

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("this is onTestFailedWithTimeout");
	}

	

}
