@Library
  Feature: Library Login Functionality
    Agile Story :
    As a user, I should be able to login with correct credentials to different
    accounts. And dashboard should be displayed.

    Accounts are: librarian, student, admin
  Background:
    Given user is on login page
    @librarian @employee
    Scenario:
      When user should be able to write correct user name as a librarian
      And user should be able to write correct password as a librarian
      And user should be able to click on login button 
      Then user should be able to see dashboard as a librarian
      @student
      Scenario:
        When user should be able to write correct user name as a student
        And user should be able to write correct password as a student
        And user should be able to click on login button
        Then user should be able to see dashboard as a student
        @admin @employee
        Scenario:
          When user should be able to write correct user name as a admin
          And user should be able to write correct password as a admin
          And user should be able to click on login button
          Then user should be able to see dashboard as a admin


