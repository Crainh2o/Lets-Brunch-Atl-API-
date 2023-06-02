Feature: Rest API functionalities

  Scenario: User able to get a list of Brunch Restaurants near location
    Given A list of Brunch Restaurants near my location

  Scenario: User able to search for Brunch Restaurants by criteria
    Given A list of restaurants exist
    When User search by cuisine
    Then then user see brunch restaurants

  Scenario: User able to search for Brunch Restaurants by criteria and add review
    Given A list of restaurants exist
    When User search by price range
    Then then user see brunch restaurants

