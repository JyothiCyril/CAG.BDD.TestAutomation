$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/Capgemini/CAG.BDD.TestAutomation/src/test/java/com/qa/features/AmazonDDT.feature");
formatter.feature({
  "line": 1,
  "name": "validate amazon application for DDT using excel",
  "description": "",
  "id": "validate-amazon-application-for-ddt-using-excel",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 7,
  "name": "Validate search item feature in amazon application",
  "description": "",
  "id": "validate-amazon-application-for-ddt-using-excel;validate-search-item-feature-in-amazon-application",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 8,
  "name": "the user is on amazon home page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "select category and item name from the sheetname \"\u003csheetName\u003e\" and rowNum \u003crowNum\u003e",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Magnifier button is clicked",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "the items related to search term should be fetched",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "the driver window should be closed",
  "keyword": "Then "
});
formatter.examples({
  "line": 14,
  "name": "",
  "description": "",
  "id": "validate-amazon-application-for-ddt-using-excel;validate-search-item-feature-in-amazon-application;",
  "rows": [
    {
      "cells": [
        "sheetName",
        "rowNum"
      ],
      "line": 15,
      "id": "validate-amazon-application-for-ddt-using-excel;validate-search-item-feature-in-amazon-application;;1"
    },
    {
      "cells": [
        "Sheet1",
        "0"
      ],
      "line": 16,
      "id": "validate-amazon-application-for-ddt-using-excel;validate-search-item-feature-in-amazon-application;;2"
    },
    {
      "cells": [
        "Sheet1",
        "1"
      ],
      "line": 17,
      "id": "validate-amazon-application-for-ddt-using-excel;validate-search-item-feature-in-amazon-application;;3"
    },
    {
      "cells": [
        "Sheet1",
        "2"
      ],
      "line": 18,
      "id": "validate-amazon-application-for-ddt-using-excel;validate-search-item-feature-in-amazon-application;;4"
    },
    {
      "cells": [
        "Sheet1",
        "3"
      ],
      "line": 19,
      "id": "validate-amazon-application-for-ddt-using-excel;validate-search-item-feature-in-amazon-application;;5"
    },
    {
      "cells": [
        "Sheet1",
        "4"
      ],
      "line": 20,
      "id": "validate-amazon-application-for-ddt-using-excel;validate-search-item-feature-in-amazon-application;;6"
    },
    {
      "cells": [
        "Sheet1",
        "5"
      ],
      "line": 21,
      "id": "validate-amazon-application-for-ddt-using-excel;validate-search-item-feature-in-amazon-application;;7"
    }
  ],
  "keyword": "Examples"
});
formatter.background({
  "line": 3,
  "name": "Launch and invoke the browser",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "the browser is invoked",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "the url should be launched",
  "keyword": "Then "
});
formatter.match({
  "location": "AmazonDDTStepDef.the_browser_is_invoked()"
});
formatter.result({
  "duration": 3029848300,
  "status": "passed"
});
formatter.match({
  "location": "AmazonDDTStepDef.the_url_should_be_launched()"
});
formatter.result({
  "duration": 3486636000,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Validate search item feature in amazon application",
  "description": "",
  "id": "validate-amazon-application-for-ddt-using-excel;validate-search-item-feature-in-amazon-application;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 8,
  "name": "the user is on amazon home page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "select category and item name from the sheetname \"Sheet1\" and rowNum 0",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Magnifier button is clicked",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "the items related to search term should be fetched",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "the driver window should be closed",
  "keyword": "Then "
});
formatter.match({
  "location": "AmazonDDTStepDef.the_user_is_on_amazon_home_page()"
});
formatter.result({
  "duration": 55173500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sheet1",
      "offset": 50
    },
    {
      "val": "0",
      "offset": 69
    }
  ],
  "location": "AmazonDDTStepDef.select_category_and_item_name_from_the_sheetname_and_rowNum(String,int)"
});
formatter.result({
  "duration": 1632231800,
  "status": "passed"
});
formatter.match({
  "location": "AmazonDDTStepDef.magnifier_button_is_clicked()"
});
formatter.result({
  "duration": 2430930200,
  "status": "passed"
});
formatter.match({
  "location": "AmazonDDTStepDef.the_items_related_to_search_term_should_be_fetched()"
});
formatter.result({
  "duration": 499463600,
  "status": "passed"
});
formatter.match({
  "location": "AmazonDDTStepDef.the_driver_window_should_be_closed()"
});
formatter.result({
  "duration": 253549600,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "Launch and invoke the browser",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "the browser is invoked",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "the url should be launched",
  "keyword": "Then "
});
formatter.match({
  "location": "AmazonDDTStepDef.the_browser_is_invoked()"
});
formatter.result({
  "duration": 1201202000,
  "status": "passed"
});
formatter.match({
  "location": "AmazonDDTStepDef.the_url_should_be_launched()"
});
formatter.result({
  "duration": 4688435800,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Validate search item feature in amazon application",
  "description": "",
  "id": "validate-amazon-application-for-ddt-using-excel;validate-search-item-feature-in-amazon-application;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 8,
  "name": "the user is on amazon home page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "select category and item name from the sheetname \"Sheet1\" and rowNum 1",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Magnifier button is clicked",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "the items related to search term should be fetched",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "the driver window should be closed",
  "keyword": "Then "
});
formatter.match({
  "location": "AmazonDDTStepDef.the_user_is_on_amazon_home_page()"
});
formatter.result({
  "duration": 41771800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sheet1",
      "offset": 50
    },
    {
      "val": "1",
      "offset": 69
    }
  ],
  "location": "AmazonDDTStepDef.select_category_and_item_name_from_the_sheetname_and_rowNum(String,int)"
});
formatter.result({
  "duration": 507997600,
  "status": "passed"
});
formatter.match({
  "location": "AmazonDDTStepDef.magnifier_button_is_clicked()"
});
formatter.result({
  "duration": 2417689800,
  "status": "passed"
});
formatter.match({
  "location": "AmazonDDTStepDef.the_items_related_to_search_term_should_be_fetched()"
});
formatter.result({
  "duration": 718863000,
  "status": "passed"
});
formatter.match({
  "location": "AmazonDDTStepDef.the_driver_window_should_be_closed()"
});
formatter.result({
  "duration": 4531343000,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "Launch and invoke the browser",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "the browser is invoked",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "the url should be launched",
  "keyword": "Then "
});
formatter.match({
  "location": "AmazonDDTStepDef.the_browser_is_invoked()"
});
formatter.result({
  "duration": 1164015400,
  "status": "passed"
});
formatter.match({
  "location": "AmazonDDTStepDef.the_url_should_be_launched()"
});
formatter.result({
  "duration": 4280137500,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Validate search item feature in amazon application",
  "description": "",
  "id": "validate-amazon-application-for-ddt-using-excel;validate-search-item-feature-in-amazon-application;;4",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 8,
  "name": "the user is on amazon home page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "select category and item name from the sheetname \"Sheet1\" and rowNum 2",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Magnifier button is clicked",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "the items related to search term should be fetched",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "the driver window should be closed",
  "keyword": "Then "
});
formatter.match({
  "location": "AmazonDDTStepDef.the_user_is_on_amazon_home_page()"
});
formatter.result({
  "duration": 64436400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sheet1",
      "offset": 50
    },
    {
      "val": "2",
      "offset": 69
    }
  ],
  "location": "AmazonDDTStepDef.select_category_and_item_name_from_the_sheetname_and_rowNum(String,int)"
});
formatter.result({
  "duration": 541560700,
  "status": "passed"
});
formatter.match({
  "location": "AmazonDDTStepDef.magnifier_button_is_clicked()"
});
formatter.result({
  "duration": 2447362200,
  "status": "passed"
});
formatter.match({
  "location": "AmazonDDTStepDef.the_items_related_to_search_term_should_be_fetched()"
});
formatter.result({
  "duration": 72018000,
  "status": "passed"
});
formatter.match({
  "location": "AmazonDDTStepDef.the_driver_window_should_be_closed()"
});
formatter.result({
  "duration": 4199084400,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "Launch and invoke the browser",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "the browser is invoked",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "the url should be launched",
  "keyword": "Then "
});
formatter.match({
  "location": "AmazonDDTStepDef.the_browser_is_invoked()"
});
formatter.result({
  "duration": 1260410700,
  "status": "passed"
});
formatter.match({
  "location": "AmazonDDTStepDef.the_url_should_be_launched()"
});
formatter.result({
  "duration": 3051533300,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "Validate search item feature in amazon application",
  "description": "",
  "id": "validate-amazon-application-for-ddt-using-excel;validate-search-item-feature-in-amazon-application;;5",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 8,
  "name": "the user is on amazon home page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "select category and item name from the sheetname \"Sheet1\" and rowNum 3",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Magnifier button is clicked",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "the items related to search term should be fetched",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "the driver window should be closed",
  "keyword": "Then "
});
formatter.match({
  "location": "AmazonDDTStepDef.the_user_is_on_amazon_home_page()"
});
formatter.result({
  "duration": 42016500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sheet1",
      "offset": 50
    },
    {
      "val": "3",
      "offset": 69
    }
  ],
  "location": "AmazonDDTStepDef.select_category_and_item_name_from_the_sheetname_and_rowNum(String,int)"
});
formatter.result({
  "duration": 601731400,
  "status": "passed"
});
formatter.match({
  "location": "AmazonDDTStepDef.magnifier_button_is_clicked()"
});
formatter.result({
  "duration": 1908810300,
  "status": "passed"
});
formatter.match({
  "location": "AmazonDDTStepDef.the_items_related_to_search_term_should_be_fetched()"
});
formatter.result({
  "duration": 607284100,
  "status": "passed"
});
formatter.match({
  "location": "AmazonDDTStepDef.the_driver_window_should_be_closed()"
});
formatter.result({
  "duration": 4447976400,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "Launch and invoke the browser",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "the browser is invoked",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "the url should be launched",
  "keyword": "Then "
});
formatter.match({
  "location": "AmazonDDTStepDef.the_browser_is_invoked()"
});
formatter.result({
  "duration": 1269096100,
  "status": "passed"
});
formatter.match({
  "location": "AmazonDDTStepDef.the_url_should_be_launched()"
});
formatter.result({
  "duration": 3636346100,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "Validate search item feature in amazon application",
  "description": "",
  "id": "validate-amazon-application-for-ddt-using-excel;validate-search-item-feature-in-amazon-application;;6",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 8,
  "name": "the user is on amazon home page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "select category and item name from the sheetname \"Sheet1\" and rowNum 4",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Magnifier button is clicked",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "the items related to search term should be fetched",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "the driver window should be closed",
  "keyword": "Then "
});
formatter.match({
  "location": "AmazonDDTStepDef.the_user_is_on_amazon_home_page()"
});
formatter.result({
  "duration": 53346000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sheet1",
      "offset": 50
    },
    {
      "val": "4",
      "offset": 69
    }
  ],
  "location": "AmazonDDTStepDef.select_category_and_item_name_from_the_sheetname_and_rowNum(String,int)"
});
formatter.result({
  "duration": 508279500,
  "status": "passed"
});
formatter.match({
  "location": "AmazonDDTStepDef.magnifier_button_is_clicked()"
});
formatter.result({
  "duration": 2924042800,
  "status": "passed"
});
formatter.match({
  "location": "AmazonDDTStepDef.the_items_related_to_search_term_should_be_fetched()"
});
formatter.result({
  "duration": 69565600,
  "status": "passed"
});
formatter.match({
  "location": "AmazonDDTStepDef.the_driver_window_should_be_closed()"
});
formatter.result({
  "duration": 4350516200,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "Launch and invoke the browser",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "the browser is invoked",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "the url should be launched",
  "keyword": "Then "
});
formatter.match({
  "location": "AmazonDDTStepDef.the_browser_is_invoked()"
});
formatter.result({
  "duration": 1216044800,
  "status": "passed"
});
formatter.match({
  "location": "AmazonDDTStepDef.the_url_should_be_launched()"
});
formatter.result({
  "duration": 4069581900,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "Validate search item feature in amazon application",
  "description": "",
  "id": "validate-amazon-application-for-ddt-using-excel;validate-search-item-feature-in-amazon-application;;7",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 8,
  "name": "the user is on amazon home page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "select category and item name from the sheetname \"Sheet1\" and rowNum 5",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Magnifier button is clicked",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "the items related to search term should be fetched",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "the driver window should be closed",
  "keyword": "Then "
});
formatter.match({
  "location": "AmazonDDTStepDef.the_user_is_on_amazon_home_page()"
});
formatter.result({
  "duration": 72110800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sheet1",
      "offset": 50
    },
    {
      "val": "5",
      "offset": 69
    }
  ],
  "location": "AmazonDDTStepDef.select_category_and_item_name_from_the_sheetname_and_rowNum(String,int)"
});
formatter.result({
  "duration": 472623200,
  "status": "passed"
});
formatter.match({
  "location": "AmazonDDTStepDef.magnifier_button_is_clicked()"
});
formatter.result({
  "duration": 2300227100,
  "status": "passed"
});
formatter.match({
  "location": "AmazonDDTStepDef.the_items_related_to_search_term_should_be_fetched()"
});
formatter.result({
  "duration": 60148000,
  "status": "passed"
});
formatter.match({
  "location": "AmazonDDTStepDef.the_driver_window_should_be_closed()"
});
formatter.result({
  "duration": 4504687400,
  "status": "passed"
});
});