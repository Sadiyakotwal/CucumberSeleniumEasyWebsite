@DummyTest2
Feature: To test the  text fields of input form submit page

  Background: 
    Given User is on selenium easy page
    When Chrome browser is lauched and url is entered
    And User closes the popup
    And User checks if home page header is visible or not

  Scenario: Check selenium easy input form submit page text fields
    Given User clicks on input forms  menubar option and Input form submit dropdown
    Then User checks Input form submit page header
    And User is veriying all the text fields are empty or not
    And User fills the input form with validations
      | Fields       | Values       |
      | FirstName    | Ray          |
      | LastName     | Kevin        |
      | EmailAddress | raykevin@123 |
    And User closes the browser
