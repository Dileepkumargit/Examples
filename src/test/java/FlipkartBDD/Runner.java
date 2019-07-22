package FlipkartBDD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
                 features = {"Featurefiles"},
                 glue = {"FlipkartBDD"},
                 plugin = {"html:target/cucumber-html-reports"},
                 tags = {})
public class Runner {

}
