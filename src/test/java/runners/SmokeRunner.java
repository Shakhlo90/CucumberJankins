package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\tukht\\IdeaProjects\\CucumberBatch14\\src\\test\\resources\\features",
        glue = "steps",
        dryRun = false,
        tags = "@sprint3",
        monochrome = true,
        plugin = {"pretty"}

)

public class SmokeRunner {
}
