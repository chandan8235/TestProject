@tag
Feature: Feature for validation Login Funcationality of Facebook Page

  Background: Pre Condition
    Given Open Browser and Lunch Facebook Application

  @tag1
  Scenario: user can login Successfully using Valid credentials
    When User Enter the valid user name
    And User  Enter the valid password
    And User click on log in button
    Then User  successfully able to login 

  @tag2
  Scenario: User uneble to loging using invalid creadential
    When User enter the Invalid Username
    And User enter the invalid Password
    And User click on login button
    Then User uneble to log in successfully
