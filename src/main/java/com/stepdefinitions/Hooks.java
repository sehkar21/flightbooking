package com.stepdefinitions;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import UtilityClass.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


public class Hooks {

	BaseClass base;
	public Hooks(BaseClass base)
	{
		this.base=base;
	}
	
	@Before
	public void open()
	{
		System.out.println("----------------Opening browser--------------");
	}
	
	
	
	@After(order = 1)
	public void afterScenario(Scenario scenario) throws InterruptedException {
		boolean failed = scenario.isFailed();
		System.out.println("is Failed? "+failed);
		if(failed) {
			Thread.sleep(5000);
			byte[] screenshotAs =((TakesScreenshot) base.driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshotAs, "image/png", "failed");
			
		}
		
	}	
	@After(order=0)
	public void teardown()
	{
		base.driver.close();
		System.err.println("---------------closing browser----------------");
	}
}
