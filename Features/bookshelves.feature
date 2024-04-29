Feature: Display the name & price of first 3 Bookshelves below Rs. 15000
@smoke @functional
  Scenario: View first 3 Bookshelves below Rs. 15000
    Given user has the urbanladder website open in his browser
    When user click on the study
    And selects Bookshelves from the dropdown
    Then signup pop will be displayed
    When user  close the popup
    And selects Exclude Out Of Stock filter from the page
    And click on the Storage Type
    And selects Open from the dropdown
    And click on the Price
    And slide the price slide bar
    Then extract name and price of the Bookshelves
    And displays the same in the console
    And store data  in excel sheet
