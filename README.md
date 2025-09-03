# Java Testing Demo

This project shows how to write and run simple unit tests in Java using **JUnit 5**.  
It’s a small demo meant to highlight how testing works without relying on heavy frameworks.

---

## Project Structure
```text
java-testing-demo/
├── src/         # main code
│   └── Calculator.java
├── test/        # unit tests
│   └── CalculatorTest.java
└── README.md

## How to Run

Download JUnit 5 Console Standalone JAR.
Place it inside a folder called lib/ in the project.

## Compile the code:
      javac -cp .;lib/junit-platform-console-standalone-1.x.x.jar src/Calculator.java test/CalculatorTest.java

## Run the tests:
      java -jar lib/junit-platform-console-standalone-1.x.x.jar -cp . --scan-class-path

## Tech Used:
Java 17
JUnit 5
