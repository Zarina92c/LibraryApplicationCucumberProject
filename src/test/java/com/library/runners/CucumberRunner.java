package com.library.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions (


        features ="src/test/resources/features",
        glue = "com/library/step_definitions",
        dryRun = false,
        tags = "@sort_users",
        publish = false


)
public class CucumberRunner {
}
