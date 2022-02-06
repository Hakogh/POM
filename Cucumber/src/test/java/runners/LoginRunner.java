package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
	//	features=".\\src\\test\\java\\features\\TF_Login.feature", for onloy one feature
	features="classpath:features", //for all features
		glue="steps",
	tags="@DbScenario1", // for run e specific scenario we put tag on scenarion in feature @scenario****
	//to run multi scenarion we but , after name of first scenario  or give a 2nd tage after both tags on features @smoke and put only @smoke on tags=
	//we can also tag a feature
		monochrome=true,
		dryRun=false,
		plugin= {
				"pretty",
				"html:target/cucumber",
				"json:target/cucumber.json"
				}
		)

public class LoginRunner {

}
