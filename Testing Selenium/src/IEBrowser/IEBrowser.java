package IEBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEBrowser {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.ie.driver", "C:\\Users\\USER\\Documents\\Selenium\\IEDriverServer_Win32_3.150.1\\IEDriverServer.exe");
		
		WebDriver driver = new InternetExplorerDriver();

		driver.get("https://es-la.facebook.com/");
		
		//System.out.print(driver.getTitle());
		
		driver.findElement(By.id("email")).sendKeys("Space X");
		
	}

}
