# Java Testing Demo
This project demonstrates unit testing in Java using **JUnit 5**.

## How to Run
1. Download `junit-platform-console-standalone-1.x.x.jar` from Maven Central.
2. Place it in the `lib/` folder.
3. Compile:
   ```bash
   javac -cp lib/junit-platform-console-standalone-1.x.x.jar;src;test test/*.java src/*.java
   ```
4. Run tests:
   ```bash
   java -jar lib/junit-platform-console-standalone-1.x.x.jar --class-path src;test --scan-class-path
   ```
