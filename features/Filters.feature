Feature: Filters

Background:
	Given I open the application 
	And I open filters

Scenario Outline: Validate that user can order results
	Given I sort results with "<Value>" 
	When I close filters 
	Then I see list of movies sorted as expected
	Examples:
	| Value | 
	| Ascending | 
	| Descending | 
	
Scenario Outline: Validate that user can sort results 
	Given I sort results with "<Value>" 
	When I close filters 
	Then I see list of movies sorted as expected
	Examples:
	| Value | 
	| Popularity | 
	| Vote Average | 
	| Original Title  | 
	| Vote Count | 
	| Release Date  | 
	| Revenue |



Scenario: Validate that user can sort by Genres
	Given I sort results with "<Value>" 
	When I close filters 
	Then I see list of movies sorted as expected
	Examples:
	| Value | 
	| Action | 
	| Adventure | 
	| Animation  | 
	| Comedy | 
	| Crime  | 
	| Documentary |
	| Drame | 
	| Family | 
	| Fantasy  | 
	| History | 
	| Horror  | 
	| Music |
	| Mystery | 
	| Romance  | 
	| Science Fiction | 
	| TV Movie  | 
	| Thriller |
	| War  | 
	| Western |
	
	
	
