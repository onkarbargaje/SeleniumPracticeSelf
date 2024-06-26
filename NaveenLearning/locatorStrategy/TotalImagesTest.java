package locatorStrategy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TotalImagesTest {

	public static void main(String[] args) 
	{
		BrowserUtils broUtil = new BrowserUtils();
		WebDriver driver = broUtil.initDriver("chrome");
		broUtil.launchURL("https://www.amazon.in/");

		By imageTag = By.tagName("img");
		List<WebElement> imageList = driver.findElements(imageTag);
		int imageCount = imageList.size();
		System.out.println("total images count " + imageCount);

		// to get text of links
		// remove the linkText which is having blank text
		//for (int i = 0; i < listCount; i++) {
		//	String linkText = linkList.get(i).getText();
			//if (linkText.length() > 0) {
				//System.out.println(i + ":" + linkText);

	}

}
