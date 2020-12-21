Feature: Account page feature

Background:
Given user has already logged in to application
| username | password |
| asingh.25aug@gmail.com | Selenium12345 |


Scenario: Accounts page title
Given user is on Accounts page
When user get the title of the page
Then page title should be "My account - My Store"

Scenario: Accounts section count
Given user is on Accounts Page
Then user gets accounts section
|ORDER HISTORY AND DETAILS|
|MY CREDIT SLIPS|
|MY ADDRESSES|
|MY PERSONAL INFORMATION|
|MY WISHLISTS|
|Home|
And accounts section count should be 6