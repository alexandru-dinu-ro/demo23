Feature: Search for product

  @search_for_product @positive
  Scenario Outline: API call to valid search product endpoint returns 200 response status code.
    When user calls the search product endpoint for "<product>"
    Then user should receive response status code <expected_status_code>

    Examples:
      | product | expected_status_code |
      | orange  | 200                  |
      | apple   | 200                  |
      | pasta   | 200                  |
      | cola    | 200                  |

  @search_for_product @negative
  Scenario Outline: API call to invalid search product endpoint returns 404 response status code.
    When user calls the search product endpoint for "<product>"
    Then user should receive response status code <expected_status_code>

    Examples:
      | product  | expected_status_code |
      | tomato   | 404                  |
      | cucumber | 404                  |
      | rice     | 404                  |
      | water    | 404                  |
