package run;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="D:\\abhi\\test\\src\\test\\java\\feature\\exp2.feature", glue = "Stepdefi", dryRun = false, plugin ={
		"pretty", "html:target/login.html" })

public class run_all {

}
