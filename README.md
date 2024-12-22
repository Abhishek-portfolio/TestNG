TestNG Framework for Automated Testing
This project demonstrates the use of the TestNG framework for automated testing in Java. TestNG is a powerful testing framework that is inspired by JUnit but offers more features like parallel execution, annotations, and test configuration management, making it suitable for both unit testing and integration testing.

Project Overview
Purpose: This project showcases the use of TestNG for running automated tests. It aims to demonstrate how to write, organize, and execute tests efficiently.
Testing Type: The tests are written to verify different functionalities of a sample application, such as login, user actions, and other UI elements.
Features
Annotations: TestNG provides annotations to manage test execution such as @Test, @BeforeMethod, @AfterMethod, @BeforeClass, and @AfterClass.
Test Execution: Tests can be grouped and executed in parallel, making it easier to handle large test suites.
Reports: TestNG generates detailed HTML and XML reports that help track test results.
TestNG Annotations
TestNG annotations allow you to configure the execution flow of your tests. Below are some common annotations used in this project:

@Test: Marks a method as a test method.
@BeforeMethod: Runs before each test method.
@AfterMethod: Runs after each test method.
@BeforeClass: Runs before the first method of the current class is executed.
@AfterClass: Runs after all the methods in the current class are executed.

Running Tests
Install Dependencies: Make sure to have the required dependencies like Selenium, TestNG, and others in your pom.xml (if using Maven) or build file.

Test Execution: You can run your tests using your IDE's built-in TestNG support or from the command line using Maven:

Parallel Test Execution: You can run tests in parallel by configuring the TestNG XML file to run multiple test suites or tests concurrently. This is helpful for large test cases and speeding up the testing process.

Test Execution Results
TestNG will generate detailed HTML and XML reports for each test run. These reports will provide information about passed and failed tests, execution time, and other useful insights.

HTML Report: A clean and readable format showing test execution results, screenshots (if configured), and detailed failure logs.
XML Report: Contains structured data in XML format, which can be used to integrate with other tools or services.
Benefits of Using TestNG
Parallel Test Execution: Run multiple tests simultaneously to reduce the overall test execution time.
Flexible Configuration: Easily configure test suites, dependencies, and execution parameters using XML files.
Built-in Reporting: TestNG automatically generates comprehensive reports to monitor test results.
Test Grouping: You can group related tests together and run specific test groups as needed.
Conclusion
This project showcases how to use TestNG for writing and executing automated tests in Java. The framework provides powerful features like annotations, parallel execution, and reporting, making it ideal for both unit and integration testing. With the flexibility of TestNG, you can scale your tests efficiently and keep them well-organized.
