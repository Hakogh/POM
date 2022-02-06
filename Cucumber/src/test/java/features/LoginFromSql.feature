@Dblogin
Feature: Techfios Other login functionality validation using data from sql
Background:
	Given User is on Techfios login page 

@DbScenario1
Scenario: User should be able to login with valid credentials 
	When User enters "username" from mysqldatabase 
	When User enters "password" from mysqldatabase 
	And User clicks on Signin button 
	Then User should land on Dashboard page 