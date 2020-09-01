$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/JavaNewWorkSpace/proj_Swag_CC_BDD_FW/src/test/java/features/End2End.feature");
formatter.feature({
  "line": 1,
  "name": "End to End test",
  "description": "",
  "id": "end-to-end-test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "",
  "description": "",
  "id": "end-to-end-test;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is in login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "page title is Swag Labs",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enter username and password",
  "rows": [
    {
      "cells": [
        "standard_user",
        "secret_sauce"
      ],
      "line": 8
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user click on log in button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user is on Home Page",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "user click on item",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user click on cart",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user click on checkout",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user enters firstname and lastname and zip",
  "rows": [
    {
      "cells": [
        "Iftekhar",
        "Uddin",
        "76010"
      ],
      "line": 15
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "user click on continue",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "user is on payment page",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "user click on finish",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "user opt out",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "E2EStepDefinition.user_is_in_login_page()"
});
formatter.result({
  "duration": 5976968000,
  "status": "passed"
});
formatter.match({
  "location": "E2EStepDefinition.page_title_is_Swag_Labs()"
});
formatter.result({
  "duration": 2005581400,
  "status": "passed"
});
formatter.match({
  "location": "E2EStepDefinition.user_enter_username_and_password(DataTable)"
});
formatter.result({
  "duration": 2108291600,
  "status": "passed"
});
formatter.match({
  "location": "E2EStepDefinition.user_click_on_log_in_button()"
});
formatter.result({
  "duration": 4425088100,
  "status": "passed"
});
formatter.match({
  "location": "E2EStepDefinition.user_is_on_Home_Page()"
});
formatter.result({
  "duration": 2004167000,
  "status": "passed"
});
formatter.match({
  "location": "E2EStepDefinition.user_click_on_item()"
});
formatter.result({
  "duration": 2035948100,
  "status": "passed"
});
formatter.match({
  "location": "E2EStepDefinition.user_click_on_cart()"
});
formatter.result({
  "duration": 2124967600,
  "status": "passed"
});
formatter.match({
  "location": "E2EStepDefinition.user_click_on_checkout()"
});
formatter.result({
  "duration": 2116411800,
  "status": "passed"
});
formatter.match({
  "location": "E2EStepDefinition.user_enters_firstname_and_lastname_and_zip(DataTable)"
});
formatter.result({
  "duration": 2129617300,
  "status": "passed"
});
formatter.match({
  "location": "E2EStepDefinition.user_click_on_continue()"
});
formatter.result({
  "duration": 85722300,
  "status": "passed"
});
formatter.match({
  "location": "E2EStepDefinition.user_is_on_payment_page()"
});
formatter.result({
  "duration": 2002532100,
  "status": "passed"
});
formatter.match({
  "location": "E2EStepDefinition.user_click_on_finish()"
});
formatter.result({
  "duration": 108516800,
  "status": "passed"
});
formatter.match({
  "location": "E2EStepDefinition.user_opt_out()"
});
formatter.result({
  "duration": 3002102200,
  "status": "passed"
});
formatter.match({
  "location": "E2EStepDefinition.close_browser()"
});
formatter.result({
  "duration": 619039700,
  "status": "passed"
});
});