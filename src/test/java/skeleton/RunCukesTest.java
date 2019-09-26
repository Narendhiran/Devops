package skeleton;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Devops_Naren\\cucumber-skeleton-project-4.0\\cucumber-skeleton-project-4.0\\src\\test\\resources\\skeleton\\Login.feature", plugin = {"json:target/cucumber.json"})
public class RunCukesTest {
}
