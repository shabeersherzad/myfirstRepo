Feature: Retail Application Account Feature
  
  Background:
  Given User is on retail website
    When User click on Sign in option
    And User enter email 'shershah@gmail.com' and password 'Sher@123'
    And User click on login button
    And user should be logged in into Account

  
  Scenario: Verify User can update Profile Information
    When User Click on Account option
    And User update Name 'Khan Saib' and Phone '5716004228'
    And User click on Update button
    Then User profile information shoud be updated
