Feature: Contact Us Feature

Scenario Outline: Contact Us scenario with different set of data 
Given user navigates to Contact Us page
When user fills the form given sheetname "<SheetName>" and rownumber <RowNumber>
And user clicks on send button
Then its show a successful message "Your message has been successfully sent to our team."

Examples:
|SheetName|RowNumber|
|contactus|0|
|contactus|1|
|contactus|2|
|contactus|3|
|contactus|4|
|contactus|5|

#https://youtu.be/Oly5QGDgFW8?t=768