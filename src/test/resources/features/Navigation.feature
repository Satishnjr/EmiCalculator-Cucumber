Feature: Navigation Testing Scenarios

  Scenario: Select Navigation for Header Menu
    Given I open EMI Calculator website
    Then I Verify all the links in menu

  Scenario: Select Navigation for Calculators and Indicators Nav Link
    Given I open EMI Calculator website
    And I click on Calculators and Indicators Nav Link
    Then I Verify it shows all the sub links

  Scenario: Select Navigation for FAQS Nav Link
    Given I open EMI Calculator website
    And I click on FAQS Nav Link
    Then I Verify all the FAQS sub links

  Scenario: Select Navigation for Header in mobile
    Given I open EMI Calculator website in mobile
    Then I Verify all the links in menu

  Scenario: Select Navigation for Calculators and Indicators Nav Link in mobile
    Given I open EMI Calculator website in mobile
    When I Click on menu
    And I click on Calculators and Indicators Nav Link
    Then I Verify it shows all the sub links

  Scenario: Select Navigation for FAQS Nav Link in mobile
    Given I open EMI Calculator website in mobile
    When I Click on menu
    And I click on FAQS Nav Link
    Then I Verify all the FAQS sub links
