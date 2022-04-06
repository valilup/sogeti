  #Test number 3
  #1. Navigate to the URL https://www.sogeti.com/
  #2. Click the Worldwide Dropdown link in Page Header.
  #3. A Country dropdown list is displayed. These are the Country specific Sogeti links. 4. Assert that all the Country specific Sogeti links are working.

  Feature:Check that the all the country specific Sogeti links are working

    @cucumber
    Scenario: Check the specific Sogeti links are working
      Given I navigate to the "Sogeti homepage" page
      When I click on the "Allow all cookies" button on the Cookies Banner
      And I click on the "Worldwide globe icon" from the Header
      Then I verify that all the Country specific Sogeti links are working