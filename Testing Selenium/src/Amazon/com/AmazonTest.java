package Amazon.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTest {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/ap/register?showRememberMe=true&openid.pape.max_auth_age=0&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&language=es&pageId=usflex&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F-%2Fes%2Fgp%2Fcustomer-preferences%2Fselect-language%2Fref%3Dnav_ya_signin%3FpreferencesReturnUrl%3D%252F-%252Fes%252Fgp%252Fcustomer-preferences%252Fselect-language%252Fref%253Dtopnav_lang_ais%253FpreferencesReturnUrl%253D%25252F&prevRID=8AK2XRZHE6PAVH2M78TT&openid.assoc_handle=usflex&openid.mode=checkid_setup&prepopulatedLoginId=&failedSignInCount=0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");

		driver.manage().window().maximize();
		
		// 1. ID
		driver.findElement(By.id("ap_customer_name")).sendKeys("Space X");
		
		// 2. Name
		driver.findElement(By.name("email")).sendKeys("Company");
		
		// 3. CSS
		driver.findElement(By.cssSelector("input[type*='Pass'][name$='word']")).sendKeys("123456");;
		
		// 4. Path
		driver.findElement(By.xpath("//input[@type='password' and @id='ap_password_check']")).sendKeys("123456");
		
		// 5. LinkTest
		driver.findElement(By.linkText("Condiciones de Uso")).click();
		
	}

}
