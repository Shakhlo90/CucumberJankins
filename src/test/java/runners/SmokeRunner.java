package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\tukht\\IdeaProjects\\CucumberBatch14\\src\\test\\resources\\features",
        glue = "steps",//the path of steps folder in java part
        dryRun = false,
        tags = " @sprint1",
        monochrome = true,
        plugin = {"pretty", "html:target/cucumber.html", "json:target/cucumber.json",
                "rerun:target/failed.txt"}

)

public class SmokeRunner {
}
