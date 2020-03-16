package annotation;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		snippets = SnippetType.CAMELCASE,
		features = { "src/test/resources/features" },
		glue = {"annotation" },
		
		tags = {})

public class RunTest {

}
