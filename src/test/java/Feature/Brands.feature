Feature: APIs list for practice - Brands

  Background:
    Given the base URI is "https://automationexercise.com/api"

  @Smoke
  Scenario: Get all brands lists
    When I send a GET request to retrieve all books using "/brandsList"
    Then the status code should be 200
    #And the "responseCode" should be 200
    And the response should contain "brands" array
    And each product should have atleast id and brand
    And the "brands" array should not be empty

  @Regression
  Scenario: Update the Brand details
    When I send a PUT request to add all books using "/brandsList"
    Then the status code should be 200
      #And the "responseCode" should be 405
      #And the "message" should be "This request method is not supported."




