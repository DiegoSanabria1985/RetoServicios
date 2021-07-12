package com.api.retoservice.test.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/com.api.retoservice.feature/Place.feature",
        glue = "com.api.retoservice.test.stepdefinitions1",
        snippets = SnippetType.CAMELCASE,
        tags = "@regression1")
public class serviceplaceRunner {
}
