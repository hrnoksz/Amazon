Feature: Amazon shopping

  @wip
  Scenario Outline:
    Given buyer at Amazon home page
    When buyer searches "<product name>"
    Then the results are listed
    And buyer click on "iPhone13 512"
    Then buyer check "Price"
    Then buyer check "Color"
    Then buyer check "Stock"

    Examples:
      | product name |
      | iPhone13 512 |




  #1. Go to 'https://www.amazon.com.tr/'
  #2. Search iPhone13 512
  #3. Check that the results are listed
  #4. Click iPhone13 at the top of the list
  #5. Log the following values for each size
  #.Size information .Price .Color .Stock status
  #Notes: It may also be necessary to write code to accept the accept cookies warning.