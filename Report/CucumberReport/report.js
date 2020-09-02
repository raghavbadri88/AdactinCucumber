$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Testing of Booking functionality in Adaction Application",
  "description": "",
  "id": "testing-of-booking-functionality-in-adaction-application",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2741400,
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
  "name": "User launch the Adactin Application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User logged in",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_launch_the_Adactin_Application()"
});
formatter.result({
  "duration": 290833800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_logged_in()"
});
formatter.result({
  "duration": 166700,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Verify if the user is able to login the application",
  "description": "",
  "id": "testing-of-booking-functionality-in-adaction-application;verify-if-the-user-is-able-to-login-the-application",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "User launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "User enters valid Username in Username field",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User enters valid Password in Password field",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User clicks on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User verifies navigation to Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_launch_the_application()"
});
formatter.result({
  "duration": 2973448300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enters_valid_Username_in_Username_field()"
});
formatter.result({
  "duration": 438808200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enters_valid_Password_in_Password_field()"
});
formatter.result({
  "duration": 325714300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_clicks_on_Login_button()"
});
formatter.result({
  "duration": 3189579700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_verifies_navigation_to_Search_Hotel_Page()"
});
formatter.result({
  "duration": 160600,
  "status": "passed"
});
formatter.after({
  "duration": 364900,
  "status": "passed"
});
});