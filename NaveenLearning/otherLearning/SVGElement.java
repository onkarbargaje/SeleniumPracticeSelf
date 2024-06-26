package otherLearning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SVGElement {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://petdiseasealerts.org/alerts-map/#/");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		List<WebElement> countries = driver.findElements(
				By.xpath("//*[local-name()='svg']//*[name()='g' and @id='states']//*[name()='g' and @class='state']"));

		
		System.out.println(countries.size());
		for (WebElement country : countries) {
		String countryName = country.getAttribute("id");
			System.out.println(countryName);
		}
		
		
	}
	
	

}
