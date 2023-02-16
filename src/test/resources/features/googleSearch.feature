@Regression
Feature: Google search functionality
  Agile story: As a user, when I am on the Google search page I should be able to search whatever I want and see relevant information
Background:
  Given user is on Google page
  Scenario: Search page title verification
    Then user should see title is Google
    Scenario: First result select verification
      When user should be able to type anything in the searchbox
      And user should be able to press enter
      And user should see results of search key
      Then user should be able to click first result
