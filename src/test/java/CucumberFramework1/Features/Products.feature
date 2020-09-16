Feature: Products

  Scenario Outline: Valida promo code alert is visible when clicking on the special offers link
    Given user navigates to "<url>"
    When user click on "<button>"
    Then user shoul be presented with a promo alert


    Examples:
      |                       url                                         |    button          |
      |http://www.webdriveruniversity.com/Page-Object-Model/products.html |#container-special-offers|
