package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException
	{
        ChromeDriver driver= new ChromeDriver();
		
        driver.get("https://grotechminds.com/registration/");
        driver.manage().window().maximize();
       // WebElement AutomateMe=driver.findElement(By.linkText("Automate me"));
        //AutomateMe.click();
        Thread.sleep(4000);
        WebElement upload=driver.findElement(By.xpath("//input[@id='file']"));
        upload.sendKeys("F:\\Testing\\Notes\\SeleniumP1.pdf");
        Thread.sleep(4000);
        driver.close();
	}

}
