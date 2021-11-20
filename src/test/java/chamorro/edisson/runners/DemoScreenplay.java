package com.sophossolutions.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = "com.sophossolutions.steps",
        features = "src/test/resources/com/sophossolutions/features/demo_screenplay.feature",
        snippets = SnippetType.CAMELCASE,
        monochrome = true,
        dryRun = false
)

public class DemoScreenplay {

}
