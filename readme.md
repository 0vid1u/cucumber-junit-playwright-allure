# Getting Started

Accelerator project template based on Playwright, Junit and Cucumber

## Reference Documentation
For further reference, please consider the following sections:

Working folder structure :

```text
├───src
    └───test
        ├───java
        │   └───my
        │       └───accelerator
        │           └───atf
        │               │   CucumberRunner.java
        │               │
        │               ├───config
        │               │       TestConfig.java
        │               │
        │               ├───context
        │               │       DataUserKeys.java
        │               │       ScenarioContext.java
        │               │       ScenarioKeys.java
        │               │
        │               ├───hooks
        │               │       ExecutionHooks.java
        │               │
        │               └───steps
        │
        └───resources
            │   allure.properties
            │   application.properties
            │   cucumber.properties
            │   junit-platform.properties
            │   logback-test.xml
            │
            └───features

```

### How to start code generator
```text
mvn exec:java -e -Dexec.mainClass=com.microsoft.playwright.CLI -Dexec.args="codegen google.com"
```

### How to run tests

```
mvn clean test
```

### How to show allure report
```
allure serve -h localhost target/allure-results
```

* [Official Junit5 documentation](https://junit.org/junit5/docs/current/user-guide/#overview)
* [Cucumber Reference Guide](https://cucumber.io/docs/cucumber/)
* [Playwright](https://playwright.dev/java/docs/intro)

