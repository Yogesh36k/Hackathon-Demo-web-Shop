# Hackathon-Demo-web-Shop
# Testing Project

This project includes detailed manual and automation testing strategies for a web application covering core user functionalities and automation frameworks implementation.

---

## Table of Contents

- [Manual Testing](#manual-testing)
  - [Homepage](#homepage)
  - [Register Functionality](#register-functionality)
  - [Login Functionality](#login-functionality)
  - [Add to Wishlist](#add-to-wishlist)
  - [Add to Cart](#add-to-cart)
  - [Checkout Process](#checkout-process)
- [Automation Testing](#automation-testing)
  - [Selenium](#selenium)
  - [TestNG](#testng)
  - [Page Object Model (POM)](#page-object-model-pom)
  - [Extent Reports](#extent-reports)
- [Contributing](#contributing)


## Manual Testing

Manual testing focuses on verifying the expected behavior of key user flows and features through human execution of test cases.

### Homepage

- Verify that the homepage loads successfully and quickly.
- Check UI elements like banners, menus, products display.
- Validate navigation links redirect to corresponding pages.
- Test responsiveness across devices and browsers.

### Register Functionality

- Test user registration with valid inputs.
- Validate error messages on invalid or missing input fields.
- Confirm registration confirmation notifications or emails.
- Check persistence of user data in the system.

### Login Functionality

- Validate login with correct username and password.
- Test login failure with invalid credentials.
- Check "Forgot Password" link and reset flow.
- Verify session persistence and logout functionality.

### Add to Wishlist

- Confirm that users can add products to their wishlist.
- Validate the wishlist page displays added items correctly.
- Test removing items from the wishlist.
- Check wishlist updates reflect accurately on UI and backend.

### Add to Cart

- Test adding products to cart from product pages.
- Validate cart updates in quantity and total price.
- Confirm removal of items from the cart functions properly.
- Check cart persists during the session.

### Checkout Process

- Validate user can initiate checkout from the cart.
- Test form input validations (address, payment info).
- Confirm order summary accuracy.
- Verify successful order placement and confirmation.
- Check email notifications are sent after checkout.

---

## Automation Testing

Automation helps perform repetitive tests efficiently with accuracy using scripts and tools.

### Selenium

- Selenium WebDriver is used for browser automation.
- Supports multiple browsers like Chrome, Firefox, Edge.
- Used to simulate user interactions like clicks, typing, navigation.

### TestNG

- TestNG is used as the testing framework for structuring test cases.
- Supports annotations, parallel execution, grouping, and data-driven testing.
- Provides detailed test execution reports and logs.

### Page Object Model (POM)

- POM design pattern organizes automation code by modeling each webpage as a class.
- Encapsulates UI elements and interactions within page classes.
- Improves code maintainability, readability, and reusability.

### Extent Reports

- Extent Reports generate rich HTML test execution reports.
- Captures detailed logs, screenshots, and test statuses.
- Enhances visibility of test results for stakeholders.

---

## Contributing

Contributions to improve test coverage, add new test cases or enhance automation framework are welcome.  
Please follow standard coding practices and submit pull requests for review.



