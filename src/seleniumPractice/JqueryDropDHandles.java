package seleniumPractice;

import org.bouncycastle.oer.its.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JqueryDropDHandles {

	public static void main(String[] args) 
	{
		ChromeDriver driver= new ChromeDriver();
	    driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
        driver.manage().window().maximize();
        
        WebElement multiSelectDD=driver.findElement(By.id("justAnInputBox"));
        multiSelectDD.click();
        
        WebElement multiSelectDDOption1= driver.findElement(By.xpath("(//span[contains(text(),'choice 6 1')])[1]"));
        WebElement multiSelectDDOption2= driver.findElement(By.xpath("(//span[contains(text(),'choice 6 2')])[1]"));
        multiSelectDDOption1.click();
        multiSelectDDOption2.click();
        WebDriverWait wait= new WebDriverWait (driver,null);
        wait.until(ExpectedConditions.visibilityOf(multiSelectDDOption1));
        driver.quit();

	}

}
