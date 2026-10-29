Feature: Delete User

  Scenario: Delete User

    Given valid user details
    When user creates a new user through API
    Then user should be created successfully

    When user deletes the user
    Then user should be deleted successfully