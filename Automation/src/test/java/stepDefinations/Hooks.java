package stepDefinations;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

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

	@After("@WebTest")
	public void afterWebvalidation() 
	{
		System.out.println("****  After web Hook");
	}
}
