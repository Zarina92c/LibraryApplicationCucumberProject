package com.library.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions (
        plugin = {
                "rerun:target/rerun.txt",
                "json:target/cucumber.json"
        },

      //  plugin = "html:target/cucumber-report.html",
        features ="src/test/resources/features",
        glue = "com/library/step_definitions",
        dryRun = false,
        tags = "@loginWithBackground",


        publish = true

)


public class CucumberRunner {
}
