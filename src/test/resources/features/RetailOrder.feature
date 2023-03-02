Feature: Retail Application Order Page

  Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'dilberjan@gmail.com' and password 'Jan@123456'
    And User click on login button
    And user should be logged in into Account
    And User click pn Orders section
    And User click on first order in list

  Scenario: Verify User can cancel the order
    When User click on Cancel the Order button
    And User select the cancelation Reason 'Bought wrong item'
    And User click on Cancel Order button
    Then a cancelation message should be displayed 'Your Order Has Been Cancelled'

  Scenario: Verify User can Return the order
    When User click on Return items button
    And User select the Return Reason 'Item damaged'
    And User select the drop off service 'FedEx'
    And User click on Return Order button
    Then a cancelation message should be displayed for return order 'Return was successfull'

  @order
  Scenario: Verify User can write a review on order placed
    When User click on Review button
    And User write Review headline 'Quality' and 'product quality is really cheap'
    And User click on Add your Review button
    Then a review message should be displayed 'Your review was added successfully'
