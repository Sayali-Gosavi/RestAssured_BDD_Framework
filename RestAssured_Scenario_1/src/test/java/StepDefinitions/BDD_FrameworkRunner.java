package StepDefinitions;

import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\features",glue="StepDefinitions")
public class BDD_FrameworkRunner extends BDD_Framework {

}
