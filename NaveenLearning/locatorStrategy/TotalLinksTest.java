package locatorStrategy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TotalLinksTest {
	// print all links present
	// get no. of links
	// print text of each link

	public static void main(String[] args) {
		BrowserUtils broUtil = new BrowserUtils();
		WebDriver driver = broUtil.initDriver("chrome");
		broUtil.launchURL("https://www.amazon.in/");

		By aTag = By.tagName("a");

		// ElementUtils eleUtil = new ElementUtils(driver);
		// int linksCount=eleUtil.doGetCountOfLinks(aTag);
		List<WebElement> linkList = driver.findElements(aTag);
		int listCount = linkList.size();
		System.out.println("total links count " + listCount);

		// to get text of links
		// remove the linkText which is having blank text
		for (int i = 0; i < listCount; i++) {
			String linkText = linkList.get(i).getText();
			if (linkText.length() > 0) {
				System.out.println(i + ":" + linkText);
			}

		}
		System.out.println("______________________________________");
		// for each
		int count = 0;
		for (WebElement e : linkList) {
			String text = e.getText();
			if (text.length() > 0) {
				System.out.println(count + ":" + text);
			}
			count++;
		}

	}

}
