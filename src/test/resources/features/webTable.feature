@wip
Feature: Login functionality

  Agile Story

  Scenario: : User can login the website
    Given User is on the home page
    When  User should be able to write username and password
      | username | Test   |
      | password | Tester |
    And User should be able to click login button
    Then User should be able to see "orders" end of th URL

  Scenario Template: Order place scenario
    Given user is already logged in to web table app
    When user is on the Order page
    Then user enters appropriate test data "<Product>" "<Quantity>" "<Customer name>" "<Street>" "<City>" "<State>" "<Zip>" "<Payment info>" "<Card type>" "<Card No>" "<Expire date>"
    And user clicks to Process Order
    Then user should see new order in the table on View all orders
    @femalescientists
    Examples: Order of femalescientists
      | Product    | Quantity | Customer name      | Street    | City   | State   | Zip   | Payment info | Card type        | Card No | Expire date        |
      | MoneyCog   | 2        | Marie Curie        | London st | London | England | 50505 | Visa         | 1111222233334444 | 12/24   | Marie Curie        |
      | Familybea  | 3        | Rosalind Franklin  | London st | London | England | 50505 | Visa         | 1111222233334444 | 12/24   | Rosalind Franklin  |
      | Screenable | 4        | List Meitner       | London st | London | England | 50505 | Visa         | 1111222233334444 | 12/24   | List Meitner       |
      | MoneyCog   | 5        | Chien-Shiung Wu    | London st | London | England | 50505 | Visa         | 1111222233334444 | 12/24   | Chien-Shiung Wu    |
      | MoneyCog   | 6        | Barbara McClintock | London st | London | England | 50505 | Visa         | 1111222233334444 | 12/24   | Barbara McClintock |

    @malescientists
    Examples: Order of malescientists
      | Product    | Quantity | Customer name         | Street    | City   | State   | Zip   | Payment info | Card type        | Card No | Expire date           |
      | MoneyCog   | 2        | Charles Darwin        | London st | London | England | 50505 | Visa         | 1111222233334444 | 12/24   | Charles Darwin        |
      | Familybea  | 3        | Albert Einstein       | London st | London | England | 50505 | Visa         | 1111222233334444 | 12/24   | Albert Einstein       |
      | Screenable | 4        | CV Raman              | London st | London | England | 50505 | Visa         | 1111222233334444 | 12/24   | CV Raman              |
      | MoneyCog   | 5        | Galileo               | London st | London | England | 50505 | Visa         | 1111222233334444 | 12/24   | Galileo               |
      | MoneyCog   | 6        | Isaac Newton          | London st | London | England | 50505 | Visa         | 1111222233334444 | 12/24   | Isaac Newton          |
      | MoneyCog   | 6        | Arnold Schwarzenegger | London st | London | England | 50505 | Visa         | 1111222233334444 | 12/24   | Arnold Schwarzenegger |