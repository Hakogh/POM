$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/LoginFromSql.feature");
formatter.feature({
  "line": 2,
  "name": "Techfios Other login functionality validation using data from sql",
  "description": "",
  "id": "techfios-other-login-functionality-validation-using-data-from-sql",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Dblogin"
    }
  ]
});
formatter.before({
  "duration": 3619861100,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User is on Techfios login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefeinition.user_is_on_Techfios_login_page()"
});
formatter.result({
  "duration": 1828157800,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "User should be able to login with valid credentials",
  "description": "",
  "id": "techfios-other-login-functionality-validation-using-data-from-sql;user-should-be-able-to-login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@DbScenario1"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "User enters \"username\" from mysqldatabase",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User enters \"password\" from mysqldatabase",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User clicks on Signin button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User should land on Dashboard page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "username",
      "offset": 13
    }
  ],
  "location": "LoginStepDefeinition.user_enters_from_mysqldatabase(String)"
});
formatter.result({
  "duration": 4503218900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "password",
      "offset": 13
    }
  ],
  "location": "LoginStepDefeinition.user_enters_from_mysqldatabase(String)"
});
formatter.result({
  "duration": 3202060200,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefeinition.user_clicks_on_Signin_button()"
});
formatter.result({
  "duration": 2152103800,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefeinition.user_should_land_on_Dashboard_page()"
});
formatter.result({
  "duration": 1101921299,
  "status": "passed"
});
formatter.after({
  "duration": 820054800,
  "status": "passed"
});
});