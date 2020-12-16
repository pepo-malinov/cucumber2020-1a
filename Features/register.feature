
Feature: Регистрация на потребител

  Scenario Outline: Регистрация на потребител с различни входни данни
    Given Потребителя е отворил екрана за регистрация
    When Въведе потребилско име: "<name>"
    And Въведе парола: "<pass1>"
    And Въведе втора парола: "<pass2>"
    And Въведе email: "<email>"
    And Натисне бутона за регистрация
    Then Вижда съобщение: "<message>"

    Examples: 
      | name  | pass1  | pass2   |email     |message									|
      | name1 |password| password|test@t.com|Успешно се регистрирахте |
      | name2 |     pa | pa      |test@t.com|Въведете валидна парола|
      | name2 |password| pa      |test@t.com|Въведете еднакви пароли|
      | na    |password| password|test@t.com|Въведете валидно име   |
      | name2 |12345678901234567| 12345678901234567|test@t.com|Въведете валидна парола|
      |12345678901234567|password| password|test@t.com|Въведете валидно име   |
