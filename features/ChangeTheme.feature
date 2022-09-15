Feature: Change Mode

Background:
	Given I open the application 
	
Scenario: Validate that user can change the application mode
	Given I open Theme
	When I change the mode
	Then I see the mode is changed
		

