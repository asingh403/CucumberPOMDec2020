Feature: Account Page Feature

Background:
Given user has already logged in to application
|username|password|
|asingh.25aug@gmail.com|Selenium12345|

@accounts
Scenario: Accounts page title
Given user is on Accounts page
When user gets the title of the page
Then page title should be "My account - My Store"

@accounts
Scenario: Accounts section count
Given user is on Accounts page
Then user gets accounts section
|ORDER HISTORY AND DETAILS|
|MY CREDIT SLIPS|
|MY ADDRESSES|
|MY PERSONAL INFORMATION|
|MY WISHLISTS|
|Home|
And accounts section count should be 6

Scenario: Accounts section customer care contact
Given user is on Accounts page
Then user sees the Call us now Number "0123-456-789"
And user sees all the given links in the footer of item section