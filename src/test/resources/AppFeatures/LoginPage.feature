Feature: Login Page feature

Scenario: Login Page title
Given user is on login page
When user gets the title of the page
Then page title should be "Login - My Store_"

Scenario: Forget Password Link
Given user is on login page 
Then forget password link should be displayed

Scenario: Login with correct credentials
Given user is on login page
When user enters username "asingh.25aug@gmail.com"
And user enters password "Selenium12345"
And user clicks on Login button
Then user gets the title of the page
And page title should be "My account - My Store"
