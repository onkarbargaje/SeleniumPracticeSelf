package seleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalendarControl2

{
	static WebDriver driver;
	public static void main(String[] args) 
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		driver.manage().window().fullscreen();
		WebElement firstDate=driver.findElement(By.xpath("//input[@id='first_date_picker']"));
		firstDate.click();
		
		WebDriverWait w= new WebDriverWait(driver, Duration.ofSeconds(5));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("ui-datepicker-div")));
		
		
		selectDate("03", "November", "2026");
		
		
	}
	// generic method for split monthYear
	public static String[] getMonthYear (String monthYearValue)
	{
		return monthYearValue.split(" ");
	}

	public static void selectDate(String expDay, String expMonth, String expYear) 
	{
          String monthYearValue=driver.findElement(By.className("ui-datepicker-title")).getText();
		
		System.out.println(monthYearValue);
		
		
		// to select future date
		while(!(getMonthYear(monthYearValue)[0].equals(expYear) && getMonthYear(monthYearValue)[1].equals(expMonth)))
		{
			WebElement nextButton=driver.findElement(By.xpath("//span[text()='Next']"));
			nextButton.click();
			monthYearValue=driver.findElement(By.className("ui-datepicker-title")).getText();
			
			
		}
		WebElement day=driver.findElement(By.xpath("//a[text()='"+expDay+"']"));
		day.click();


	}

}
