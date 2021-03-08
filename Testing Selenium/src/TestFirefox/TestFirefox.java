package TestFirefox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestFirefox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\USER\\Documents\\Selenium\\geckodriver-v0.29.0-win64\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver(); // Objeto
		
		driver.get("https://loscoches.com/seat-ofertas/?utm_campaign=Seat&utm_medium=cpc&utm_source=google&gclid=EAIaIQobChMIssyn3tCU7wIVFvzjBx3NHwT-EAAYASAAEgLKq_D_BwE");

		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/article/div[5]/div[2]/div/div/div[2]/div/div/div/form/p[1]/label/span/input")).sendKeys("Gustavo Garcia");
		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/article/div[5]/div[2]/div/div/div[2]/div/div/div/form/p[2]/label/span/input")).sendKeys("testing@gmail.com");
		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/article/div[5]/div[2]/div/div/div[2]/div/div/div/form/p[3]/label/span/input")).sendKeys("32458154548");
		
		Select Sel1 = new Select(driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/article/div[5]/div[2]/div/div/div[2]/div/div/div/form/p[4]/label/span/select")));  // Seleccion de lista desplegable
		
		Sel1.selectByIndex(1);
		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/article/div[5]/div[2]/div/div/div[2]/div/div/div/form/p[11]/input")).click();
	
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/article/div[12]/div[2]/div/div/div[3]/div/p/span/a")).click();
		
		driver.navigate().back(); // Ir a la pagina anterior
		
		System.out.print(driver.getTitle()); 
		
		//driver.navigate().forward(); // Ir a la pagina anterior
	}

}
