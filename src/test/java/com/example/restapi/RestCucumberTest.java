package com.example.restapi;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java",plugin= {"pretty"})
public class RestCucumberTest {

}
