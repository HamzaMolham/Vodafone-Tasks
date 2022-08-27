Feature: This is to validate that leaving the personal data empty an error msg will appear
  
  Scenario: Purshashing the iphone13 while leaving the personal data empty
    Given I will open the URL of vodafone eshop
    When I click on the English button
    And I click on the Apple logo
    And I click on the iphone13 product
    And I click on the Add to basket button
    And I click on the proceed to checkout button
    And I fill the city and district and click on the deliever to my location button
    And I fill the address, building, floor and appartment data and click on continue
    And I click on continue shipping address button without filling the personal data
    Then I find an error stating to fill the fullname data
    
