# 🚀 Magento Website Testing Project
[![Build Status](https://img.shields.io/badge/build-passing-brightgreen.svg)](https://github.com/user/repo/actions)
[![License](https://img.shields.io/badge/license-MIT-blue.svg)](LICENSE)

This is a testing project for the Magento website: [Software Testing Magento Store](https://magento.softwaretestingboard.com/). The purpose of this project is to automate and validate key functionalities of the website, ensuring a seamless experience for customers.

We focused on testing three major functionalities of the Magento website:
- **Login functionality**
- **Payment Checkout process**
- **Product Review submission**

---

## 📖 Table of Contents
- [Installation](#installation)
- [Usage](#usage)
- [Testing](#testing)
- [Contributing](#contributing)
- [License](#license)
- [Acknowledgments](#acknowledgments)
- [Contact](#contact)

---

## 🔧 Installation

### Prerequisites
- Java 11+
- Maven
- Selenium WebDriver (ChromeDriver or FireFox)
- TestNG (for test framework)

###  Install Dependencies
```
git clone https://github.com/user/repo.git
cd repo
mvn clean install
```
---
## 🚀 Usage
This project uses Selenium to perform automated tests on the Magento website. The main functionalities tested are:

Login Functionality: Tests valid, invalid, and empty login scenarios to ensure proper login behavior.
Payment Checkout: Ensures that users can successfully complete a purchase, with different payment methods.
Product Review: Verifies that customers can submit a review for a product correctly.

---

## ⚙️ Configuration
If needed, you can configure the Selenium WebDriver for different browsers or set up custom properties for test execution. You can modify the configuration in the config.properties or .env file in the project.

---
## 🧪 Running Tests
The tests are executed using Maven. To run the tests for login, payment checkout, and review submission functionalities, follow these steps:
```declarative
mvn test
```

This will trigger all test scenarios and generate a test report.

Example of Test Execution
The test results will be displayed after execution in the terminal.

---
## 🤝 Contributing
Contributions are welcome! Please follow these steps if you'd like to contribute:

1. Fork the repository.
2. Create a new branch (feature/your-feature).
3. Commit your changes (git commit -m 'Add new feature').
4. Push to the branch (git push origin feature/your-feature).
5. Create a Pull Request

For more detailed guidelines, please refer to the CONTRIBUTING.md file.

---
## 📜 License
This project is licensed under the MIT License - see the LICENSE file for details.

---
## 🙏 Acknowledgments
Thanks to the Magento Software Testing Board for providing the test environment for our automation.
Special thanks to our instructor "Mohammad Elgazzar" for leading us in this whole journey to end up making our first project, and for all the members from Sprints team.

---
## 📩 Contact
For questions or support, feel free to open an issue or contact Us on linkedIn:

Hanan Azzam: 

Mariam Alwazani: linkedin.com/in/mariam-alwazani-425358253