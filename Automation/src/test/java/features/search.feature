Feature: Search and place order for vegetables 

@SmokeTest
Scenario: Search for items and validate results
Given User is on Greecart Landing page
When User searched for Cucumber
Then "Cucumber" result are displayed

@RegresionTest
Scenario Outline: Search for items and then move to checkout page
Given User is on Greecart Landing page
When User searched for <Name>
And added items to cart
And User proceeded to checkout page for purchase
Then Verify selected <Name> items are displayed in Checkout page

Examples:
|Name    |
|Brinjal |
|Beetroot|