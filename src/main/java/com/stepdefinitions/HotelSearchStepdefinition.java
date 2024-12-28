package com.stepdefinitions;

import com.pages.HotelSearchPage;

import UtilityClass.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class HotelSearchStepdefinition {

	
	BaseClass base;
	
	public HotelSearchStepdefinition(BaseClass base)
	{
		this.base=base;
	}
	
	
	@Given("user clicks on the Hotels tab")
	public void user_clicks_on_the_hotels_tab() {
		HotelSearchPage HotelSearchPage = new HotelSearchPage(base);
		HotelSearchPage.HotelsTab();

		
	}

	@Then("user selects the city name")
	public void user_selects_the_city_name() throws InterruptedException {

		HotelSearchPage HotelSearchPage = new HotelSearchPage(base);
		Thread.sleep(5000);
		HotelSearchPage.citysearch();
		HotelSearchPage.citysearchname();
		HotelSearchPage.citysearchdropdwn();
		
	}

	@Then("user selects the date")
	public void user_selects_the_date() {
		HotelSearchPage HotelSearchPage = new HotelSearchPage(base);
		//HotelSearchPage.check_in();
		HotelSearchPage.check_indate();
		//HotelSearchPage.check_out();
		HotelSearchPage.check_outdate();

		
	}

	@Then("user selects the Rooms and guests")
	public void user_selects_the_rooms_and_guests() throws InterruptedException {

		HotelSearchPage HotelSearchPage = new HotelSearchPage(base);
		HotelSearchPage.Room_guest();
		HotelSearchPage.Roomadultplus();
		HotelSearchPage.Addroom();
		
		//HotelSearchPage.Roomchildplus();
		//HotelSearchPage.Roomadonebtn();
		
		
	}

	@Then("user clicks on the search button to get the list of hotels")
	public void user_clicks_on_the_search_button_to_get_the_list_of_hotels() {

		HotelSearchPage HotelSearchPage = new HotelSearchPage(base);
		HotelSearchPage.hotelsearchbtn();
		
	}

	
}
