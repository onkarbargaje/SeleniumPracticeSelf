package seleniumPractice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_Modal_dd {

	public static void main(String[] args) throws InterruptedException 
	{
		//ChromeDriver driver= new ChromeDriver();
		WebDriver driver= new ChromeDriver();
        //driver.
        //WebDriver driver = new WebDriver();
		driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        WebElement hover=driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
        Actions a1= new Actions(driver);
        a1.moveToElement(hover).perform();
        WebElement signIN=driver.findElement(By.xpath("//span[contains(text(),'Sign in')]"));
        signIN.click();
        
        WebElement emailId=driver.findElement(By.id("ap_email"));
        emailId.sendKeys("8788628159");
        WebElement continue_bt=driver.findElement(By.id("continue"));
        continue_bt.click();
        
        WebElement password=driver.findElement(By.id("ap_password"));
        password.sendKeys("Testing@1234");
        
        WebElement signIn_bt=driver.findElement(By.id("signInSubmit"));
        signIn_bt.click();
        
        Thread.sleep(2000);
        
        WebElement search_tb=driver.findElement(By.id("twotabsearchtextbox"));
        search_tb.sendKeys("mobile");
        
        WebElement search_bt=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
        search_bt.click();
        
        WebElement search_r=driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]"));
        search_r.click();
        
        Set<String> ids=driver.getWindowHandles();
		Iterator<String> itr=ids.iterator();
		String parentID=itr.next();
		String childID=itr.next();
		driver.switchTo().window(childID);
		
		WebElement buyNow_bt=driver.findElement(By.xpath("//input[@id='buy-now-button']"));
		buyNow_bt.click();
		
		WebElement useThisAddress=driver.findElement(By.xpath("//input[@data-testid='Address_selectShipToThisAddress']"));
		useThisAddress.click();
		
		Thread.sleep(10000);
		
		WebElement creditDebitCard=driver.findElement(By.xpath("//input[@value='SelectableAddCreditCard']"));
		creditDebitCard.click();
		
		WebElement enterCreditDebitCardLink=driver.findElement(By.xpath("(//a[.='Enter card details'])[1]"));
		enterCreditDebitCardLink.click();
		
		System.out.println(driver.getCurrentUrl());
		
		//driver.switchTo().activeElement();
		driver.switchTo().frame(0);
        
        //WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
        
       //wait.until(ExpectedConditions.visibilityOf(enterCreditDebitCardLink)
        
       // Assert.assertTrue(true);
		
		//WebElement modalpopup= wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.a-popover-wrapper")));
		//WebElement cardNumber= modalpopup.findElement(By.xpath("//input[@name='addCreditCardNumber']"));
		//cardNumber.sendKeys("1234");
		//WebElement modalHeader=driver.findElement(By.xpath("//div/header/h4[@class='a-popover-header-content']"));
		//modalHeader.getText();
		//System.out.println(modalHeader.getText());
       WebElement closeTheModalPopup=driver.findElement(By.xpath("(//div[@class='a-popover-wrapper']//button)[1]"));
        closeTheModalPopup.click();

	}

}
