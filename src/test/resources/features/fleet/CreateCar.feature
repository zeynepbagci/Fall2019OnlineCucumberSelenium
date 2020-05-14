@create_car
Feature: Create a car
  As user, I want to be able to add new cars

  @create_car_DDT
  Scenario Outline: Add new car
    Given user is on the login page
    When user logs in as a sales manager
    Then user navigates to "Fleet" and "Vehicles"
    And user clicks on create a car button
    Then user creates a car with following info:
      | Licence Plate     | Driver   | Location  | Model Year    | Color    |
      | <licence_plate>   | <driver>  |<location> |  <model_year> | <color>  |
    And user verifies that car info is displayed
      | Licence Plate    | Driver   | Location  | Model Year   | Color     |
      | <licence_plate>  | <driver> |<location> | <model_year> | <color>   |

    Examples: cars test data
    | licence_plate | driver    | location      | model_year | color  |
    | 000           | pilot     | Washington DC | 2010       | purple |
    | 123           |test_driver|New York       |2022        |black   |