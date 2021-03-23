package dropDrownList_Homework;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDownList_II {

	@Test
	public void SelectDDValues() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://aprende-web.net/html/");
		
		driver.manage().window().maximize();
		
		WebElement Idioms = driver.findElement(By.xpath("//select[@class='goog-te-combo']"));
		
		Select all_idi = new Select(Idioms);
		
		WebElement selected_value1 = all_idi.getFirstSelectedOption();
		
		// It should return Seleccionar idioma
		System.out.println("After Selection selected values is: " + selected_value1.getText());
		
		// It should return camboyano
		all_idi.selectByIndex(13);
		
		WebElement selected_value2 = all_idi.getFirstSelectedOption();
		
		System.out.println("New Selection selected values is: " + selected_value2.getText());
		
	}
	
	
}
