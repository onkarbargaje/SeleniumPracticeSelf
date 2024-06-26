package locatorStrategy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegPageTest {

	public static void main(String[] args) 
	{

		BrowserUtils broUtil= new BrowserUtils();
		WebDriver driver=broUtil.initDriver("firefox");
		// returning WedDriver driver reference to continue with same driver reference
		// which has initialise chrome for rest of further interaction
		broUtil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By fName=By.id("input-firstname");
		By lName=By.id("input-lastname");
		By email=By.id("input-email");
		By phoneNo=By.id("input-telephone");
		By pwd=By.id("input-password");
		By confPwd=By.id("input-confirm");
		By checkBx=By.xpath("//input[@type='checkbox']");
		By continueBt=By.xpath("//input[@type='submit']");
		By rewPoints=By.linkText("Reward Points");
		
		ElementUtils eleUtils= new ElementUtils(driver);
		eleUtils.doSendKeys(fName, "onkar");
		eleUtils.doSendKeys(lName, "Bargaje");
		eleUtils.doSendKeys(email, "onkar@gmail.com");
		eleUtils.doSendKeys(phoneNo, "9023456910");
		eleUtils.doSendKeys(pwd, "Onkae@1234");
		eleUtils.doSendKeys(confPwd, "Onkae@1234");
		eleUtils.doClick(checkBx);
		eleUtils.doClick(continueBt);
		String text=eleUtils.doGetText(rewPoints);
		System.out.println(text);
		

	}

}
