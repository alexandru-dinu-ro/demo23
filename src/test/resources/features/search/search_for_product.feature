@search_for_product
Feature: Search for product

  @positive
  Scenario Outline: API call to valid search product endpoint returns 200 response status code.
    When user calls the search product endpoint for "<product>"
    Then user should receive response status code <expected_status_code>

    Examples:
      | product | expected_status_code |
      | orange  | 200                  |
      | apple   | 200                  |
      | pasta   | 200                  |
      | cola    | 200                  |

  @negative
  Scenario Outline: API call to invalid search product endpoint returns 404 response status code.
    When user calls the search product endpoint for "<product>"
    Then user should receive response status code <expected_status_code>

    Examples:
      | product  | expected_status_code |
      | tomato   | 404                  |
      | cucumber | 404                  |
      | rice     | 404                  |
      | water    | 404                  |

  @positive
  Scenario Outline: API call to verify product stock.
    When user calls the search product endpoint for "<product>"
    Then user should receive response body containing <expected_item_count> items

    Examples:
      | product | expected_item_count |
      | orange  | 0                   |
      | apple   | 0                   |
      | pasta   | 20                  |
      | cola    | 20                  |
