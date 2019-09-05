$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/RoomSizeCalculator.feature");
formatter.feature({
  "name": "Calculation the room\u0027s precise size",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@AreaCalculation"
    }
  ]
});
formatter.scenario({
  "name": "Room size calculation in feet",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@AreaCalculation"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User on the calculator page",
  "keyword": "Given "
});
formatter.match({
  "location": "AreaCalculator.user_on_the_calculator_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User select measure unit: Feet",
  "keyword": "When "
});
formatter.match({
  "location": "AreaCalculator.user_select_measure_unit_Feet()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User provides dimensions in feet and inches",
  "keyword": "And "
});
formatter.match({
  "location": "AreaCalculator.user_provides_dimensions_in_feet_and_inches()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click to Calculate button",
  "keyword": "And "
});
formatter.match({
  "location": "AreaCalculator.user_click_to_Calculate_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to get result of total area of room",
  "keyword": "Then "
});
formatter.match({
  "location": "AreaCalculator.user_has_to_get_result_of_total_area_of_room()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Room size calculation in meters",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@AreaCalculation"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User on the calculator page",
  "keyword": "Given "
});
formatter.match({
  "location": "AreaCalculator.user_on_the_calculator_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User select measure unit: Meters",
  "keyword": "When "
});
formatter.match({
  "location": "AreaCalculator.user_select_measure_unit_Meters()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User provides dimensions in meters",
  "keyword": "And "
});
formatter.match({
  "location": "AreaCalculator.user_provides_dimensions_in_meters()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click to Calculate button",
  "keyword": "And "
});
formatter.match({
  "location": "AreaCalculator.user_click_to_Calculate_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to get result of total area of room",
  "keyword": "Then "
});
formatter.match({
  "location": "AreaCalculator.user_has_to_get_result_of_total_area_of_room()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Clearing all fields",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@AreaCalculation"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User on the calculator page",
  "keyword": "Given "
});
formatter.match({
  "location": "AreaCalculator.user_on_the_calculator_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User select measure unit: Feet",
  "keyword": "When "
});
formatter.match({
  "location": "AreaCalculator.user_select_measure_unit_Feet()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User provides dimensions in feet and inches",
  "keyword": "And "
});
formatter.match({
  "location": "AreaCalculator.user_provides_dimensions_in_feet_and_inches()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on Clear button",
  "keyword": "And "
});
formatter.match({
  "location": "AreaCalculator.user_click_on_Clear_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to get all fields empty",
  "keyword": "Then "
});
formatter.match({
  "location": "AreaCalculator.user_has_to_get_all_fields_empty()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});