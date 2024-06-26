package seleniumPractice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class CalendarControl
{
	public static void main(String[]args)
{
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		driver.manage().window().fullscreen();
		WebElement firstDate=driver.findElement(By.xpath("//input[@id='first_date_picker']"));
		firstDate.click();
		
		WebDriverWait w= new WebDriverWait(driver, Duration.ofSeconds(5));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("ui-datepicker-div")));
		String monthYear=driver.findElement(By.className("ui-datepicker-title")).getText();
		
		String eDate="05/12/2025";
		String eDay=eDate.split("/")[1].trim();
		String emonth=eDate.split("/")[0].trim();
		String eyear=eDate.split("/")[2].trim();
		
		System.out.println(monthYear);
		String month=monthYear.split(" ")[0].trim();
		String year=monthYear.split(" ")[1].trim();
		System.out.println(month);
		System.out.println(year);
		
		// to select future date
		while(!(month.equals(emonth) && year.equals(eyear)))
		{
			if(Integer.parseInt(eyear)>=Integer.parseInt(year)) 
			{
			WebElement nextButton=driver.findElement(By.xpath("//span[text()='Next']"));
			nextButton.click();
			monthYear=driver.findElement(By.className("ui-datepicker-title")).getText();
			month=monthYear.split(" ")[0].trim();
			year=monthYear.split(" ")[1].trim();
			}
			else
			{
				WebElement nextButton=driver.findElement(By.xpath("//span[text()='Prev']"));
				nextButton.click();
				monthYear=driver.findElement(By.className("ui-datepicker-title")).getText();
				month=monthYear.split(" ")[0].trim();
				year=monthYear.split(" ")[1].trim();
			}
			
			
		}
		WebElement day=driver.findElement(By.xpath("//a[text()='3']"));
		day.click();
}
}

	
	
	


