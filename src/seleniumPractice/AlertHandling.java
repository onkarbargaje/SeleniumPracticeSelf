package seleniumPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertHandling {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver= new ChromeDriver();
	    driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();
        
		/*
		 * driver.findElement(By.xpath("//*[@id='alertButton']")).click(); Alert
		 * alert=driver.switchTo().alert();
		 * 
		 * 
		 * System.out.println(alert.getText());
		 * 
		 * alert.accept();
		 */
        
        //2 alert
        
		/*
		 * driver.findElement(By.xpath("//*[@id='timerAlertButton']")).click();
		 * Thread.sleep(6000); Alert alert=driver.switchTo().alert(); alert.accept();
		 * //WebDriverWait wait= new WebDriverWait(driver, null);
		 * //wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(
		 * "confirmResult"))); System.out.println(alert.getText());
		 */
        
        //3 alert
        
		/*
		 * driver.findElement(By.xpath("//*[@id='confirmButton']")).click();
		 * Thread.sleep(5000); Alert alert=driver.switchTo().alert(); alert.dismiss();
		 */
        
        
        //4 alert
        
        driver.findElement(By.xpath("//button[@id='promtButton']")).click();
        Thread.sleep(4000);
        Alert alert=driver.switchTo().alert();
        alert.sendKeys("Onkar");
        Thread.sleep(4000);
        alert.accept();



	}

}
