Feature: API UI Integration

  Scenario: Create User And Verify UI

    Given valid user details
    When user creates a new user through API
    Then user should be created successfully

    Given user opens Console page
    Then created user should be visible in Console response