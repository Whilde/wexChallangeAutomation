package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = "pretty", features = "src/test/features/CreateNewUser.feature",snippets = CucumberOptions.SnippetType.UNDERSCORE)
public class Runner {
}
