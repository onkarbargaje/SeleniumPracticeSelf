package seleniumPractice;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCaps 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver= new ChromeDriver();
		DesiredCapabilities caps= new DesiredCapabilities();
		//caps.setAcceptInsecureCerts(false);
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--inognito");
		options.addArguments("--start-maximized");
		driver.get("https://www.google.com/");
		//driver.manage().window().maximize();
		
		
	}

}
