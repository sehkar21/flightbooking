package com.stepdefinitions;

import java.io.IOException;

import com.pages.FlightSearchPage;

import UtilityClass.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import junit.framework.Assert;

public class FlightSearchStepdefinition {

	BaseClass base;
	
	public FlightSearchStepdefinition(BaseClass base)
	{
		this.base=base;
	}
	
	
	@Given("User is on the Flight booking webpage")
	public void user_is_on_the_flight_booking_webpage() throws InterruptedException, IOException {

		BaseClass.getbrowser();
		
	}

	@Given("user clicks on the flights tab")
	public void user_clicks_on_the_flights_tab() {

		FlightSearchPage FlightSearchPage = new FlightSearchPage(base);
		FlightSearchPage.FlightsTab();
		
	}

	@Then("user selects the From Destination")
	public void user_selects_the_from_destination() {
		FlightSearchPage FlightSearchPage = new FlightSearchPage(base);
		FlightSearchPage.FromDestination();
		
		
	}

	@Then("user selects the To Destination")
	public void user_selects_the_to_destination() {

		FlightSearchPage FlightSearchPage = new FlightSearchPage(base);
		FlightSearchPage.FromCity();
		FlightSearchPage.ToCity();
		
	}

	@Then("user selects the departure date")
	public void user_selects_the_departure_date() {
		FlightSearchPage FlightSearchPage = new FlightSearchPage(base);
		FlightSearchPage.DepartureDate();
		

		
	}

	@Then("user selects the Return date")
	public void user_selects_the_return_date() {

		FlightSearchPage FlightSearchPage = new FlightSearchPage(base);
		FlightSearchPage.Returndatedropdown();
		FlightSearchPage.ReturnDate();
		
	}

	@Then("user selects the Traveller and class")
	public void user_selects_the_traveller_and_class() {
		FlightSearchPage FlightSearchPage = new FlightSearchPage(base);
		FlightSearchPage.TravellerClass();
		FlightSearchPage.AddAdultpassenger();
		FlightSearchPage.MinusChildren();
		FlightSearchPage.Minusinfant();
		FlightSearchPage.Businessclass();
		FlightSearchPage.TravellerDonebtn();
		
		
	}

	@Then("user clicks on the search Button to get the results")
	public void user_clicks_on_the_search_button_to_get_the_results() throws InterruptedException {

		FlightSearchPage FlightSearchPage = new FlightSearchPage(base);
		FlightSearchPage.FlightRTsearchBtn();
		
		Thread.sleep(10000);
		String currenturl = base.driver.getCurrentUrl();
		System.out.println(currenturl);
		
		Assert.assertEquals(currenturl, "https://flight.easemytrip.com/InternationalRoundTrip/Index?srch=MAA-Chennai-India|BKK-Bangkok-Thailand|13/01/2025-31/01/2025&px=2-0-0&cbn=0&ar=undefined&isow=false&isdm=false&lang=en-us&&IsDoubleSeat=false&CCODE=IN&curr=INR&apptype=B2C");
		
	}

	
	
}
