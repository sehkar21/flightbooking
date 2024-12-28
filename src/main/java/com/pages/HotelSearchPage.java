package com.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import UtilityClass.BaseClass;

public class HotelSearchPage {

	
BaseClass base;
	
	public HotelSearchPage(BaseClass base)
	{
		this.base=base;
		
	}
	
	
	By HotelsTab          = By.xpath("//span[@class='meuicowidth hotelmenuico']");
	By citysearch         = By.xpath("//span[@class='hp_city']");
	By citysearchname     = By.xpath("(//input[@id='txtCity'])[1]");	
	By citysearchdropdwn  = By.xpath("//div[normalize-space()='Chennai']");
	By check_in           = By.xpath("//div[@id='htl_dates']//p[@class='fnt13']");
	By check_indate       = By.xpath("//a[normalize-space()='30']");
	By check_out          = By.xpath("//div[@id='htl_dates1']//p[@class='fnt13']");
	By check_outdate      = By.xpath("//a[normalize-space()='31']");
	By Room_guest         = By.xpath("//div[@id='divPaxPanel']//p[@class='fnt13']");
	By Roomadultplus      = By.xpath("//a[@id='Adults_room_1_1_plus']");
	By Addroom            = By.xpath("//a[@id='addhotelRoom']");
	By Roomchildplus      = By.xpath("(//a[@id='Children_room_2_2_plus'])[1]");
	By Roomadonebtn       = By.xpath("//a[@id='exithotelroom']");
	By hotelsearchbtn     = By.xpath("//input[@id='btnSearch']");
	
	public void HotelsTab()
	{
		base.driver.findElement(HotelsTab).click();
		
	}
	
	public void citysearch()
	{
		WebDriverWait wait = new WebDriverWait(base.driver, Duration.ofSeconds(10));
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(citysearch));
		element.click();
		//base.driver.findElement(citysearch).click();
		//base.driver.findElement(citysearch).sendKeys("chennai");
		
	}
	public void citysearchname()
	{
		
		base.driver.findElement(citysearchname).sendKeys("chennai");
		
	}
	
	public void citysearchdropdwn()
	{
		base.driver.findElement(citysearchdropdwn).click();
		
	}
	
	public void check_in()
	{
		base.driver.findElement(check_in).click();
		
	}
	
	public void check_indate()
	{
		base.driver.findElement(check_indate).click();
		
	}
	
	public void check_out()
	{
		base.driver.findElement(check_out).click();
		
	}
	
	public void check_outdate()
	{
		base.driver.findElement(check_outdate).click();
		
	}
	
	public void Room_guest()
	{
		base.driver.findElement(Room_guest).click();
		
	}
	
	public void Roomadultplus()
	{
		base.driver.findElement(Roomadultplus).click();
		
	}
	
	public void Addroom() throws InterruptedException
	{
		base.driver.findElement(Addroom).click();
		Thread.sleep(3000);
		
	}
	
	public void Roomchildplus()
	{
		base.driver.findElement(Roomchildplus).click();
		
	}
	
	public void Roomadonebtn()
	{
		base.driver.findElement(Roomadonebtn).click();
		
	}
	
	public void hotelsearchbtn()
	{
		base.driver.findElement(hotelsearchbtn).click();
		
	}
	
	
	
	
}
