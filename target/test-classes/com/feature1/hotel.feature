#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: hotel booking
  

  @tag1
  Scenario: login functionality
    Given user must launch the url
    When user enter the username
    And user enter the password
    Then user click the login button and navigates to search hotel

  @tag2
  Scenario: search hotel
    When user select the location
    And user select the hotel
    And user select the roomtype
    And user select the noofrooms
    And user enter the checkin date
    And user enter the checkout date
    And user select adultsperroom
    And user select the childrenperroom
    Then user click the search button and navigates to search hotel
 
