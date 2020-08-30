package com.testautomation.PageLocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ApplitoolsPagelocators {

	WebDriver driver = null;
	
	@FindBy(xpath="//*[@id='name']")
	public WebElement nameTextbox;
	
	@FindBy(xpath="//*[@id='date']")
	public WebElement dateSelector;
	
	@FindBy(xpath="//*[@id='intime']")
	public WebElement intimeOption;
	
	@FindBy(xpath="//*[@id='outtime']")
	public WebElement outtimeOption;
	
	@FindBy(xpath="//*[@id='textInput']")
	public WebElement textInput;

	@FindBy(xpath="//*[@id='answer']")
	public WebElement button;
	
	@FindBy(xpath="//*[@id='demo']")
	public WebElement demo;
	
	@FindBy(xpath="//div[contains(text(), 'Manage Booking')]")
	public WebElement manageBooking;
	
	@FindBy(xpath="//*[contains(text(), 'Cancel')]")
	public WebElement cancelBooking;
	
	@FindBy(xpath="//*[contains(text(), 'Reschedule')]")
	public WebElement rescheduleBooking;
	
	@FindBy(xpath="//*[text()='Cancel your Ticket']")
	public WebElement cancelheading;
	
	@FindBy(xpath="//*[text()='RESCHEDULE TICKETS']")
	public WebElement rescheduleheading;
	
	@FindBy(xpath="//*[contains(text(), 'Show My Ticket')]")
	public WebElement showTicket;
	
	@FindBy(xpath="(//*[contains(text(), 'PRINT TICKET')])[1]")
	public WebElement printTicket;
	
	public ApplitoolsPagelocators(WebDriver driver) { 
		
        this.driver = driver; 
	}

}
