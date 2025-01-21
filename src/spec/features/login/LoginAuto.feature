@log-in @smoketest
Feature: login
  As a user I want to log in to the Automation Exercise application

  @log-in
  Scenario: I want to log in with valid credentials
    Given I log in to the Automation Exercise application
    When I click on the Signup/Login button
    And I enter the email address "asmabouzidi@yahoo.com"
    And I enter the password "Azerty123:"
    And I click on the Login button
    Then I am redirected to the home page and "Logged in as Asma Bouzidi" is displayed