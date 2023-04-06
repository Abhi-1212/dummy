
@userall
Feature: User creation
  Add new user by entering personal details

  Background: 
    Given User navigate to home page
@functional
  Scenario Outline: Creating user with valid data
    When user enter firstname <firstname>
    And User enter lastname <lastname>
    And Select gender <gender>
    Then USer click on add button
    And User Created sucessfully

    Examples: 
      | firstname | lastname | gender |
      | Abhiraj   | yfghg    | male   |
      | vikram    | sharma   | male   |
      | rani      | roy      | female |

@functional
  Scenario: Creating user with invalid data
    When user enter firstname "Abhishek"
    And User enter lastname "#$#@$#@4"
    And Select gender "Male"
    Then USer click on add button
    And Invalid first name and last name should be displayed
    And no error

@smoke
  Scenario: Creating user with blank data
    When user enter firstname "  "
    And User enter lastname "  "
    And Select gender "Male"
    Then USer click on add button
    And Please enter first and last name
