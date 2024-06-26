package otherLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrame {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/iframe-scenario/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("pact1");
		WebElement frame1=driver.findElement(By.id("inp_val"));
		frame1.sendKeys("Wow");
		
		driver.switchTo().frame("pact2");
		WebElement frame2=driver.findElement(By.id("jex"));
		frame2.sendKeys("qioa");

	}

}
