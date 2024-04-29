Feature: Capture and display the error message from to details with any one input invalid
@smoke @regression
  Scenario: View error message from to details with any one input invalid
    Given urbanladder website open in his browser
    When user click on the GiftCard
    And hovers over the Birthday/Anniversary
    And click on the Chosen
    And click on the Amount
    And click on next button
    And fill the form
    Then extract error message from to details
    And displays the error message in the console
    And store error message data in excel sheet
