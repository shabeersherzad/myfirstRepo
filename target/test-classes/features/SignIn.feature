Feature: Tek Retail Application SignIn feature

 Background:
  Given User is on retail website
    When User click on Sign in option


  Scenario: Verify user can sign in into Retail Application
    
    And User enter email 'dilberjan@gmail.com' and password 'Jan@123456'
    And User click on login button
    Then user should be logged in into Account

  Scenario Outline: Verify user can sign in into Retail Application
    
    And User enter email '<email>' and password '<password>'
    And User click on login button
    Then user should be logged in into Account

    Examples: 
      | email                        | password    |
      | transformers@tekschool.us    | Tek@12345   |
      | shabeer.shirzad@tekschool.us | 123Khan360! |
      | test@testschool.us           | Tek12345    |

  
  Scenario: Verify user can create an account into Retail Website
    
    And User click on Create New Account button
    And User fill the signUp information with below data
      | name     | email              | password | confirm Password |
      | shershah | shershah@gmail.com | Sher@123 | Sher@123         |
    And User click on SignUp button
    Then User should be logged in into account page
