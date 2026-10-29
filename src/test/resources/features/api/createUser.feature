Feature: Create User

  Scenario: Create User

    Given valid user details
    When user creates a new user through API
    Then user should be created successfully