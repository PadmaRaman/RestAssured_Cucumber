Feature: APIs list for practice - Account Functionalities

  Background:
    Given the base URI is "https://automationexercise.com/api"

  Scenario: Create Account
    When I send a POST request to login to "/createAccount"
    Then the status code should be 200

    #Scenario: Create Account
   # When I send a POST request to login to "/creatAccount"
    #  | name     |
     # | emailid  |
     # | password |
    #  | DOB     |
     # | Address |
     # | Country |
     # | Pincode |
   # Then the status code should be 200