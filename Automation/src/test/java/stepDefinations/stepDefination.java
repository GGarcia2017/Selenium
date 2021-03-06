package stepDefinations;

import java.util.List;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Cucumber.Automation.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import junit.framework.Assert;
import pageObject.CheckOutPage;


@RunWith(Cucumber.class) 
public class stepDefination extends Base{
	
	//WebDriver driver; -- Si no hay extends, se puede utilizar esta linea para resolver el error pero el sistema arroja error por que no reconoce el simulador web
	
	CheckOutPage gg;
	
    @Given("^User is on NetBanking landing page$")
    public void user_is_on_netbanking_landing_page() throws Throwable {
    	System.out.println("Space X");
    }

    @When("^User login into application with username and password$")
    public void user_login_into_application_with_username_and_password() throws Throwable {
    	System.out.println("Application");
    }

    @When("^User login into application with \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_login_into_application_with_something_and_password_something(String strArg1, String strArg2) throws Throwable {
    	System.out.println(strArg1 + " " + strArg2);
    }
    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
    	System.out.println("Grow up");
    }

    @Then("Cards displayed are {string}")
    public void cards_displayed_are(String str1) {
    	System.out.println("Card displayed " + str1);
    }
    
    @When("^User sign up with following details$")
    public void user_sign_up_with_following_details(DataTable data) throws Throwable {
    	List<List<String>> obj = data.asLists();
    	System.out.println(obj.get(0).get(0));
    	System.out.println(obj.get(0).get(1));
    	System.out.println(obj.get(0).get(2));
    	System.out.println(obj.get(0).get(3));
    	System.out.println(obj.get(0).get(4));
    }
    
    @When("^User login in to application with (.+) and password (.+)$")
    public void user_login_in_to_application_with_and_password(String username, String password) throws Throwable {
        System.out.println(username + " " + password);
    }
    
    @Given("^Validate the browser$")
    public void validate_the_browser() throws Throwable {
    	System.out.println("Deciding the browser to open");
    }

    @When("^Browser is triggered$")
    public void browser_is_triggered() throws Throwable {
    	System.out.println("Browser is triggered");
    }

    @Then("^Check if browser is displayed$")
    public void check_if_browser_is_displayed() throws Throwable {
    	System.out.println("Browser is started");
    }
    /*
    @Then("^Verify selected \"([^\"]*)\" items are displayed in Checkout page$")
    public void verify_selected_something_items_are_displayed_in_checkout_page(String strArg1) throws Throwable {
        
    	gg = new CheckOutPage(driver);
    	Assert.assertTrue(gg.getProductName().getText().contains(strArg1));
    }
    */
    
    @When("^User searched for (.+) Vegetables$")
    public void user_searched_for_vegetables(String name) throws Throwable {
    	gg = new CheckOutPage(driver);
    	Assert.assertTrue(gg.getProductName().getText().contains(name));
    	
    }
    
    @Then("^Verify selected (.+) items are displayed in Checkout page$")
    public void verify_selected_items_are_displayed_in_checkout_page(String name) throws Throwable {
    	gg = new CheckOutPage(driver);
    	Assert.assertTrue(gg.getProductName().getText().contains(name)); 
    }
}
