Feature: Search Functinality

Scenario: Check the search functionality for rediff
Given user is on home page
When user gives keyword in search field
|modi|
|manipur|
And user clicks on search icon
Then search data should be displayed
