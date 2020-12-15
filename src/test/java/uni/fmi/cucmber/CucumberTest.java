package uni.fmi.cucmber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "Features" }, plugin = { "pretty", "html:tagret/raports" })
public class CucumberTest {

}
