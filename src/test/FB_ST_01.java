package test;

import org.testng.annotations.Test;

import source.S_Login;

public class FB_ST_01 extends Launc_Quit
{
	@Test
	public void scenrio()
	{
		S_Login l1= new S_Login();
		l1.un();
		l1.pwd();
		l1.login();
		
	}
	

}
