Feature: API UI Integration

  Scenario: Create User And Verify In UI

    Given valid user details

    When user creates a new user through API

    Then user should be created successfully

    When user opens GoRest Console

    Then created user should be visible in Console response