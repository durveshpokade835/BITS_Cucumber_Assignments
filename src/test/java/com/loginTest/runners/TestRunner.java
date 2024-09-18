package com.loginTest.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/com/loginTest/features",
        glue = "com/loginTest/stepDefinitions",
        plugin = {"pretty", "html:target/cucumber-reports.html"}
)

public class TestRunner extends AbstractTestNGCucumberTests {
}
