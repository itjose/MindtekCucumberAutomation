@HR-6 @ui
Feature: Validating order creation functionality

  Background: These steps will run before each scenario
    Given User navigates to application
    When  User log in with username "Tester" and password "test"
    And User clicks Order module

    @regression
  Scenario Outline: Validate calculate total functionality
    And user provides product "<Product>" and quantity <Quantity>
    Then User validates price total is calculated properly <Quantity>

    Examples:
      | Product     | Quantity |
      | FamilyAlbum | 1        |
      | MyMoney     | 5        |


  @smoke @regression
  Scenario: Validating order creation functionality
    And User creates and order with data
      | Product     | Quantity | Customer name | Street      | City    | State | Zip   | Card | Card Nr      | Exp Date |
      | FamilyAlbum | 1        | John Doe      | 123 Dee rd. | Chicago | IL    | 60614 | Visa | 456778986554 | 12/21    |
      | MyMoney     | 5        | Patel parish  | 123 dee rd  | chicago | IL    | 60605 | Visa | 546829920977 | 12/25    |



    Then User validates success message "New order has been successfully added."
    And User validates that created orders are in the list of all orders