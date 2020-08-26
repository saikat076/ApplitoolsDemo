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
	
	public ApplitoolsPagelocators(WebDriver driver) { 
		
        this.driver = driver; 
	}

}
