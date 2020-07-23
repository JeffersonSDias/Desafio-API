package com.trello.api.RunTest;
/**
 * Essa classe é responsável pela integração do framework(cucumber) com a as classes java
 */

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/ObterActions.feature", 
	             glue = {"classpath:com.trello.api.StepDefinitions" },
	             monochrome = true,
	             plugin = { "pretty","html:target/ObterActionResult.html" },
	             snippets = SnippetType.CAMELCASE,
	             dryRun = false)
public class ObterActions_Test {

}
