@test
Feature: Magento Sign Up

  Scenario: User creates an account
    Given user is on Magento create account page
    When user enters valid registration details
    And submits the registration form
    Then user should be redirected to My Account page


