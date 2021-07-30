import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"tests","utils"},
        features = {"src/test/resources/features"},
        tags = {"@ct01"}

)


public class RunnerTest {

}

