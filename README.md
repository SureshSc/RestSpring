Step 1 - Create app in https://start.spring.io/  
Step 2 - Download code from Spring Initialiser  
Step 3 - Open Eclipse  
Step 4 - Import -> Existing Maven Project  
Step 5 - Added below dependencies to pom.xml. Use cucumber-spring 2.1.0
```xml
<dependency>
  <groupId>io.cucumber</groupId>
	<artifactId>cucumber-java</artifactId>
	<version>4.2.6</version>
	<scope>test</scope>
</dependency>
<dependency>
	<groupId>io.cucumber</groupId>
	<artifactId>cucumber-junit</artifactId>
	<version>4.2.6</version>
	<scope>test</scope>
</dependency>
<dependency>
	<groupId>io.cucumber</groupId>
	<artifactId>cucumber-spring</artifactId>
	<version>2.1.0</version>
</dependency>
```
Step 6 - Create new feature file (Calculator.feature)  
Step 7 - Copy paste resources for exisitng feature file in this project  
Step 8 - Create new test file(RestCucumberTest.java) and add   
```javascript
@RunWith(Cucumber.class)  
@CucumberOptions(features="src/test/java",plugin= {"pretty"})  
```
Step 9 - Run as JUnit -> Copy generate code from console
Step 10 - Create Stepdef.java file and paste the generated code  
Step 11 - Paste below mentioned line in Stepsdef.java 
```javascript
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.DEFINED_PORT, classes=<Application>.class)

```
Step 12 - Do mvn test and testcases will be failed.  
Step 13 - Create package controller (Calculator.java)  
Step 14 - Add @RestController for class in Calculator.java
Step 15 - Create new method add() and place below mentioned annotations
```javascript
@GetMapping("add")  
@ResponseBody
```
Step 16 - Sample code for http Get method
```javascript
public double add(@RequestParam double firstOperand, @RequestParam double secondOperand) {
  return firstOperand + secondOperand;
}
```

POST method sample  
Step 1 - Create a package dto (Data Transfer Objects) under src/main/java/controller  
Step 2 - Create mapper class (InputParams.java)  
Step 3 - Create another method subtraction and place below mentioned code
```javascript
@PostMapping("subtract")
@ResponseBody
public double subtract(@RequestBody InputParams params) {
  return params.firstOperand - params.secondOperand;
}
```
