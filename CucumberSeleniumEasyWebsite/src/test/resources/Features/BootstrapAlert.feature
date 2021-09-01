@DummyTest1
Feature: To test the Bootstrap alert buttons of selenium easy page

Background:
Given User is on selenium easy page
When Chrome browser is lauched and url is entered
And User closes the popup

Scenario: Veify message is displayed after clicking on bootstrap alerts buttons
Given User is on bootstrap alerts
When User clicks on alerts and and modals menubar option and select dropdown bootstrap alerts
And User checks if bootstrap alerts header is visible or not
And Verifying  autocloseable success message button is displayed
And User clicks on autocloseable success message button
And Verifying if autocloseable success message is displayed
And User clicks on normal success message button
And Verifying  normal success message is displayed
And User clicks on autocloseable warning message button
Then User is verifying autocloseable warning message is displayed
And User closes the browser




