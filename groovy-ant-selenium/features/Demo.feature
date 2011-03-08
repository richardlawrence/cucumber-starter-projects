Feature: Demo
  Make sure Cucumber and Selenium are wired up properly
  
  Scenario: Search Google
    When I search Google for "cuke4duke"
    Then there should be a result for "https://github.com/aslakhellesoy/cuke4duke"