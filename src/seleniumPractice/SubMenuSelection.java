package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SubMenuSelection {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement shopByMenu=driver.findElement(By.xpath("//div[@class='Header___StyledCategoryMenu2-sc-19kl9m3-13 ibVaum']")); //(//div[@class='relative h-full'])[4]//div[@class='Header___StyledCategoryMenu2-sc-19kl9m3-13 ibVaum']
		Thread.sleep(2000);
		WebElement menu1=driver.findElement(By.xpath("(//a[contains(text(),'Kitchen, Garden & Pets')])[2]"));
		Thread.sleep(2000);
		WebElement menu2=driver.findElement(By.xpath("(//a[contains(text(),'Crockery & Cutlery')])[2]"));
		Thread.sleep(2000);
		WebElement menu3=driver.findElement(By.xpath("//a[contains(text(),'Glassware')]"));
		
		shopByMenu.click();
		Actions act= new Actions(driver);
		act.moveToElement(menu1).build().perform();
		act.moveToElement(menu2).build().perform();
		menu3.click();
		
		driver.close();
		
	}

}
