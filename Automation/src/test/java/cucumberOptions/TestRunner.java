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
		tags="@PortalTest"//,
		//plugin= {"pretty","html:target/cucumber"}
				)

public class TestRunner {

}
