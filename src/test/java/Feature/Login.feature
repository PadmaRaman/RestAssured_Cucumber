Feature: APIs list for practice - Login Functionalities

  Background:
    Given the base URI is "https://automationexercise.com/api"

  Scenario Outline: To verify login details with valid credentials
    When I send a POST request to login to "/verifyLogin" using <email>, <password>
    Then the status code should be 200
    #Then the "responseCode" should be 405
    #And the "message" should be "Bad request, email or password parameter is missing in POST request."
    Examples:
      | email | password |
      | "ABC" | "ABC"    |
      | "DEF" | "DEF"    |

  Scenario: To verify login details without email
    When I send a POST request to login to "/verifyLogin" using "password"
    Then the status code should be 200
    #Then the "responseCode" should be 405
    #And the "message" should be "Bad request, email or password parameter is missing in POST request."

  Scenario: Delete login
    When I send a DELETE request to login to "/verifyLogin"
    Then the status code should be 200
    #Then the "responseCode" should be 405
    #And the "message" should be "This request method is not supported."

