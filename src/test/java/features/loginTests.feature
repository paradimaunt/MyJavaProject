@search
Feature: User want to test login
  Scenario: Register User with correct credentials
    Given User go to main page
    When User click button Login or Registration
    And User input correct "paradimaunt93@gmail.com" and "Corsar93"
    And User click submit
    And User logged in
    Then User Login out


  Scenario Outline: User want to login user with empty field password
    Given User go to main page
    When User click button Login or Registration
    And User input saved  "<email>" and field "<password>" remains empty
    Then User see  error text "Введите пароль"
    Examples:
      | email                   | password |
      | paradimaunt93@gmail.com |          |


  Scenario Outline: User want to login user with empty field email
    Given User go to main page
    When User click button Login or Registration
    And User remains empty "<email>" and input saved "<password>"
    Then User see  error text "Необходимо указать логин пользователя"
    Examples:
      | email | password |
      |       | Corsar93 |

  Scenario Outline: User want to login user with wrong credentials
    Given User go to main page
    When User click button Login or Registration
    And User input wrong "<email>" and "<password>"
    Then User see  error text "Неверный логин или пароль"
    Examples:
      | email      | password |
      | 12345@.com | 12345    |

