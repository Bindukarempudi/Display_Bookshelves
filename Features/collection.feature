Feature: Retrieve all sub-menu items under Category Drop Down
@smoke
  Scenario: View sub-menu items under Category Drop Down
    Given user open  urbanladder website in his browser
    When user click on the Trending
    And selects UL Collections from the dropdown
    And click on the Category
    Then extract sub-menu items and store it in a List
    And displays the same List in the console
    And store data in excel sheet
