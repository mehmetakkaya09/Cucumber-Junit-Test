@wip


Feature: Wikipedia Search Functionality

  Agile Story:
  User should be able to search for anything in the search box and get the correct results.

  Background:

    Given User is on Wikipedia home page

  Scenario Outline: User sees in the wiki title
    When User types name in the wiki search box"<names>"
    And User clicks wiki search button
    Then User should be able to sees "<names>" is in the wiki title
    Examples: User should be able to see
      | names      |
      | Steve Jobs |
      | Elon Musk  |

  Scenario Outline: User sees in the main header
    When User types name in the wiki search box"<names>"
    And User clicks wiki search button
    Then User should be able to sees "<names>" is in the main header
    Examples: User should be able to see
      | names      |
      | Steve Jobs |
      | Elon Musk  |

  Scenario Outline: User sees in the image header
    When User types name in the wiki search box"<names>"
    And User clicks wiki search button
    Then User should be able to sees "<names>" is in the image header


    Examples: User should be able to see
      | names      |
      | Steve Jobs |
      | Elon Musk  |
