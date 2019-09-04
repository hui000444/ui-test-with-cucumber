package com.xcrj.dj;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty","html:test_reports"},
        features = "src/test/resources/features")
public class RunCucumberTest {
    public RunCucumberTest() {
        System.setProperty("browser","chrome");
    }
}
