@Test
Feature: Visual validation of online attendance tracker
@ApplitoolsTesting
Scenario Outline: Visual Data Validations
Given Open Chrome browser with "<URL>"
When Validate components of webpage
Then Close the browser
Examples:
  |URL|
	|http://localhost/Applitools/Entry%20Page.html|

@ApplitoolsLayouts
Scenario Outline: Visual Validations for dynamic webpage
Given Open Chrome browser with "<URL>"
And Enter "<name>" in the page and submit
When validate the layout of the dynamic webpage
Then Close the browser
Examples:
  |URL|name|
  |http://localhost/Applitools/dynamic.html|Saikat|
	
@MultipleWindow
Scenario Outline: Visual validation foe multiple window
Given Open Chrome browser with "<URL>"
When Validate show ticket and cancel page and reschedule page
Then Close the browser

Examples:
  |URL|
  |https://www.redbus.in/|
