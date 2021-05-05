package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json", "rerun:target/rerun.txt"},
        //features = "src/test/resources/features/WebOrdersLogin.feature",
        features = "src/test/resources/features/",
        glue = "steps",
        tags = "@abc",
        //@HR-5 or @HR-6 will look for and run those with this tag
        dryRun = true
)
public class Runner {


}
