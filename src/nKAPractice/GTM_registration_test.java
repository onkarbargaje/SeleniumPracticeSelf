package nKAPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GTM_registration_test {

	public static void main(String[] args) 
	{
		BrowserUtil browUtil= new BrowserUtil();
		WebDriver driver=browUtil.initDriver("firefox");
		browUtil.launchUrl("https://grotechminds.com/registration/");
		
		
		By fName=By.id("fname");
		By lName=By.id("lname");
		By email=By.id("email");
		By pwd=By.id("password");
		
		
		ElementUtil eleUtil= new ElementUtil(driver);
		eleUtil.doSendKeys(fName, "Onar");
		eleUtil.doSendKeys(lName, "Pajher");
		eleUtil.doSendKeys(email, "onka@gmail.com");
		eleUtil.doSendKeys(pwd, "and#123");
		
		
		

	}

}
