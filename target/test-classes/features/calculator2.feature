@tag
Feature: Calculator2

  Scenario: calculate with two numbers and sign
    Given Two input values, 11 and 2, and a sign *
    When I calculate the equation
    Then I expect the result number 22


  Scenario Outline: calculate with two numbers and sign
    Given Two input values, <first> and <second>, and a sign <opt>
    When I calculate the equation
    Then I expect the result number <result>

    Examples:
      | first | second | opt | result |
      | 6     | 2      | *   | 12     |
      | 6     | 2      | /   | 3      |
      | 6     | 2      | ^   | 36     |