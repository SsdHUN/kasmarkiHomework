# KasmakiHomework

This project verify correct form submission and also test various error scenarios on test-format.

## Prerequisites

Before running the tests, make sure you have the following:

1. Java Development Kit (JDK) installed.
2. Maven build tool installed.

## Dependencies

These are the important dependencies extracted from the `pom.xml`:

```xml
<dependencies>
    <dependency>
        <groupId>org.junit.jupiter</groupId>
        <artifactId>junit-jupiter-api</artifactId>
        <version>5.9.1</version>
    </dependency>
    <dependency>
        <groupId>io.github.bonigarcia</groupId>
        <artifactId>webdrivermanager</artifactId>
        <version>5.3.1</version>
    </dependency>
    <dependency>
        <groupId>org.seleniumhq.selenium</groupId>
        <artifactId>selenium-java</artifactId>
        <version>4.9.0</version>
    </dependency>
</dependencies>
```
Make sure to include these dependencies in your project's pom.xml to ensure proper functioning of the tests.

## Running the Tests
1. Navigate to the `kasmarkiHomework` folder with the following command:
```
cd "path/kasmarkiHomework"
```
2. Run the test the following command:
```
2. mvn test
```