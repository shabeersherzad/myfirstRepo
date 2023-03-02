Feature: This feature is use for testing UI of Retail page

  @test
  Scenario: Verify user can search a product
    Given User is on retail website
    When User search for "pokemon" product
    Then The product should be displayed

  @side
  Scenario: Verify Shop by Department sidebar
    Given User is on retail website
    When User click on All section
    Then below options are present in shop by department sidebar
      | Electronics | Computers | Smart Home | Sports | Automative |

  @smokeTest
  Scenario Outline: Verify Department sidebar options
    Given User is on retail website
    When User click on All section
    And User on '<department>'
    Then below options are present in department
      | <optionOne> | <optionTwo> |

    Examples: 
      | department  | optionOne                      | optionTwo                |
      | Electronics | TV & Video                     | Video Games              |
      | Computers   | Accessories                    | Networking               |
      | Smart Home  | Smart Home Lightning           | Plugs and Outlets        |
      | Sports      | Athletic Clothing              | Exercise & Fitness       |
      | Automative  | Automative Parts & Accessories | MotorCycle &Powsersports |

  Scenario: Verify User can add an item to cart
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'shabeer.shirzad@tekschool.us' and password '123Khan360!'
    And User click on login button
    And user should be logged in into Account
    And User change the category to 'Smart Home'
    And User search for an item 'Kasa outdoor Smart Plug'
    And User click on Search icon
    And User click on item
    And User select quantity '2'
    And User click on add to Cart button
    Then the cart icon quantity should change to '2'

  
  Scenario: Verify User can place an order without Shipping address and payment Method on file
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'dilberjan@gmail.com' and password 'Jan@123456'
    And User click on login button
    And user should be logged in into Account
    And User change the category to 'Smart Home'
    And User search for an item 'Kasa outdoor smart plug'
    And User click on Search icon
    And User click on item
    And User select quantity '2'
    And User click on add to Cart button
    Then the cart icon quantity should change to '2'
    And User click on Cart option
    And User click on procced to Checkout button
    And User click Add a new address link for shipping address
    And User fill new address form with below information
      | country | fullName | phoneNumber | streetAddress | apt | city | state | zipCode |
    And User click Add Your Address button
    And User click Add a credit card or Debit card for payment method
    And User fill Debit or Credit card information
      | cardNumber | nameOnCard | expirationMonth | expirationYear | securityCode |
    And User click on Add your card button
    And User click on place Your Order
    Then a message shouled be displayed for placing order 'Order Placed, Thanks'

  @smoke
  Scenario: Verify User can place an order With Shipping address and payment Method on file
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'dilberjan@gmail.com' and password 'Jan@123456'
    And User click on login button
    And user should be logged in into Account
    And User change the category to 'Electronics'
    And User search for an item 'Apex Legends'
    And User click on Search icon
    And User click on items
    And User select quantity '5'
    And User click on add to Cart button
    Then the cart icon quantity should change to '5'
    And User click on Cart option
    And User click on procced to Checkout button
    And User click on place Your Order
    Then a message shouled be displayed for placing order 'Order Placed, Thanks'
