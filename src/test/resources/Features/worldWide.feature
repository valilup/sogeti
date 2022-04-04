@cucumber
Feature:Check that the all the country specific Sogeti links are working

  Scenario: Check the specific Sogeti links are working
    Given I navigate to the "Sogeti homepage" page
    When I click on the "Allow all cookies" button on the Cookies Banner
    And I click on the "Worldwide globe icon" from the Header
    Then I verify that all the Country specific Sogeti links are working