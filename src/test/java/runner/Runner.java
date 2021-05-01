package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json"},
        //features = "src/test/resources/features/WebOrdersLogin.feature",
        features = "src/test/resources/features/",
        glue = "steps",
        tags = "@regression", //@HR-5 or @HR-6 will look for and run those with this tag
        dryRun = false
)
public class Runner {


}
