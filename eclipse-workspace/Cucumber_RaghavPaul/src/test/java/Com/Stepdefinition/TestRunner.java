package Com.Stepdefinition;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/Com/Resources/Features", glue= {"Com.Stepdefinition"},
monochrome=true,
plugin= {"pretty","html:target/HtmlReports"})
public class TestRunner {

}
