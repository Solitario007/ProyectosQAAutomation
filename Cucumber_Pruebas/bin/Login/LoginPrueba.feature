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
#@tag
Feature: Realizar un login sobre una pagina
  I want to use this template for my feature file

  @tag1
  Scenario: Realiza login con datos validos
    Given Abrir el navegador y la pagina
    And una vez que se abra dar el usuario y password y hacer login
    When Se inicia sesion
    And y realizar una accion
    And validas	otra accion
    Then Cuando termines de validar
    And  Realiza log out
    
    @tagAtester
  Scenario: Registrar nuevo usuario
    Given Abrir el navegador y la pagina 
    And Una vez que se abra escribir el email	"prueba@gmail.com"
    And Escribe el password "password" 
    When Cuando termines de validar
    And  Se registra usuario 
    Then Cierra el navegador 
      
       
  @tag2
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
