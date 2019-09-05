@AreaCalculation
Feature: Calculation the room's precise size

  Scenario: Room size calculation in feet
    Given User on the calculator page
    When  User select measure unit: Feet
    And   User provides dimensions in feet and inches
    And   User click to Calculate button
    Then  User has to get result of total area of room

  Scenario: Room size calculation in meters
    Given User on the calculator page
    When  User select measure unit: Meters
    And   User provides dimensions in meters
    And   User click to Calculate button
    Then  User has to get result of total area of room

  Scenario: Clearing all fields
    Given User on the calculator page
    When  User select measure unit: Feet
    And   User provides dimensions in feet and inches
    And   User click on Clear button
    Then  User has to get all fields empty