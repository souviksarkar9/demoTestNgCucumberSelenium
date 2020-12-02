package com.example.demo;


import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
//@CucumberOptions(plugin = {"pretty"})
@CucumberOptions(
	    monochrome = true,
	    features = "classpath:features",
	    plugin = {"pretty", "html:target/cucumber-reports",
	    "json:target/cucumber.json"
	             }

	)
public class CucumbeTest {
}