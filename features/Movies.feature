
Feature: Movies

Background:
Given I open the application 

Scenario: Validate that user can see movies in home page

	Then I see list of movies	



Scenario: Validate that user can select and see movies details
	When I select a movie from the list
	Then I see the movie name and details
	And  I see the movie poster
	



