@reg
Feature: Search Hotel 

	Background: 
	Given User is on the Flight booking webpage
	
	Scenario: Searching for Hotel
	Given user clicks on the Hotels tab 
	Then user selects the city name
	And user selects the date 
	Then user selects the Rooms and guests
	Then user clicks on the search button to get the list of hotels