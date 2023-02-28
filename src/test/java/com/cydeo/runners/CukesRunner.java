package com.cydeo.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumberReport.html",  // this is for html report
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber"
        },
        features = "src/test/resources/features",   // this is for feature files
        glue = "com/cydeo/step_definitions",  // this is for step definitions, implementations of feature files!
        dryRun = false,   // this is just for checking the feature files implement or not!
        tags = "@wip"   // "or" "and" "and not"
)
public class CukesRunner {
}

//TAGS are used for running group. for ex. with @regression tag we can implement all codes under @regression tag!!!
//if we write tags top of the FEATURE file, all codes will be run in the class.
//if we write tags on the SCENARIO, just this target code/codes will be run in the class.
//we can write more than one tags in the same file/SCENARIO.