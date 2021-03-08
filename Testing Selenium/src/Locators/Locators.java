package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.homecenter.com.co/homecenter-co/myaccount/register/personal");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		
		// 1. id
		WebElement Nombre = driver.findElement(By.id("nombre-persona"));
		Nombre.sendKeys("Space X");
		
		// 2. name
		By FistLastNam = By.name("/atg/userprofiling/ProfileFormHandler.value.lastName");
		driver.findElement(FistLastNam).sendKeys("Friday");
		
		// 3. ClassName many time class name won't be unique
		//driver.findElement(By.className("validate[required,length[1-254],email] form-control")).click();
		
		// 4. Xpath
		driver.findElement(By.xpath("//*[@id=\'email-persona\']")).sendKeys("spacex@homcenter.com");
		
		// 5. CSS
		driver.findElement(By.cssSelector("#email-persona-conf")).sendKeys("spacex@homcenter.com");
	
		// 6. LinkTest
		driver.findElement(By.linkText("Tratamiento de mis datos personales")).click();
	
		// 7. Partial LinkTest
		driver.findElement(By.partialLinkText("Tratamiento de mis")).click();	
		
		// 8. Tag Name
		System.out.println(driver.findElement(By.tagName("img")).getSize());	
		
		// Direct Locators - id, name, classname (Estos son los recomendados)
		// Dynamic - XPath, CSS
		
		
		//Dynamic XPath
		System.out.println(driver.findElement(By.xpath("//input[contains(@id,'pers')]//preceding::img[2]")).getSize());		
	}

}
