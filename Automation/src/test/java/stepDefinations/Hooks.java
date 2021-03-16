package stepDefinations;

import Cucumber.Automation.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Base{

	@Before("@MobileTest")
	public void beforevalidation() 
	{
		System.out.println("----  Before Mobile Hook");
	}

	@After("@MobileTest")
	public void aftervalidation() 
	{
		System.out.println("****  After Mobile Hook");
	}
	
	@Before("@WebTest")
	public void beforeWebvalidation() 
	{
		System.out.println("----  Before Web Hook");
	}

	@After("@SmokeTest")
	public void afterWebvalidation() 
	{
		driver.close();
	}
	
	@After("@RegresionTest")
	public void afterWebCheckOut() 
	{
		driver.close();
	}
}
