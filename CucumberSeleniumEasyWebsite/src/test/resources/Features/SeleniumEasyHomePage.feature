@SmokeTest
Feature: To test the home page of Selenium Easy Website and click on input forms 
				 menubar option and Simple form demo dropdown


Scenario: Check selenium easy home page header and click on input forms  menubar option and Simple form demo dropdown

Given User is on selenium easy page
When Chrome browser is lauched and url is entered
And User closes the popup
And User checks if home page header is visible or not
And User clicks on input forms  menubar option and Simple form demo dropdown
And User  is navigated to the Simple form demo page
And User checks simple form demo page header
And User checks the single input field section header
And User sets the single input field message
And User clicks on show message
Then User is verifying the single input field message
And User closes the browser



