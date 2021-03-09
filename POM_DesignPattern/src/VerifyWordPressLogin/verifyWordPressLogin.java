/**
 * 
 */
package VerifyWordPressLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import LoginPage.LoginPage;

/**
 * @author USER
 *
 */
public class verifyWordPressLogin {

	@Test
	public void VerifyWPLogin()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demosite.center/wordpress/wp-login.php");

		driver.manage().window().maximize();
		
		LoginPage login = new LoginPage(driver);
		
		login.UserInput("admin");
		
		login.PasswordInput("demo123");
		
		login.LogInInput();
		
		driver.quit();
	}
	
	
}
