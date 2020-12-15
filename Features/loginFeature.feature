#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: Вход в системата


  Scenario: Вход с валидни потребителски данни
    Given Потребителя отваря приложението
    When Въведе валидно потребителско име
    And въведе валдна парола
    And Кликне на логин бутона
    Then вижда съобщение за успешно влизане в системата
    
  Scenario: Вход без парола
   Given Потребителя отваря приложението
    When Въведе валидно потребителско име
    And Кликне на логин бутона
    Then вижда съобщение за успешно влизане в системата
    
  Scenario: Вход без потребитеслко име
   Given Потребителя отваря приложението
    When въведе валдна парола
    And Кликне на логин бутона
    Then вижда съобщение за успешно влизане в системата
    
  Scenario: Вход с грешно име
   Given Потребителя отваря приложението
    When Въведе невалидно потребителско име
    And въведе валдна парола
    And Кликне на логин бутона
    Then вижда съобщение за успешно влизане в системата
    
  Scenario: Вход с грешна парола
   Given Потребителя отваря приложението
    When Въведе валидно потребителско име
    And въведе невалдна парола
    And Кликне на логин бутона
    Then вижда съобщение за успешно влизане в системата