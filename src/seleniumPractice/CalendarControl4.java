package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarControl4 {

	public static void main(String[] args)
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		driver.manage().window().fullscreen();
		WebElement sixthDate=driver.findElement(By.xpath("//img[@title='Calendar-icon']"));
		sixthDate.click();
		
		String eDate= "April/29/2025";
		String eMonth=eDate.split("/")[0].trim();
		String eDay=eDate.split("/")[1].trim();
		String eYear=eDate.split("/")[2].trim();
		
		String monthYear=driver.findElement(By.className("ui-datepicker-title")).getText();
		String month=monthYear.split(" ")[0].trim();
		String year=monthYear.split(" ")[1].trim();
		System.out.println(month);
		System.out.println(year);
		
		while(!(month.equals(eMonth) && year.equals(eYear)))
				{
			      WebElement nextButton=driver.findElement(By.xpath("//span[text()='Next']"));
			      nextButton.click();
			      monthYear=driver.findElement(By.className("ui-datepicker-title")).getText();
				  month=monthYear.split(" ")[0].trim();
				  year=monthYear.split(" ")[1].trim();
			
				}
		
		WebElement day=driver.findElement(By.xpath("//a[text()='"+eDay+"']"));
		day.click();
		
		     

	}

}
