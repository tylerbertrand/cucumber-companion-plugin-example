Feature: Is it Friday yet?
  Everybody wants to know when it's Friday

  Scenario Outline: Today is or is not Sunday
    Given today is "<day>"
    When I ask whether it's Sunday yet
    Then I should be told "<answer>"

    Examples:
      | day            | answer |
      | Friday         | Nope   |
      | Sunday         | Football!   |
      | anything else! | Nope   |