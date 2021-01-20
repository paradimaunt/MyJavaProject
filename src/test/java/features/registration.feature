@search
Feature: User want to test registration

  Scenario: Registration user with correct credentials
    Given User go to main page
    When User click button Login or Registration
    And User click new  button "Регистрация"
    And User click "Регистрация через E-mail"
    And Create new user with random email
    Then User should see title New account created