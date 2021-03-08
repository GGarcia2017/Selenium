package HandleRadioButtons_Debug;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleRadioButtons {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\USER\\Documents\\Selenium\\geckodriver-v0.29.0-win64\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");

		driver.manage().window().maximize();

		List<WebElement> radio = driver.findElements(By.xpath("//input[@name='lang' and @type='radio']"));

			for(int g = 0; g < radio.size(); g++) 
			{
				
				WebElement local_radio = radio.get(g);
				
				String value = local_radio.getAttribute("value");
				
				System.out.println("Values from radio buttons are: " + value);
				
					if (value.equalsIgnoreCase("RUBY")) 
					{
						
						local_radio.click();
						
					}
					
			}
			
			List<WebElement> checkbox =  driver.findElements(By.xpath("//input[@type='checkbox']"));
	
			for (int g = 0; g < checkbox.size(); g++)
			{
				
				WebElement ele = checkbox.get(g);
				
				String id = ele.getAttribute("id");
				
				if(id.equalsIgnoreCase("code"))
				{
					ele.click();
					break;
				}
				
			}
	
	}

}
