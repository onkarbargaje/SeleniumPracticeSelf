package xpathStrategy;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FooterSectionConcept {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

	//	List<WebElement> footerList = driver
	//			.findElements(By.xpath("//h5[text()='Extras']/following-sibling::ul//a"));
	//	System.out.println(footerList.size());
//
	//	for (WebElement e : footerList) {
	//		String text = e.getText();
	//		System.out.println(text);
	//	}
		
		List<String> listOptions=doGetFooterOptionList("My Account");
		System.out.println(listOptions);

	}
	
	public static List<String> doGetFooterOptionList(String footerSection)
	{
		List<WebElement> footerList = driver
				.findElements(By.xpath("//h5[text()='"+footerSection+"']/following-sibling::ul//a"));
		System.out.println(footerList.size());
        List<String> footerOptions= new ArrayList<String>();
		for (WebElement e : footerList) {
			String text = e.getText();
			footerOptions.add(text);
			//System.out.println(text);
		}
		return footerOptions;
	}

}
