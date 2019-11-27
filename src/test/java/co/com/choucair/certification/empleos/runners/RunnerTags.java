package co.com.choucair.certification.empleos.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {"src/test/resources/features"},

        glue = {"co.com.choucair.certification.empleos.stepdefinitions","co.com.choucair.certification.empleos.utils"},
        snippets = SnippetType.CAMELCASE
)
public class RunnerTags {
}
