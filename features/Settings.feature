Feature: Change Language

Background:
	Given I open the application 
	
Scenario: Validate that user can switch language
	Given I open settings
	When I change the language
	Then I see the language is changed
		

