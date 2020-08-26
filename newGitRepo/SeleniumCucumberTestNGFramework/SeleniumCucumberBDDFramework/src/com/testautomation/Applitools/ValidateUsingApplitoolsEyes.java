package com.testautomation.Applitools;
import org.openqa.selenium.WebDriver;

import com.applitools.eyes.MatchLevel;
import com.applitools.eyes.selenium.Eyes;

public class ValidateUsingApplitoolsEyes {

	Eyes eyes;
	WebDriver driver;

	public void initiateEyes(WebDriver driver, String appName, String testName) {
		
		eyes = new Eyes();
		eyes.setApiKey("YNLF8OnJ56kjv78dfMLM102U4A19q0TnjMjKim974a48A110");
		eyes.open(driver, appName, testName);
	}
	
	public void validateWindow() {
		
		eyes.checkWindow();
	}
	
	public void closeEyes() {
		
		eyes.close();
	}
	
	public void setLayoutMatchLevel() {
		
		eyes.setMatchLevel(MatchLevel.LAYOUT);
	}
}
