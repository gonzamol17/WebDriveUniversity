Feature: Submit data to the webdriveruniversity.com using contact us
  form

  Scenario: Submit valid data via contact us form
    Given I access webdriveruniversity contact us form
    When I enter a valid date first name
    When I enter a valid date last name
     |woods    |jackson       |jones       |
    And I enter a valid email address
    And I enter a comments
      |Ejemplo de lo que puede escribir en la linea 1   |Ejemplo de lo que puede escribir en la linea  2 |
    When I click on the submit button
    Then the information should successfuly be sumitted via the contact us form
