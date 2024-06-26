package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IrctcTicket {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver= new ChromeDriver ();
		driver.manage().window().maximize();
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(5000);
         //WebElement from_tf=driver.findElement(By.xpath("//p-autocomplete[@id=\"origin\"]"));
         //from_tf.click();
         //WebElement from_tf1=driver.findElement(By.xpath("//label[contains(text(),'From')]"));
         //from_tf1.sendKeys("Solapur"); 
          //WebElement to_tf=driver.findElement(By.xpath("//label[contains(text(),'To')]"));
         //to_tf.sendKeys("Pune"); 
         
         String text = driver.findElement(By.xpath("//label[contains(text(),'From')]")).getAttribute("label");
         System.out.println(text);
         driver.close();
	}

}
