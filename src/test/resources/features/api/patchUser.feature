Feature: Patch User

  Scenario: Patch Existing User

    Given existing user id
    When user partially updates details
    Then patch request should succeed