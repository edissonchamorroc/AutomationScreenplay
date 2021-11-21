package chamorro.edisson.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = "chamorro.edisson.steps",
        features = "src/test/resources/chamorro/edisson/features/advantage_demo_shopping.feature",
        snippets = SnippetType.CAMELCASE,
        monochrome = true,
        dryRun = false
)
public class AdvantageDemoShopping {

}
