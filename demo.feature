Feature: Evaluate percentage

  Scenario: Verify 10% discount
    Given Execute DiscountService business
    When I will enter 6000
    Then We should get ten percent discount

  Scenario: Verify 15% discount
    Given Execute DiscountService business
    When I will enter 12000
    Then We should get fifteen percent discount