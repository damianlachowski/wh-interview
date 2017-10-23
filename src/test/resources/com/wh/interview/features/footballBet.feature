@football
Feature: Football bet

  As a WH Customer
  I want the ability to place a bet on a English Premier League event

  Scenario Outline: Betting on English Premier League event
    Given Customer is on William Hill betting page
    When Customer navigates to a Premiership football event
    And Customer bets <stake> for the home team to ‘Win’
    Then Proper odd and return are displayed

    Examples:
      |  stake  |
      |  0.05   |
      |   20    |
      |  -10    |
      | 10.258  |
      | 1000000 |
      |  10,50  |
      |    0    |