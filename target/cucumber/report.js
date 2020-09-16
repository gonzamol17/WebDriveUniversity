$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("ContactUs.feature");
formatter.feature({
  "line": 1,
  "name": "Submit data to the webdriveruniversity.com using contact us",
  "description": "form",
  "id": "submit-data-to-the-webdriveruniversity.com-using-contact-us",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Submit valid data via contact us form",
  "description": "",
  "id": "submit-data-to-the-webdriveruniversity.com-using-contact-us;submit-valid-data-via-contact-us-form",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I access webdriveruniversity contact us form",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter a valid date first name",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I enter a valid date last name",
  "rows": [
    {
      "cells": [
        "woods",
        "jackson",
        "jones"
      ],
      "line": 8
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I enter a valid email address",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I enter a comments",
  "rows": [
    {
      "cells": [
        "Ejemplo de lo que puede escribir en la linea 1",
        "Ejemplo de lo que puede escribir en la linea  2"
      ],
      "line": 11
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I click on the submit button",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "the information should successfuly be sumitted via the contact us form",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.uri("Products.feature");
formatter.feature({
  "line": 1,
  "name": "Products",
  "description": "",
  "id": "products",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Valida promo code alert is visible when clicking on the special offers link",
  "description": "",
  "id": "products;valida-promo-code-alert-is-visible-when-clicking-on-the-special-offers-link",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "user navigates to \"\u003curl\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user click on \"\u003cbutton\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user shoul be presented with a promo alert",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "products;valida-promo-code-alert-is-visible-when-clicking-on-the-special-offers-link;",
  "rows": [
    {
      "cells": [
        "url",
        "button"
      ],
      "line": 10,
      "id": "products;valida-promo-code-alert-is-visible-when-clicking-on-the-special-offers-link;;1"
    },
    {
      "cells": [
        "http://www.webdriveruniversity.com/Page-Object-Model/products.html",
        "#container-special-offers"
      ],
      "line": 11,
      "id": "products;valida-promo-code-alert-is-visible-when-clicking-on-the-special-offers-link;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 11,
  "name": "Valida promo code alert is visible when clicking on the special offers link",
  "description": "",
  "id": "products;valida-promo-code-alert-is-visible-when-clicking-on-the-special-offers-link;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "user navigates to \"http://www.webdriveruniversity.com/Page-Object-Model/products.html\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user click on \"#container-special-offers\"",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user shoul be presented with a promo alert",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});