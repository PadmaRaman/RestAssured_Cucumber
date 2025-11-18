Feature: APIs list for practice - Products

  Background:
    Given the base URI is "https://automationexercise.com/api"

  Scenario: Get all Products lists
    When I send a GET request to retrieve all books using "/productsList"
    Then the status code should be 200
    #And the "responseCode" should be 200
    And the response should contain "products" array
    And each product should have atleast id, name, price and category
    And the "products" array should not be empty

  Scenario: Post all the Products to lists
    When I send a POST request to add all books using "/productsList"
    Then the status code should be 200
    #Then the "responseCode" should be 405
    #And the "message" should be "This request method is not supported."

  Scenario Outline: Search the Products with value "top" from lists
    When I send a POST request to add all books using "/searchProduct" filtered as "<brand_name>"
    Then the status code should be 200
    #Then the "responseCode" should be 405
    #And the "message" should be "This request method is not supported."
    Examples:
      | brand_name |
      | top        |
      | Tshirt     |

  Scenario: Search the Products from lists
    When I send a POST request to add all books using "/searchProduct"
    Then the status code should be 200
    #Then the "responseCode" should be 405
    #And the "message" should be "This request method is not supported."



