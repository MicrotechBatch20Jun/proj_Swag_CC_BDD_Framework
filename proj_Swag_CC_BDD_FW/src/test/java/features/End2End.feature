Feature: End to End test

Scenario:

Given user is in login page
When page title is Swag Labs
Then user enter username and password
| standard_user   | secret_sauce |
And user click on log in button
When user is on Home Page
Then user click on item
Then user click on cart
And user click on checkout
Then user enters firstname and lastname and zip
| Iftekhar   | Uddin | 76010 |
Then user click on continue
When user is on payment page
Then user click on finish
And user opt out
Then close browser