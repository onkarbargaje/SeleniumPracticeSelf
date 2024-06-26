package otherLearning;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertJS {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		
		//Thread.sleep(3000);
		
		//Alert alert=driver.switchTo().alert();
		
		//System.out.println(alert.getText());
		
		//alert.accept();
		
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		
        Thread.sleep(3000);
		
		Alert alert=driver.switchTo().alert();
		
		System.out.println(alert.getText());
		
		alert.accept();

	}

}
