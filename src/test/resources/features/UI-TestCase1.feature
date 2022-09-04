    # Test Case 1
    #1. Navigate to the URL https://www.sogeti.com/
    #2. Hover over Services Link (see Image below) and then Click Automation link.
    #3. Verify that Automation Screen is displayed, and “Automation” text is visible in Page.
    #4. Hover again over Services Link. Verify that the Services and Automation are selected (see
    #Image below).

    Feature: UI Tests

      Background:
        Given I am on the "Sogeti homepage" page
        And I hover over the "Services link" from the Header
        And I click on the "Automation link" from the Header

      @cucumber
      Scenario:Test 1 - Verify that the Service and Automation are selected
        Then I verify that the "Automation header text" is visible on the Automation Page
        And I verify that the current url contains "Automation" text

      @cucumber
      Scenario: Test 1.1 - Verify that Service and Automation link are selected
        When I hover over the "Services link" from the Header
        Then I verify that the Service and Automation are selected
          | Services link   | class     | selected |
          | Automation link | class     | selected |

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
        When I complete the contact form with valid information
        Then I verify that the invalid captcha error message is displayed