package otherLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativeLocatorConcept {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver= new ChromeDriver();
		driver.get("https://www.aqi.in/dashboard/canada");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		WebElement cityEle=driver.findElement(By.xpath("(//a[contains(@href,'whitehorse')])[1]"));
		
		String rightText=driver.findElement(with(By.tagName("p")).toRightOf(cityEle)).getText();
		System.out.println(rightText);
		
		String leftText=driver.findElement(with(By.tagName("p")).toLeftOf(cityEle)).getText();
		System.out.println(leftText);
		
		String aboveText=driver.findElement(with(By.tagName("a")).above(cityEle)).getText();
		System.out.println(aboveText);
		
		String belowText=driver.findElement(with(By.tagName("p")).below(cityEle)).getText();
		System.out.println(belowText);;

	}

}
