@test
Feature: Login to the application
Scenario: User logs in with created account
Given user is on Magento login page
When user enters valid login credentials
And submits the login form
Then user should be redirected to dashboard
