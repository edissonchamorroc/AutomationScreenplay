package chamorro.edisson.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = "chamorro.edisson.steps",
        features = "src/test/resources/chamorro/edisson/features/space_beyond.feature",
        snippets = SnippetType.CAMELCASE,
        monochrome = true,
        dryRun = false
)
public class SpaceBeyond {
}
