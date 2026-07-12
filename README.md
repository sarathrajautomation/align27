# align27
# Appium Mobile Automation Framework

## Overview

This project is a Java-based mobile automation framework built using **Appium**, **Selenium**, **TestNG**, and **Maven**. It automates Android application testing and generates HTML execution reports with screenshots using Extent Reports.

## Tech Stack

* Java 17
* Appium 2.x
* Appium Java Client
* Selenium WebDriver
* TestNG
* Maven
* Extent Reports

## Project Structure

```
align27
│
├── src
│   ├── test
│   │   ├── java
│   │   │   ├── tests
│   │   │   ├── reportmanager
│   │   │   └── utility
│   │   └── resources
│
├── Reports
├── Screenshots
├── testng.xml
├── pom.xml
└── README.md
```

## Prerequisites

Before running the project, ensure the following are installed:

* Java JDK 17
* Maven
* Android Studio
* Android SDK
* Appium Server 2.x
* Node.js
* UiAutomator2 Driver

Verify the installations:

```bash
java -version
mvn -version
appium -v
adb devices
```

## Install UiAutomator2 Driver

```bash
appium driver install uiautomator2
```

Verify the installed drivers:

```bash
appium driver list --installed
```

## Clone the Repository

```bash
git clone https://github.com/sarathrajautomation/align27.git
cd align27
```

## Install Dependencies

```bash
mvn clean install
```

## Configure the Device

Update the following values in the test class or configuration:

* Device Name
* UDID
* App Package
* App Activity

Example:

```java
options.setDeviceName("YOUR_DEVICE_NAME");
options.setUdid("YOUR_DEVICE_UDID");
options.setAppPackage("YOUR_APP_PACKAGE");
options.setAppActivity("YOUR_APP_ACTIVITY");
```

## Start the Appium Server

```bash
appium
```

Default URL:

```
http://127.0.0.1:4723
```

## Execute the Tests

Run using TestNG:

```bash
mvn test
```

Or execute the `testng.xml` file from your IDE.

## Reports

After execution, the Extent Report is generated in:

```
Reports/
```

Screenshots are saved in:

```
Screenshots/
```

## Features

* Android application automation
* TestNG framework
* Extent HTML reporting
* Automatic screenshot capture
* Maven dependency management
* Appium 2.x support
* Reusable utility classes
* Easy-to-maintain project structure

## Dependencies

* Appium Java Client
* Selenium
* TestNG
* Extent Reports
* Apache Commons IO

## Future Enhancements

* Page Object Model (POM)
* Data-driven testing using Excel
* Parallel execution
* TestNG Listeners
* CI/CD integration with GitHub Actions or Jenkins
* Cross-device execution
* Cloud execution (BrowserStack/Sauce Labs)

## Author

**Sarath Raj**

Automation QA Engineer

## License

This project is intended for learning and automation testing purposes.
