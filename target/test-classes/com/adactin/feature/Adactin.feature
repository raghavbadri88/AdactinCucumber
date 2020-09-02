Feature: Testing of Booking functionality in Adaction Application

Background:
	Given User launch the Adactin Application
	When User logged in


Scenario: Verify if the user is able to login the application
	Given User launch the application
	When User enters valid "RaghavBadri" in Username field
	And User enters valid "Test@123" in Password field
	And User clicks on Login button
	Then User verifies navigation to Search Hotel Page 
	
Scenario: Verify if the user is able to enter required info in Search Hotel page
	When User selects valid Location "London" as "value"
	And User selects Hotel "Hotel Sunshine" as "visibleText"
	And User selects Number of Rooms "3" as "index" and "2" as "value"
	And User selects Check In "12/09/2020" and Check Out "16/09/2020" Dates
	And User selects Adults per Room "3 - Three" as "visibleText"
	And User clicks on Search button
	Then User navigates to Hotel Results Page

Scenario: Verify if the user is able to select the required result
	Given User enters all required info in Search Hotel page
	When User selects required hotel result as per price
	And User clicks on Continue button
	Then User navigates to Book A Hotel Page

Scenario: Verify if the user is able to enter required details in Book A Hotel Page
	Given User selects the hotel as per price
	When User enters Billing Details "Adactin" "Cucumber" "87 Jasmine lane\nCross St\nFreeWay"
	And User enters Card Details "8526974136575289" "1" "index" "October" "visibleText" "2022" "value" "571"
	Then User navigates to Booking Confirmation Page

Scenario: Verify if the user is able to view the Itenary information
	Given User views Booking Confirmation Page
	When User clicks on Logout button
	Then User verifies successful logout message