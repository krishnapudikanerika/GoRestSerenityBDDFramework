Feature: Update User

  Scenario: Update User

    Given valid user details
    When user creates a new user through API
    Then user should be created successfully

    When user updates the user
    Then user should be updated successfully