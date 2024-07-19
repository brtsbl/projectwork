Feature: Specific products can be found using the "Search" function on the page

  Rule: If I search for specific types of products, a list of relevant products will be displayed

    Background:
      Given I open the home page

    Scenario: Search for existing product
      When  I search for "papagáj"
      Then 2 products are displayed
    # And the product's name contains "papagáj"
    #  And header contains the word "papagáj"




    Scenario Outline: Search for existing products
      When  I search for "<productName>"
      Then <numberOfProducts> products are displayed
      And the product's name contains "<productName>"
      And header contains the word "<productName>"

      Examples:
        | productName | numberOfProducts  |
        | papagáj       | 2                |
        | gyömbér    | 19                 |
        | levendula      | 22                |

  Rule: If I search with no input text, nothing changes on the page.

    Background:
      Given I open the home page

    Scenario: Search with no input text
      When  I search for ""
      Then nothing changes on the page

  Rule: If I search for a non-existing product, a message is displayed

    Background: :
      Given I open the home page

    Scenario:  Search for a non-existing product (fababa)
      When I search for "fababa"
      Then a message displayed that the search didn't find relevant products
      And "Shop groceries" button is available
      And "Search" button is available
