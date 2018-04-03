Feature: EMI Calculator using Excel

  Scenario: Calculate Home Loan EMI
    Given I open EMI Calculator website
    Then I read data from excel and validate emi details
