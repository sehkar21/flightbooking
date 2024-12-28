package com.pages;

import org.openqa.selenium.By;

import UtilityClass.BaseClass;

public class FlightSearchPage {

	BaseClass base;
	
	public FlightSearchPage(BaseClass base)
	{
		this.base=base;
		
	}
	
	By FlightsTab          = By.xpath("//span[normalize-space()='Flights']");
	By FromDestination     = By.xpath("//input[@id='FromSector_show']");
	By FromCity            = By.xpath("//span[@id='spn7']");
	By ToCity              = By.xpath("(//span[@id='spn10'])[2]");
	By DepartureDate       = By.xpath("//li[@id='trd_1_13/01/2025']");
	By Returndatedropdown  = By.xpath("//div[@id='divRtnCal']");
	By ReturnDate          = By.xpath("//li[@id='fiv_5_31/01/2025']");
	By TravellerClass      = By.xpath("//i[@id='iDownArr']");
	By AddAdultpassenger   = By.xpath("//div[@id='field1']//button[@id='add']");
	By MinusChildren       = By.xpath("//button[@id='csub']");
	By Minusinfant         = By.xpath("//button[@id='isub']");
	By Businessclass       = By.xpath("//span[@id='spanBusiness']");
	By TravellerDonebtn    = By.xpath("//a[@id='traveLer']");
	By FlightRTsearchBtn   = By.xpath("//button[normalize-space()='Search']");
	
	
	public void FlightsTab()
	{
		base.driver.findElement(FlightsTab).click();
	}
	
	public void FromDestination()
	{
		base.driver.findElement(FromDestination).click();
	}
	
	public void FromCity()
	{
		base.driver.findElement(FromCity).click();
	}
	
	public void ToCity()
	{
		base.driver.findElement(ToCity).click();
	}
	
	public void DepartureDate()
	{
		base.driver.findElement(DepartureDate).click();
	}
	
	public void Returndatedropdown()
	{
		base.driver.findElement(Returndatedropdown).click();
	}
	
	
	public void ReturnDate()
	{
		base.driver.findElement(ReturnDate).click();
	}
	
	public void TravellerClass()
	{
		base.driver.findElement(TravellerClass).click();
	}
	
	public void AddAdultpassenger()
	{
		base.driver.findElement(AddAdultpassenger).click();
	}
	
	public void MinusChildren()
	{
		base.driver.findElement(MinusChildren).click();
	}
	
	public void Minusinfant()
	{
		base.driver.findElement(Minusinfant).click();
	}
	
	public void Businessclass()
	{
		base.driver.findElement(Businessclass).click();
	}
	
	public void TravellerDonebtn()
	{
		base.driver.findElement(TravellerDonebtn).click();
	}
	
	public void FlightRTsearchBtn()
	{
		base.driver.findElement(FlightRTsearchBtn).click();
	}
	
	
	
	
}
