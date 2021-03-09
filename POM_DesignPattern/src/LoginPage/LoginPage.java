/**
 * 
 */
package LoginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author USER
 *
 * It will store all locator and credentials
 *
 */
public class LoginPage {

	WebDriver driver;
	
	By user = By.id("user_login");
	By password = By.name("pwd");
	By LogIn = By.xpath("//input[@id='wp-submit']");
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void UserInput (String Id)
	{
		driver.findElement(user).sendKeys(Id);
	}
	
	public void PasswordInput(String Pss)
	{
		driver.findElement(password).sendKeys(Pss);
	}
	
	public void LogInInput ()
	{
		driver.findElement(LogIn).click();
	}
}
