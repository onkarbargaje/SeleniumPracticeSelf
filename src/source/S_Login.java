package source;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class S_Login 
{
	@FindBy(id="email")
	WebElement username;
	
	@FindBy(id="pass")
	WebElement password;
	
	@FindBy(name="login")
	WebElement login;
	
	public void un()
	{
		this.un();
		username.sendKeys("onkarbargaje99@gmail.com");
	}
	
	public void pwd()
	{
		//this.pwd();
		password.sendKeys("password");
	}
	
	public void login()
	{
		//this.login();
		login.click();
	}
	
	

}
