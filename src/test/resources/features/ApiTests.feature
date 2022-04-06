Feature: API Tests
    #API Tests 1
    #1. Write API Test for http://api.zippopotam.us/de/bw/stuttgart
    #• Verify that the response status code is 200 and content type is JSON.
    #• Verify that the response time is below 1s.
    #• Verify in Response - That "country" is "Germany" and "state" is "Baden-Württemberg".
    #• Verify in Response - For Post Code "70597" the place name has "Stuttgart Degerloch".

  @API
  Scenario: API Test 1
    Given I perform a GET request to the "de/bw/stuttgart" url
    Then I verify that the status code is 200
    Then I verify that the content type is "application/json"
    Then I verify that the response time is below 1 seconds
    Then I verify that the "country" key has the "Germany" value
    Then I verify that the "state" key has the "Baden-Württemberg" value
    Then I verify that the postal code "70597" has the place name "Stuttgart Degerloch"


    #API Tests 2
    #2. Write API Data Driven Test for http://api.zippopotam.us/{country}/{postal-code}
    #In Data Driven Test - replace "Country" and "Postal Code" in above Test URL from Test Data.
    #Test Data:
    #Country  Postal Code   Place Name
    #us       90210         Beverly Hills
    #us       12345         Schenectady
    #ca       B2R           Waverley
    #• Verify that the response status code is 200 and content type is JSON.
    #• Verify that the response time is below 1s.
    #• Verify in Response - "Place Name" for each input "Country" and "Postal Code".

  @API
  Scenario Outline: API Test 2
    Given I perform a GET request to "<Country>" "<Postal Code>"
    Then I verify that the status code is 200
    Then I verify that the content type is "application/json"
    Then I verify that the response time is below 1 seconds
    Then I verify that the "places[0].'place name'" key has the "<Place Name>" value

    Examples:
      | Country | Postal Code | Place Name    |
      | us      | 90210       | Beverly Hills |
      | us      | 12345       | Schenectady   |
      | ca      | B2R         | Waverley      |