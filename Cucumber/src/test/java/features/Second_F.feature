Feature: Techfios Other login functionality validation 

//Background:
//we put common step on scenario if we have multi scenario and delete from all scenarios 
@Scenario2
Scenario: User should be able to login with valid credentials 
	Given User is on Techfios login page 
	When User enters username as "demo@techfios.com"  
	When User enters password as "abc123"  
	And User clicks on Signin button 
	Then User should land on Dashboard page 
	And User click on Bank&Cash
	And User Click on New Account
	Then User should land on Accounts
	When User enters Account Title as "Personal"
	When User enters Description as "My New Account"
	When User enters Initial Balance
	When User enters Account Number
	When User enters Contact Person as "Techfios"
	When User enters Phone
	And User click on Submit
	
	