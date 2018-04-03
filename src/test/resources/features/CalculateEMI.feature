Feature: As a user, I should be able to calculate EMI using the EMI Calculator site

  Scenario Outline: Calculate Home Loan EMI
    Given I open EMI Calculator website
    When I enter "<Home Loan Amount>" "<Interest Rate>" "<Loan Tenure>" in search textbox
    Then I should get result as "<Loan EMI>" "<Total Interest Payable>" "<Total Payment(Principal + Interest)>"

    Examples: 
      | Home Loan Amount | Interest Rate | Loan Tenure | Loan EMI | Total Interest Payable | Total Payment(Principal + Interest) |
      |        20,00,000 |            10 |           5 |   42,494 |               5,49,645 |                           25,49,645 |
      |        30,00,000 |           9.5 |           6 |   54,824 |               9,47,333 |                           39,47,333 |
      |        40,00,000 |             9 |           7 |   64,356 |              14,05,930 |                           54,05,930 |
      |        50,00,000 |           8.5 |           8 |   71,961 |              19,08,222 |                           69,08,222 |

  Scenario Outline: Calculate Personal Loan EMI
    Given I open EMI Calculator website
    When I Click on Personal Loan
    And I enter "<Personal Loan Amount>" "<Interest Rate>" "<Loan Tenure>" in search textbox
    Then I should get result as "<Loan EMI>" "<Total Interest Payable>" "<Total Payment(Principal + Interest)>"

    Examples: 
      | Personal Loan Amount | Interest Rate | Loan Tenure | Loan EMI | Total Interest Payable | Total Payment(Principal + Interest) |
      |             5,00,000 |            11 |           3 |   16,369 |                 89,297 |                            5,89,297 |
      |             6,00,000 |            10 |           4 |   15,218 |               1,30,442 |                            7,30,442 |
      |             7,00,000 |             9 |           5 |   14,531 |               1,71,851 |                            8,71,851 |
      |             8,00,000 |             8 |           6 |   14,027 |               2,09,915 |                           10,09,915 |

  Scenario Outline: Calculate Car Loan EMI
    Given I open EMI Calculator website
    When I Click on Car Loan
    And I enter "<Car Loan Amount>" "<Interest Rate>" "<Loan Tenure>" in search textbox
    Then I should get result as "<Loan EMI>" "<Total Interest Payable>" "<Total Payment(Principal + Interest)>"

    Examples: 
      | Car Loan Amount | Interest Rate | Loan Tenure | Loan EMI | Total Interest Payable | Total Payment(Principal + Interest) |
      |        8,00,000 |             8 |           7 |   12,469 |               2,47,394 |                           10,47,394 |
      |        7,00,000 |             9 |           6 |   12,618 |               2,08,487 |                            9,08,487 |
      |        6,00,000 |            10 |           5 |   12,748 |               1,64,894 |                            7,64,894 |
      |        5,00,000 |            11 |           4 |   12,923 |               1,20,293 |                            6,20,293 |
