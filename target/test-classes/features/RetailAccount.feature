Feature: Retail Application Account Feature

  Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'dilberjan@gmail.com' and password 'Jan@123456'
    And User click on login button
    And user should be logged in into Account
    And User click on Account option

  Scenario: Verify User can update Profile Information
    And User update Name 'Khan Saib' and Phone '5716004228'
    And User click on Update button
    Then User profile information shoud be updated

  Scenario: Verify User can update password
    And User enter below information
      | previousPassword | newPassword | ConfirmNewPassword |
      | Jan@54321        | Jan@123456  | Jan@123456         |
    When User click on change Password button
    Then A message should be displayed Password Updated Successfully

  @addPayment
  Scenario: Verify User can add a payment method
    And User click on Add a payment method link
    And User fill Debit or Credit card information
      | cardNumber | nameOnCard | expirationMonth | expirationYear | securityCode |
    And User click on Add your card button
    Then A message should be displayed 'Payment Method added sucessfully'

  
  Scenario: Verify User can edit Debit or Credit card
    And User click on Edit option of card section
    And User edit information with below data
      | cardNumber | nameOnCard | expirationMonth | expirationYear | securityCode |
    And User click on Update Your Card button
    Then A message should be displayed for update card 'Payment Method updated Successfully'

  @remove
  Scenario: 
    And User click on remove option of Card section
    Then Payment details should be removed

  @addAddress
  Scenario: Verify User can add an Address
    And User click on Add address option
    And User fill new address form with below information
      | country | fullName | phoneNumber | streetAddress | apt | city | state | zipCode |
    And User click Add Your Address button
    Then A message should be displayed for Adding Address 'Address Added Successfully'

  @updateAddress
  Scenario: Verify User can edit an Address added on account
    And User click on eidt address option
    And User eidt address form with below information
      | country       | fullName     | phoneNumber  | streetAddress | apt | city  | state   | zipCode |
      | United States | Donald Trump | 313-453-6534 | 555 Dollar St | Nil | Maimi | Florida |   23454 |
    And User click on update Your Address button
    Then A message should be displayed for Updating Address 'Address Updated Successfully'

  @removeAddress
  Scenario: 
    When User click on remove option of Address section
    Then Address details should be removed
