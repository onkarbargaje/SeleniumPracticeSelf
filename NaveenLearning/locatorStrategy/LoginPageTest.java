package locatorStrategy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageTest {

	public static void main(String[] args) {
		BrowserUtils broUtil = new BrowserUtils();
		WebDriver driver = broUtil.initDriver("chrome");
		broUtil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		By logoImage = By.xpath("//img[@title='naveenopencart']");
		By emailId = By.id("input-email");
		By pwd = By.id("input-password");
		By loginBt = By.xpath("//input[@type='submit']");

		ElementUtils eleUtil = new ElementUtils(driver);
		boolean flag = eleUtil.doElementDisplayed(logoImage);
		if (flag) {
			System.out.println("Test case passed");
		} else {
			System.out.println("Test case failed");
		}

		eleUtil.doSendKeys(emailId, "bargajeonkar99@gmail.com");
		eleUtil.doSendKeys(pwd, "Opencart@1234");
		eleUtil.doClick(loginBt);

	}

}
