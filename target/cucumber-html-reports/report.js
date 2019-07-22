$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Flipkart.feature");
formatter.feature({
  "line": 1,
  "name": "Flipkart Application",
  "description": "",
  "id": "flipkart-application",
  "keyword": "Feature"
});
formatter.before({
  "duration": 19074520905,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Flipkart Testing",
  "description": "",
  "id": "flipkart-application;flipkart-testing",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "i open the flipkart website",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "serch for \"mobiles\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "i select random brand",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "i select sortby option",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I click browserback",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "i selest pagenation",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "i select item",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "i click on add to cart button",
  "keyword": "And "
});
formatter.match({
  "location": "FlipkartBDD.i_open_the_flipkart_website()"
});
formatter.result({
  "duration": 68550901518,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "mobiles",
      "offset": 11
    }
  ],
  "location": "FlipkartBDD.serch_for_something(String)"
});
formatter.result({
  "duration": 8465074136,
  "status": "passed"
});
formatter.match({
  "location": "FlipkartBDD.i_select_random_brand()"
});
formatter.result({
  "duration": 25652315525,
  "status": "passed"
});
formatter.match({
  "location": "FlipkartBDD.i_select_sortby_option()"
});
formatter.result({
  "duration": 2579560848,
  "error_message": "org.openqa.selenium.WebDriverException: unknown error: Element \u003cdiv class\u003d\"_1xHtJz\"\u003e...\u003c/div\u003e is not clickable at point (593, 181). Other element would receive the click: \u003cdiv class\u003d\"_9TXcbt\"\u003e...\u003c/div\u003e\n  (Session info: chrome\u003d75.0.3770.142)\n  (Driver info: chromedriver\u003d2.38.552522 (437e6fbedfa8762dec75e2c5b3ddb86763dc9dcb),platform\u003dWindows NT 10.0.17134 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.13.0\u0027, revision: \u00272f0d292\u0027, time: \u00272018-06-25T15:24:21.231Z\u0027\nSystem info: host: \u0027DESKTOP-HUJ3RCU\u0027, ip: \u0027192.168.137.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_144\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.38.552522 (437e6fbedfa876..., userDataDir: C:\\Users\\CSC\\AppData\\Local\\...}, cssSelectorsEnabled: true, databaseEnabled: false, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 75.0.3770.142, webStorageEnabled: true}\nSession ID: 65124d7edaa242a7af3d57975c03d645\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:276)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:83)\r\n\tat FlipkartPOM.SearchResultsPage.clicksortby(SearchResultsPage.java:35)\r\n\tat FlipkartBDD.FlipkartBDD.i_select_sortby_option(FlipkartBDD.java:42)\r\n\tat ✽.And i select sortby option(Flipkart.feature:7)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "FlipkartBDD.i_click_browserback()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "FlipkartBDD.i_selest_pagenation()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "FlipkartBDD.i_select_item()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "FlipkartBDD.i_click_on_add_to_cart_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.write("Current Page URL is https://www.flipkart.com/search?q\u003dmobiles\u0026otracker\u003dsearch\u0026otracker1\u003dsearch\u0026marketplace\u003dFLIPKART\u0026as-show\u003don\u0026as\u003doff\u0026p%5B%5D\u003dfacets.serviceability%5B%5D%3Dtrue\u0026p%5B%5D\u003dfacets.brand%255B%255D%3DHonor");
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 1680060144,
  "status": "passed"
});
});