Feature: The language of the website can be changed to English

  Rule: If the website is displayed in Hungarian, and I switch the language to English, all text on the website will be displayed in English.

    Background:
      Given I open the home page
      And the language of the website is Hungarian

    Scenario Outline: Switching the language to English
      When  I press the "English" link
      Then text on the website will be displayed in English
      And opened URL will be switched to https://bevasarlas.tesco.hu/groceries/en-GB/
      And ""English" button switches to "Magyar" button