package otherLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDOMConcept {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/iframe-in-shadow-dom/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//driver.findElement(By.id("pizza")).sendKeys("plane");
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		WebElement pizza =(WebElement)js.executeScript("return document.querySelector(\"#userName\").shadowRoot.querySelector(\"#app2\").shadowRoot.querySelector(\"#pizza\")");
	    pizza.sendKeys("Vadapav");
		

}
}
