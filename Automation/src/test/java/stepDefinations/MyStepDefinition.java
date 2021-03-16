package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Cucumber.Automation.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pageObject.CheckOutPage;
import pageObject.HomePage;

public class MyStepDefinition {
	
	public WebDriver driver;
	
	HomePage g;
	
	CheckOutPage gg;

    @Given("^User is on Greecart Landing page$")
    public void user_is_on_greecart_landing_page() throws Throwable {
        
    	driver = Base.getDriver();
    	
    }

    @When("^User searched for (.+)")
    public void user_searched_for_something(String strArg1) throws Throwable {
        
    	g = new HomePage(driver);
    	
    	g.getSearch().sendKeys(strArg1);
    	
    	Thread.sleep(3000);
    }

    @Then("^\"([^\"]*)\" result are displayed$")
    public void something_result_are_displayed(String strArg1) throws Throwable {
    	
    	Assert.assertTrue(driver.findElement(By.cssSelector("h4.product-name")).getText().contains(strArg1));
    	
    }

    @And("^added items to cart$")
    public void added_items_to_cart() throws Throwable {
    
    	driver.findElement(By.cssSelector("a.increment")).click();
    	
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div[3]/button")).click();
    }
    

    @And("^User proceeded to checkout page for purchase$")
    public void user_proceeded_to_checkout_page_for_purchase() throws Throwable {
        
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div/header/div/div[3]/a[4]/img")).click();
    	
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div/header/div/div[3]/div[2]/div[2]/button")).click();
    	
    	
    }
}
