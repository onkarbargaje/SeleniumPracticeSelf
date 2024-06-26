package locatorStrategy;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementUtils {
	private WebDriver driver;
	// we are creating private webdriver because if someone after creating Object
	// of ElementUtils they will get Null pointer exception as driver is null
	// to avoid this by creating private we restricted to create Object of this
	// class
	// by creating constructor we are giving driver reference this.driver=driver

	public ElementUtils(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);

	}

	public void doClick(By locator) {
		getElement(locator).click();
	}

	public String doGetText(By locator) {
		return getElement(locator).getText();
	}

	public boolean doElementDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}

	/// count of WebElements on page

	public int doGetCountOfElements(By locator) {
		int elementCount = getElements(locator).size();
		System.out.println("Total element count is for   " + locator + " is " + elementCount);
		return elementCount;
	}

	/**
	 * utility for getting the element attributes
	 */

	public void getElementAttributes(By locator, String attributeName) {
		List<WebElement> eleList = getElements(locator);
		for (WebElement e : eleList) {
			String attributeValue = e.getAttribute(attributeName);
			System.out.println(attributeValue);
		}

	}
	// utility to get attribute name

	public String getElementAttribute(By locator, String attributeName) {
		return getElement(locator).getAttribute(attributeName);
	}
	// ******SELECT based dropdown******************
	// utility to get the Elements from specific webPage section and
	// add that webElement in empty ArrayList for further processing

	public List<String> getElementTextList(By locator) {
		List<String> eachEleText = new ArrayList<String>();
		List<WebElement> eleList = getElements(locator);
		for (WebElement e : eleList) {
			String elementText = e.getText();

			// from above it will return only first text as it is list
			// so we have to create empty ArratList and add text into this
			eachEleText.add(elementText);

		}
		return eachEleText;
	}

	// Utilities to select the dd value for SELECT dropdown

	public void doSelectDDbyIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);

	}

	public void doSelectDDbyValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}

	public void doSelectDDbyVisibleText(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(value);

	}

	/// **** select option from dd without using Select class methods

	public List<WebElement> doGetAllOptionsFromDd(By locator) {

		Select select = new Select(getElement(locator));
		return select.getOptions();

	}

	public void doSelectValueFromDropDown(By locator, String expValue) {
		List<WebElement> ddList = doGetAllOptionsFromDd(locator);
		for (WebElement e : ddList) {
			String ddText = e.getText();
			if (ddText.equals(expValue)) {
				e.click();
				break;
			}

		}
		System.out.println(expValue + "option is selected from dropdown");
	}

	public List<String> doGetAllOptionsTextFromDd(By locator) {
		List<WebElement> options = doGetAllOptionsFromDd(locator);
		List<String> DdOptionText = new ArrayList<String>();
		for (WebElement e : options) {
			String optionText = e.getText();
			DdOptionText.add(optionText);
			// System.out.println(optionText);
		}
		return DdOptionText;
	}

	public int getSizeOfDropdownList(By locator) {
		return doGetAllOptionsFromDd(locator).size();
	}

	/// ***SuggestionListOptionSelection*****//////
	public void doClickOnSpecificOptionFromSuggList(By suggList, String expOption) {
		List<WebElement> searchResult = getElements(suggList);
		System.out.println(searchResult.size());
		for (WebElement e : searchResult) {
			String text = e.getText();
			System.out.println(text);
			if (text.contains(expOption)) {
				e.click();
				break;
			}
		}
	}
	
	//===================Wait strategy============================================
	
	/**
	 * An expectation for checking that an element is present on the DOM of a page. 
	 * This does not necessarily mean that the element is visible.
	 * @param locator
	 * @param timeOut
	 * @return
	 */
	public  WebElement waitForPresenceOfElement(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));

	}
	
	
	/**
	 * An expectation for checking that an element is present on the DOM of a page and visible. 
	 * Visibility means that the element is not only displayed but also has a height and width that is greater than 0.
	 * @param locator
	 * @param timeOut
	 * @return
	 */
	public WebElement waitForVisibilityOfElement(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

	}

}
