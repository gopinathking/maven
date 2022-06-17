Feature: Checking the hotel booking of an adactin application
Scenario: Login functionality
    Given user Must Launch The Url
    When user Enter The "gopinathking" In The Username Field
    And user Enter the "Gopinath@1993" In The Password Field
    Then user Click The Login button and It Navigates To The Search Hotel

Scenario: Hotel Search functionality
    When user Select The Location In The Loaction Field
    And  user Select The Hotel In The Hotel Field
    And  user Select The RoomType In The RoomType Field
    And  user Select The Noofrooms In The Noofrooms Field
    And  user Enter The "14/06/2022" In The CheckIn Field
    And  user Enter The "16/06/2022" In The Checkout Field
    And  user Select The Adultsperroom In The Adultsperroom Field
    And  user Select The Childrenperroom In The Childrenperroom Field
    Then user Click The Search button and It Navigates To The Search Hotel
    
Scenario: Hotel Select functionality
    When user Click The button In The Select Field
    Then user Click The Continue button and It navigates to Book a Hotel page
    
Scenario: Hotel Select functionality
    When user Enter The "Gopinath" In The FirstName Field
    And user Enter The "Palanivel" In The LastName Filed
    And user Enter The "Tiruchengode" In The Billing Address Field
    And user Enter The "7100360038002100" In The Credit Card No Field
    And user Select The Creditcard Type In Credit card field
    And user Select The Expirydate In The Month Field
    And user Select The Expirydate In The Year Field
    And user Enter The "567" In The CVV Number Field
    Then user Click The Booknow button and It navigates to Book a Hotel page
    