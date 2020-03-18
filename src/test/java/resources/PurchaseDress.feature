Feature: User is able to add summer dress to chart
         and user is possible to process to the Sign section

@Test
  Scenario: Add summer dress to the cart and proceed to sign in section
    Given  The user is on the "http://automationpractice.com/index.php" website
    When  The user types "summer dress" in the text area field
    And   The user click the search button
    And   The page reloads with summer dresses results
    And   The user clicks on the printed summer dress
    And   The user clicks on add to cart button
    And   Pop alert message is displayed with a message
    And   The user clicks the proceed to checkout button on the pop alert
    Then  The user click the proceed to checkout button
    Then The user is presented with authentication Sign in section


