package selectDropDownList;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDownList_I {

	@Test
	public void SelectDDValues() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://aprende-web.net/html/");
		
		driver.manage().window().maximize();
		
		WebElement Idioms = driver.findElement(By.xpath("//select[@class='goog-te-combo']"));
		
		Select all_idi = new Select(Idioms);
		
		// It will select Arabe
		all_idi.selectByIndex(5);
		
		Thread.sleep(3000);
		
		// It will select Bengali
		all_idi.selectByValue("bn");
		
		Thread.sleep(3000);
		
		// It will select Eslovaco - THIS IS MOST RECOMMENDED Because visible text usually don't change
		all_idi.selectByVisibleText("eslovaco");
		
	}
	
	
}
