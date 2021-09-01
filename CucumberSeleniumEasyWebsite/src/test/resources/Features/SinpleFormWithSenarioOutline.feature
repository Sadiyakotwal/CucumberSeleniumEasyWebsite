@DummyTest3
Feature: To test Selenium Easy Website and click on input forms 
				 menubar option and Simple form demo dropdown

Background:
Given User is on selenium easy page
When Chrome browser is lauched and url is entered
And User closes the popup
And User checks if home page header is visible or not
And User clicks on input forms  menubar option and Simple form demo dropdown

Scenario: To verify the totals genrated by vales a and b
Given User is verifying two input fields section header in simple input forms demo page
When The dropdown selected is simple form demo
And User selects the value of "<ValueA>" and "<ValueB>"
And User clicks on get total button
Then The result should be "<ValueA>" added with "<ValueB>" to get "<Total>"
And User closes the browser

Examples:
| ValueA |  ValueB| Total |
    | 2 | 3 | 5 |
    | 10 | 15 | 25 |
    | 20 | 30 | 50 |
     
