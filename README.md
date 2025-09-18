Selenium Automation Framework

This project is a sample Selenium Test Automation Framework using Java, TestNG, and Page Object Model (POM).  
It demonstrates automation of a simple e-commerce payment flow.

 Project Structure
├── src
│ ├── main
│ │ └── java
│ │ ├── com.home.pages
│ │ │ └── HomePage.java
│ │ ├── com.payment.pages
│ │ │ └── PaymentPage.java
│ │ └── com.base
│ │ └── BaseClass.java
│ └── test
│ └── java
│ └── com.tests
│ └── PaymentTest.java
├── pom.xml
└── README.md

 Prerequisites

Java 11+ (or compatible JDK)
Maven 3.6+
Chrome Browser
TestNG ---

 Dependencies

All dependencies are managed in `pom.xml`.  
Key libraries used:
- Selenium Java
- TestNG
- Maven Surefire Plugin

 Example Test Flow


Open application home page

Select product quantity

Click Buy Now

Enter payment card details

Submit payment

Validate navigation to confirmation/OTP page


 Test Classes

BaseClass.java → Initializes and closes WebDriver

HomePage.java → Page Object for product home page

PaymentPage.java → Page Object for payment page

PaymentTest.java → Test class with actual test steps
