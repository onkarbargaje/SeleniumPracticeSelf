package locatorStrategy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDDAllElements {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/30-day-free-trial");
		driver.manage().window().maximize();

		// Select select = new Select(driver.findElement(countryDd));
		// List<WebElement> countryList = select.getOptions();
		// System.out.println(countryList.size());

		// for (WebElement e : countryList) {
		// String countryName = e.getText();
		// System.out.println(countryName);
		// }

		By countryDd = By.id("Form_getForm_Country");
		if (getSizeOfDropdownList(countryDd) - 1 == 232)

		{
			System.out.println("Country dropdown options count is correct");
		}

		if (doGetAllOptionsTextFromDd(countryDd).contains("India")) {
			System.out.println("Country:India is present is dropdown");
		}
		
		List<String> countryList=Arrays.asList("India", "Algeria", "Bhutan", "Brazil");
		if (doGetAllOptionsTextFromDd(countryDd).containsAll(countryList)) {
			System.out.println(countryList + "these countries are present dropdown");
		}
		
		doSelectValueFromDropDown(countryDd, "Brazil");

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static List<WebElement> doGetAllOptionsFromDd(By locator) {

		Select select = new Select(getElement(locator));
		return select.getOptions();

	}
	
	public static void doSelectValueFromDropDown(By locator, String expValue)
	{
		List<WebElement> ddList=doGetAllOptionsFromDd(locator);
		for (WebElement e: ddList)
		{
			String ddText=e.getText();
			if(ddText.equals(expValue))
			{
				e.click();
				break;
			}
			
		}
		System.out.println(expValue + "option is selected from dropdown");
	}

	public static List<String> doGetAllOptionsTextFromDd(By locator) {
		List<WebElement> options = doGetAllOptionsFromDd(locator);
		List<String> DdOptionText = new ArrayList<String>();
		for (WebElement e : options) {
			String optionText = e.getText();
			DdOptionText.add(optionText);
			//System.out.println(optionText);
		}
		return DdOptionText;
	}

	public static int getSizeOfDropdownList(By locator) {
		return doGetAllOptionsFromDd(locator).size();
	}
}
