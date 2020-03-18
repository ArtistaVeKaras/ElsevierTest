$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("PurchaseDress.feature");
formatter.feature({
  "line": 1,
  "name": "User is able to add summer dress to chart",
  "description": "       and user is possible to process to the Sign section",
  "id": "user-is-able-to-add-summer-dress-to-chart",
  "keyword": "Feature"
});
formatter.before({
  "duration": 1291229762,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Add summer dress to the cart and proceed to sign in section",
  "description": "",
  "id": "user-is-able-to-add-summer-dress-to-chart;add-summer-dress-to-the-cart-and-proceed-to-sign-in-section",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@Test"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "The user is on the \"http://automationpractice.com/index.php\" website",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "The user types \"summer dress\" in the text area field",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "The user click the search button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "The page reloads with summer dresses results",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "The user adds the printed summer dress to the cart",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "The user clicks the pop alert proceed to checkout",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Dress is added to the cart in the summary page",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "The user clicks the proceed to checkout button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "The user is presented with authentication Sign in section",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://automationpractice.com/index.php",
      "offset": 20
    }
  ],
  "location": "IndexSteps.the_user_is_on_the_website(String)"
});
formatter.result({
  "duration": 4121248313,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "summer dress",
      "offset": 16
    }
  ],
  "location": "IndexSteps.the_user_types_in_the_text_area_field(String)"
});
formatter.result({
  "duration": 290930150,
  "status": "passed"
});
formatter.match({
  "location": "IndexSteps.the_user_click_the_search_button()"
});
formatter.result({
  "duration": 1913067003,
  "status": "passed"
});
formatter.match({
  "location": "IndexSteps.the_page_reloads_with_summer_dresses_results()"
});
formatter.result({
  "duration": 63079993,
  "status": "passed"
});
formatter.match({
  "location": "IndexSteps.the_user_adds_the_printed_summer_dress_to_the_cart()"
});
formatter.result({
  "duration": 1335101780,
  "status": "passed"
});
formatter.match({
  "location": "IndexSteps.the_user_clicks_the_pop_alert_proceed_to_checkout()"
});
formatter.result({
  "duration": 10434096847,
  "error_message": "org.openqa.selenium.TimeoutException: Expected condition failed: waiting for visibility of [[ChromeDriver: chrome on LINUX (74973c8fe36f6b56163e5da42493c592)] -\u003e xpath: //span[contains(text(),\u0027Proceed to checkout\u0027)]] (tried for 10 second(s) with 500 milliseconds interval)\nBuild info: version: \u00273.11.0\u0027, revision: \u0027e59cfb3\u0027, time: \u00272018-03-11T20:26:55.152Z\u0027\nSystem info: host: \u0027akira\u0027, ip: \u0027192.168.43.185\u0027, os.name: \u0027Linux\u0027, os.arch: \u0027amd64\u0027, os.version: \u00275.3.0-7625-generic\u0027, java.version: \u002711.0.6\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 80.0.3987.87, chrome: {chromedriverVersion: 79.0.3945.36 (3582db32b3389..., userDataDir: /tmp/.com.google.Chrome.VLRlZc}, goog:chromeOptions: {debuggerAddress: localhost:44281}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: LINUX, platformName: LINUX, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 74973c8fe36f6b56163e5da42493c592\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:81)\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:271)\n\tat pageObject.IndexPage.clickPopAlertProceedToCheckout(IndexPage.java:58)\n\tat stepDefinitions.IndexSteps.the_user_clicks_the_pop_alert_proceed_to_checkout(IndexSteps.java:40)\n\tat ✽.And The user clicks the pop alert proceed to checkout(PurchaseDress.feature:11)\n",
  "status": "failed"
});
formatter.match({
  "location": "IndexSteps.dress_is_added_to_the_cart_in_the_summary_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "IndexSteps.the_user_clicks_the_proceed_to_checkout_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "IndexSteps.the_user_is_presented_with_authentication_Sign_in_section()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 15336240,
  "status": "passed"
});
});