Feature: API Tests

  Scenario: API Test 1
    Given I perform a GET request to the "de/bw/stuttgart" url
    Then I verify that the status code is 200
    Then I verify that the content type is "application/json"
    Then I verify that the response time is below 1 seconds
    Then I verify that the "country" key has the "Germany" value
    Then I verify that the "state" key has the "Baden-Württemberg" value
    Then I verify that the postal code "70597" has the place name "Stuttgart Degerloch"

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