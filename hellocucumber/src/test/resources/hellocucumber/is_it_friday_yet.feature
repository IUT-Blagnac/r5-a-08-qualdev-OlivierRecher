Feature: Is it friday yes

  Scenario Outline: Check if it's Friday on a Sunday
    Given today is "<day>"
    When I ask whether it's Friday yet
    Then the answer should be "<answer>"

    Examples:
    | day            | answer |
    | Friday         | TGIF   |
    | Sunday         | Nope   |
    | anything else! | Nope   |