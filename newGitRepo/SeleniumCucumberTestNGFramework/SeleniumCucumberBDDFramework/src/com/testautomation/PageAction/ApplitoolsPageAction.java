package com.testautomation.PageAction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.testautomation.Applitools.ValidateUsingApplitoolsEyes;
import com.testautomation.PageLocators.ApplitoolsPagelocators;
import com.testautomation.Utility.PropertiesFileReader;


public class ApplitoolsPageAction {

	
	ValidateUsingApplitoolsEyes appliObj = new ValidateUsingApplitoolsEyes();
	PropertiesFileReader obj= new PropertiesFileReader();
	private WebDriver driver;
	
	
	public void openUrl(String url) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:/ChromeDriver/chromedriver_win32/chromedriver.exe");
	    driver = new ChromeDriver();
	    
	    System.out.println(">>Launching browser"); 
	    System.out.println("Browser is launched..");
		
		System.out.println(">>Going to URL");
		driver.get(url);
		System.out.println("URL launched..");
	}

	public void validateComponent() {
		// TODO Auto-generated method stub
		ApplitoolsPagelocators locators = PageFactory.initElements(driver, ApplitoolsPagelocators.class);
		
		System.out.println(">>Running tests");
		
		System.out.println("Validating input textbox..");
		if(locators.nameTextbox.isDisplayed()) {
			
			System.out.println(">>Input textbox validated");
		}else {
			
			System.out.println(">>Input textbox validation failed");
		}
		
		System.out.println("Validating date selector..");
		if(locators.dateSelector.isDisplayed()) {
			
			System.out.println(">>Date selector validated");
		}else {
			
			System.out.println(">>Date selector validation failed");
		}
		
		System.out.println("Validating intime option..");
		if(locators.intimeOption.isDisplayed()) {
			
			System.out.println(">>In time option validated");
		}else {
			
			System.out.println(">>In time validation failed");
		}
		
		System.out.println("Validating outtime option..");
		if(locators.intimeOption.isDisplayed()) {
			
			System.out.println(">>Out time option validated");
		}else {
			
			System.out.println(">>Out time validation failed");
		}
	}

	public void ApplitoolsWindowValidation() {
		// TODO Auto-generated method stub
		appliObj.initiateEyes(driver, "Applitools", Thread.currentThread().getStackTrace()[2].getMethodName());
		appliObj.validateWindow();
		appliObj.closeEyes();
	}

	public void closeAll() {
		// TODO Auto-generated method stub
		System.out.println(">>Closing session");
		driver.close();
		driver.quit();
		System.out.println("Session closed..");
	}

	public void enterNameAndSubmit(String name) throws InterruptedException {
		// TODO Auto-generated method stub
		ApplitoolsPagelocators locators = PageFactory.initElements(driver, ApplitoolsPagelocators.class);
		
		System.out.println(">>Running tests");
		
		locators.textInput.sendKeys(name);	
		locators.button.click();
		
		Thread.sleep(200);

	}

	public void validate() {
		// TODO Auto-generated method stub
		
		ApplitoolsPagelocators locators = PageFactory.initElements(driver, ApplitoolsPagelocators.class);
		
		if(!locators.demo.getText().contains("Welcome")) {
			
			System.out.println("Verification failed");
			Assert.fail();
		}else {
			System.out.println("Verification successful");
		}
	}

	public void validateUsingMatchLevel() {
		// TODO Auto-generated method stub
		appliObj.initiateEyes(driver, "Applitools", Thread.currentThread().getStackTrace()[2].getMethodName()); 
		appliObj.setLayoutMatchLevel();
		appliObj.validateWindow();
		appliObj.closeEyes();
	}
	
	

}
