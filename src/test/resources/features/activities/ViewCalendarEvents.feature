@view_calendar_events
Feature: View all calendar events
  As a user, I want to be able to see all calendar events as a table

  Scenario: User permission
    Given user is on the login page
    When user logs in as a sales manager
    And  user navigates to "Activities" and "Calendar Events"
    Then view per page menu should have following options
        | 10  |
        | 25  |
        | 50  |
        | 100 |