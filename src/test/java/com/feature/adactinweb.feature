
@tag
Feature: Checking the hotel booking of an adactin application
  I want to use this template for my feature file

  @tag1
  Scenario: Login functionality
    Given user Must Launch The Url
    When user Enter The "gopinathking" In The Username Field
    And user Enter the "Gopinath@1993" In The Password Field
    Then user Click The Login button and It Navigates To The Search Hotel


  @tag2
  Scenario Outline: Hotel Search functionality
    When user Select The Location In The Loaction Field
    And  user Select The Hotel In The Hotel Field
    And  user Select The RoomType In The RoomType Field
    And  user Select The Noofrooms In The Noofrooms Field
    And  user Enter The "14/06/2022" In The CheckIn Field
    And  user Enter The "16/06/2022" In The Checkout Field
    And  user Select The Adultsperroom In The Adultsperroom Field
    And  user Select The Childrenperroom In The Childrenperroom Field
    Then user Click The Search button and It Navigates To The Search Hotel
