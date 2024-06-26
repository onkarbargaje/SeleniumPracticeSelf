package seleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalendarControl3 {

	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		driver.manage().window().maximize();
		WebElement secondDate=driver.findElement(By.xpath("//input[@id='fourth_date_picker']"));
		secondDate.click();
        
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ui-datepicker-div")));
		
		String date= "May/28/2025";
		
		String[] dateArr=date.split("/");
		String month= dateArr[0];
		String day= dateArr[1];
		String year= dateArr[2];
		
		Select s1= new Select(driver.findElement(By.className("ui-datepicker-month")));
        s1.selectByVisibleText(month);
        
        Select s2= new Select(driver.findElement(By.className("ui-datepicker-year")));
        s2.selectByVisibleText(year);
        
        WebElement eDay=driver.findElement(By.xpath("//a[text()='"+day+"']"));
        eDay.click();
		


	}

}
