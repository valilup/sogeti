@api
Feature: API Tests

  Scenario: Verify the Stutgard scenario
    Given I perform a GET request to the "de/bw/stuttgart" url
    Then I verify that the status code is 200
    Then I verify that the content type is "application/json"
    Then I verify that the response time is below 1 seconds
    Then I verify that the "country" key has the "Germany" value
    Then I verify that the "state" key has the "Baden-Württemberg" value
#    IDK how to do this # TODO ask marius daca e stricat json-ul sau nu stiu eu sa il navighez... ca si asta e cea mai posibila chestie
#    Verify in Response - For Post Code "70597" the place name has "Stuttgart Degerloch". TODO asta e pasul pe care nu stiu cum sa il fac

  Scenario Outline: API DATA DRIVEN TEST
#    TODO fix the <PLACE NAME> ca nu are logica aici in primul pas
    Given I perform a GET request to "<Country>" "<Postal Code>" "<Place Name>"
    Then I verify that the status code is 200
    Then I verify that the content type is "application/json"
    Then I verify that the response time is below 1 seconds
    #TODO I dont know how to navigate the json with 2 separate words
    #I dont know how to

    Examples:
      | Country | Postal Code | Place Name    |
      | us      | 90210       | Beverly Hills |
      | us      | 12345       | Schenectady   |
      | ca      | B2R         | Waverley      |