package dropDrownList_Homework;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropDownList_III {

	@Test
	public void SelectDDValues() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://aprende-web.net/html/");
		
		driver.manage().window().maximize();
		
		WebElement Idioms = driver.findElement(By.xpath("//select[@class='goog-te-combo']"));
		
		Select all_idi = new Select(Idioms);
		
		List<WebElement> Idioum_List = all_idi.getOptions();
		
		int total_idioms = Idioum_List.size();
		
		Assert.assertEquals(total_idioms, 109);
		
		System.out.println("Total idioms count is: " + total_idioms);
		
		int counter = 0;
		
			for(WebElement languages:Idioum_List)
			{
				
				String idiom_name = languages.getText();
				
				System.out.println("Language "+ counter + ". " + idiom_name);
				
				counter++;
			}
		
		driver.quit();
		
	}
	
	
}
