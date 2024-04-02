@login
Feature: To test Login functionalty for valid & invalid credentials
Background:
Given User is on homePage

@valid
Scenario: to validate login with valid credentials
When User enters username & password
And click on login button
Then It should navigate to catalogue

@invalid
Scenario: to validate login with inavalid cred
When user enters username and Password
And click on login button
Then It should give error message