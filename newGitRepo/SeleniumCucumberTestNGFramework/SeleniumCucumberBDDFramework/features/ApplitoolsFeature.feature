@ApplitoolsTesting
Feature: Applitools visual validation
Scenario Outline: Applitools visual Data Validations
	Given Open Chrome browser with "<URL>"
	When Validate all components of webpage
	And Validate the window with Applitools 
	Then Close the browser
Examples:
  |URL|
	|http://localhost/Applitools/Entry%20Page.html|

Scenario Outline: Applitools visual Data Validations for dynamic webpage
	Given Open Chrome browser with "<URL>"
	And Enter "<name>" in the page and submit
	When Validate the window using Selenium
	And validate the window using Applitools layout matchlevel
	Then Close the browser
Examples:
  |URL|name|
	|http://localhost/Applitools/dynamic.html|Saikat|
	
	
	