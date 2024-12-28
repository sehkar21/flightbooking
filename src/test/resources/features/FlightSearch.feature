@reg
Feature: Flight Booking 

	Background: 
	Given User is on the Flight booking webpage
  
  Scenario: Search Flights
  Given user clicks on the flights tab 
  Then user selects the From Destination
  And user selects the To Destination
  Then user selects the departure date
  Then user selects the Return date
  Then user selects the Traveller and class 
  Then user clicks on the search Button to get the results


