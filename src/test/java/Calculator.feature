Feature: Calculator Application

  Scenario: Invoking addition operation 
    Given Rest api "http://localhost:9400/add?firstOperand=30&secondOperand=40"
    When I invoke the given rest API
    Then the epected result should be 70.0
    
    Scenario: Invoking subtraction operation 
    Given Rest api "http://localhost:9400/subtract"
    And firstoperand 20.0 and secondOperand 10.0
    When I invoke the given subtract rest API
    Then the epected result should be 10.0