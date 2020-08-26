package com.testautomation.StepDef;

import com.testautomation.PageAction.ApplitoolsPageAction;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ApplitoolsStepDef {
	
	ApplitoolsPageAction appAction = new ApplitoolsPageAction();

	@Given("^Open Chrome browser with \"([^\"]*)\"$")
	public void Open_Chrome_browser_with(String url) {
		
		appAction.openUrl(url);
	}
	
	@When("^Validate all components of webpage$")
	public void Validate_all_components_of_webpage() {
		
		appAction.validateComponent();
	}
	
	@And("^Validate the window with Applitools$")
	public void Validate_the_window_with_Applitools() {
		
		appAction.ApplitoolsWindowValidation();
	}
	
	@Then("^Close the browser$")
	public void Close_the_browser() {
		
		appAction.closeAll();
	}
	
	@And("^Enter \"([^\"]*)\" in the page and submit$")
	public void Enter_name_in_the_page_and_submit(String name) throws InterruptedException {
		
		appAction.enterNameAndSubmit(name);
	}
	
	@When("^Validate the window using Selenium$")
	public void Validate_the_window_using_Selenium() {
		
		appAction.validate();
	}
	
	@And("^validate the window using Applitools layout matchlevel$")
	public void validate_the_window_using_Applitools_dynamic_matchlevel() {
		
		appAction.validateUsingMatchLevel();
	}
}
