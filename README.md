# Automation Testing Project for NopCommerce Website

Implemented with Java and Selenium, this project offers automated test scripts designed for the NopCommerce website. It adheres to the Page Object Model for efficient code management and employs TestNG for test execution and assertions.

## Table of Contents

- Selenium WebDriver: Web automation library for interacting with web elements.
- TestNG: Testing framework for organizing and executing tests.
- Page Object Model (POM): Design pattern for maintaining test scripts and page objects separately.

## Test Cases

### RegistrationTest

- Description: Verify that a user can register with valid details.
- Steps:
  1. Navigate to the registration page.
  1. Fill in the registration form with valid user details.
  1. Submit the registration form.
 
### LoginLogoutTest

  - Description: Verify that a registered user can log in with valid credentials and then logout.
  - Steps:
    1. Navigate to the login page.
    1. Enter valid credentials (email and password).
    1. Click on the login button.
    1. Click on the logout button

### ChangePassword
  - Description: Verify that a registered user can log in with valid credentials and then logout.
  - Steps:
    1. Navigate to the change password page.
    1. Enter the current password, new password, and confirm new password.
    1. Click on the change password button.

### ShoppingScenario
  - Description: Verify that a user can go to jewelry page and add a product to cart and then proceed to checkout successfully.
  - Steps:
    1. Navigate to the home page.
    1. Login as a current user.
    1. Click on the login button.
    1. Click on Jewelry button.
    1. Add a product to cart.
    1. Go to shopping cart page.
    2. Click on Checkout button.
    3. Add all required details.
    4. Click on the logout button.

   ### Contact
   
   If you have any questions, suggestions, or issues related to this project, please feel free to contact us. We welcome your feedback and contributions.

- Email: ahmedmagdy_trust@hotmail.com




