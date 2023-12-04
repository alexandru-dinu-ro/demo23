package org.example;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/report/report.html"},
        glue = "org/example/step_definitions",
        features = "src/test/resources/features",
        tags = "@search_for_product",
        publish = true)
public class TestRunner {

}
