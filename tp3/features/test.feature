Feature: Homework Management

  Scenario Outline: Add a New Homework
    Given I am student
    When I add a new homework with the title "<title>"
    Then the homework is "<result>" 

    Examples:
    | title                             | result |
    | Mathematics Homework            | created   |
    | SAE                             | created   |
    

  Scenario Outline: Work on the Homework
    Given that the homework "<title>" exists
    When I work on the homework 
    Then the homework is now "<result>" 


    Examples:
    | title                             | result |
    | Mathematics Homework            | done   |
    | SAE                             | done   |