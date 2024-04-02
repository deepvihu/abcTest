Feature: Login Functionality by using Datatable

Scenario: To validate Login with valid data
Given user is on SwagLab application
When user enters username & password
|standard_user|secret_sauce|
|problem_user|secret_sauce|
And user clicks on Login button
Then it redirects to homepage