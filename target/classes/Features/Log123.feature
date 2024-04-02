Feature: login functionality to validate multiple users

Scenario Outline: Login for valid users
Given user is on Sauce lab application
When user login with <username> and <password>
And he clicks on login button
Then login is successful

Examples:
|username|password|
|standard_user|secret_sauce|
|problem_user|secret_sauce|
