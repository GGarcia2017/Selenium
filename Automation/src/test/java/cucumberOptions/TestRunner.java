package cucumberOptions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//feature

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features",
		glue = "stepDefinations", // Este es el nombre del paquete 
		stepNotifications = true, //Para ver los steps en el resultado de JUnit
		//tags="@RegresionTest",
		// dryRun=true, -- This action is required to know how many test cases don't have stepDefination
		monochrome=true, // This plugin is necesary to order the console result
		strict=true,
		plugin= {"pretty","html:target/cucumber.html", // All of these are reports
				 "json:target/cucumber.json",
				 "junit:target/cukes.xml"}
				)

public class TestRunner {

}
