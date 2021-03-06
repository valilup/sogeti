    # Test Case 1
    #1. Navigate to the URL https://www.sogeti.com/
    #2. Hover over Services Link (see Image below) and then Click Automation link.
    #3. Verify that Automation Screen is displayed, and “Automation” text is visible in Page.
    #4. Hover again over Services Link. Verify that the Services and Automation are selected (see
    #Image below).

    Feature: UI Tests

      Background:
        Given I navigate to the "Sogeti homepage" page
        When I click on the "Allow all cookies" button on the Cookies Banner
        And I hover over the "Services link" from the Header
        And I click on the "Automation link" from the Header

      @cucumber
      Scenario:Test 1 - Verify that the Service and Automation are selected
        Then I verify that the "Automation header text" is visible on the Automation Page
        And I verify that the current url contains "Automation" text
        When I hover over the "Services link" from the Header
        Then I verify that the "Services link" element with the "class" attribute contains "selected" value from the Header
        And I verify that the "Automation link" element with the "class" attribute contains "selected" value from the Header

      #Test Case 2 CANNOT BE FULLY AUTOMATED BECAUSE SELENIUM DOES NOT KNOW HOW TO INTERACT WITH CAPTCHA (SKIPPED STEP 7)
      #1. Navigate to the URL https://www.sogeti.com/
      #2. Hover over Services Link and then Click Automation link.
      #3. On Automation Page, scroll down to the Contact us Form.
      #4. Fill the First Name, Last Name, Email, Phone and Message fields with Random Generated Data.
      #5. Check the I agree checkbox.
      #6. Then Click SUBMIT button.
      #7. After clicking SUBMIT button the form is submitted and Thank you message is displayed. Assert the Thank you message.

      @cucumber
      Scenario: Test 2 - Verify the contact form can be completed
        When I scroll to the "contact form" on the Automation Page
        And I complete the contact form with valid information on the Form
        Then I verify that the invalid captcha error message is displayed