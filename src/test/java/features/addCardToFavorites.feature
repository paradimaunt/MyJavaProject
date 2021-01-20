@search
Feature: User want to check card in search and check favorites

  Background:
    Given User go to main page
    When User click button Login or Registration
    And User input correct "paradimaunt93@gmail.com" and "Corsar93"
    And User click submit
    Then User logged in

  Scenario: add card to favorites
    Given User go to main page
    When User input in search "грузовики renault"
    And User selects the first element in the list and adds it to the favorites
    And User goes to the favorites and checks the availability of the goods
    And User delete goods and see text по даному запросу ничего не найдено
    Then User Login out


