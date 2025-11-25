# Cucumber BDD Framework – Java, Selenium, Maven

This project is a **Behavior-Driven Development (BDD) Testing Framework** using:

- **Java**
- **Cucumber (Gherkin)**  
- **Selenium WebDriver**
- **Maven**
- **JUnit/TestNG**

This repository demonstrates how to build BDD test scenarios using feature files, step definitions, hooks, and Page Object Model structure.

---

## 🚀 Features

- BDD Gherkin Scenarios (`Given / When / Then`)
- Step Definitions written in Java
- Hooks for setup and teardown
- Page Object Model basics
- Reusable locator and method examples
- Maven project structure
- Ideal for beginners practicing Selenium + Cucumber

---

## 📁 Project Structure

src
├── test/java
│ ├── steps # Step Definitions
│ ├── hooks # Before/After hooks
│ ├── pages # Page Objects
│ ├── runners # Test runners
│
├── test/resources
│ ├── features # Gherkin feature files
pom.xml

---

## ▶️ How to Run Tests

Run all tests:
```bash
mvn clean test
Run a specific feature:

mvn test -Dcucumber.options="src/test/resources/features/Login.feature"
🧪 Example Scenarios

Successful login

Invalid login

Register new user

Search functionality

Basic form submission

🔗 Tools & Technologies
Tool	Purpose
Java	Step definitions & logic
Cucumber	BDD test design
Selenium WebDriver	UI automation
Maven	Build & dependency management
JUnit/TestNG	Test execution

👤 Author

Margarita Arsovska
QA Automation Engineer
https://www.linkedin.com/in/margarita-arsovska-596837353/
