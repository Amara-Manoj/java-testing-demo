# Java Testing Demo

This project shows how to write and run simple unit tests in Java using **JUnit 5**.  
It’s a small demo meant to highlight how testing works without relying on heavy frameworks.

---

## How to Run

1. Download [JUnit 5 Console Standalone JAR](https://search.maven.org/artifact/org.junit.platform/junit-platform-console-standalone).  
2. Place it inside a folder called `lib/` in the project.  
3. Compile the code:
   ```bash
   javac -cp .;lib/junit-platform-console-standalone-1.x.x.jar src/Calculator.java test/CalculatorTest.java


## Run Tests:

java -jar lib/junit-platform-console-standalone-1.x.x.jar -cp . --scan-class-path

## **Tech Used**

Java 17
JUnit 5
