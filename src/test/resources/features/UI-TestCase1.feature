    # Test number 1 Done
    #1. Navigate to the URL https://www.sogeti.com/
    #2. Hover over Services Link (see Image below) and then Click Automation link.
    #3. Verify that Automation Screen is displayed, and “Automation” text is visible in Page.
    #4. Hover again over Services Link. Verify that the Services and Automation are selected (see
    #Image below).

    @cucumber
    Feature: Verify the header functions

      Scenario: Verify that the Service and Automation are selected
        Given I navigate to the "Sogeti homepage" page
        When I click on the "Allow all cookies" button on the Cookies Banner
        And I hover over the "Services link" from the Header
        And I click on the "Automation link" from the Header
        Then I verify that the "Automation header text" is visible on the Automation Page
      #Then I verify that the automation screen is displayed ??? Where is the AUTOMATION screen or what are you reffering to exactly? TODO sa le trimit mail cu clarificare cu privire la ce se refera? AUTOMATION SCREEN?
        When I hover over the "Services link" from the Header
        Then I verify that the "Services link" element with the "class" attribute contains "selected" value from the Header
        And I verify that the "Automation link" element with the "class" attribute contains "selected" value from the Header


    # TEST number 2 #CANNOT BE AUTOMATED BECAUSE SELENIUM DOES NOT KNOW HOW TO DEAL WITH CAPTCHA
