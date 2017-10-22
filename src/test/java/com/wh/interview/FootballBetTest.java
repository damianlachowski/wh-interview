package com.wh.interview;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        format = {"pretty", "html:target/cucumber-report"},
        features = "classpath:com.wh.interview/features/"
)

// Football test runner
public class FootballBetTest {
}