Feature: Retail Application Account Feature

  Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'dilberjan@gmail.com' and password 'Jan@123456'
    And User click on login button
    And user should be logged in into Account

  Scenario: Verify User can update Profile Information
    Given User click on Account option
    And User update Name 'Khan Saib' and Phone '5716004228'
    And User click on Update button
    Then User profile information shoud be updated

  Scenario: Verify User can update password
    Given User click on Account option
    And User enter below information
      | previousPassword | newPassword | ConfirmNewPassword |
      | Jan@54321        | Jan@123456  | Jan@123456         |
    When User click on change Password button
    Then A message should be displayed Password Updated Successfully

  Scenario: Verify User can add a payment method
    Given User click on Account option
    And User click on Add a payment method link
    And User fill Debit or credit card information
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 2288953621439999 | dilberJani |              10 |           2026 |          355 |
    And User click on Add your card button
    Then A message should be displayed 'Payment Method added sucessfully'

  @smoke
  Scenario: Verify User can edit Debit or Credit card
    When User click on Account option
    And User click on Edit option of card section
    And User edit information with below data
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 5666789867332144 | sher Khan  |              3 |           2027 |          444 |
    And User click on Update Your Card button
    Then A message should be displayed for update card 'Payment Method updated Successfully'
    
