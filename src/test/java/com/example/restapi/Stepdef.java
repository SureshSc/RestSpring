package com.example.restapi;

import static org.junit.Assert.assertEquals;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import com.example.restapi.dto.InputParams;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.DEFINED_PORT, classes=RestapiApplication.class)
public class Stepdef {

	String url;
	double result;
	InputParams inputParams;
	
	@Given("Rest api {string}")
	public void rest_api(String url) {
	    this.url = url;
	}

	@When("I invoke the given rest API")
	public void i_invoke_the_given_rest_API() {
	    RestTemplate restTemplate = new RestTemplate();
	    result = restTemplate.getForObject(this.url, Double.class);
	}

	@Then("the epected result should be {double}")
	public void the_epected_result_should_be(Double expectedResult) {
	    assertEquals(expectedResult, result, 0.01);
	}
	
	@Given("firstoperand {double} and secondOperand {double}")
	public void firstoperand_and_secondOperand(Double firstOperand, Double secondOperand) {
	     inputParams = new InputParams(firstOperand, secondOperand);
	}

	@When("I invoke the given subtract rest API")
	public void i_invoke_the_given_subtract_rest_API() {
	    RestTemplate restTemplate = new RestTemplate();
	    result = restTemplate.postForObject(url, inputParams, Double.class);
	}

}
