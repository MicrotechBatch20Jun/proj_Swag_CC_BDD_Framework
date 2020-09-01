Feature: SauceDemo login test

Scenario Outline:

Given user is already in login page
When page title is swagLabs
Then user enters "<username>" and "<password>"
Then user click on login button
Then user is on home page
Then close the browser

Examples:

	| username        | password     |	
	| problem_user    | secret_sauce |
	| performance_glitch_user | secret_sauce |
	| standard_user   | secret_sauce |
