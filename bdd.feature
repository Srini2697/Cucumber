
@tag
Feature:login 

  @tag1
  Scenario: user should be successfully login into the application 
    Given open the browser enter the url
    When enter valida usename and valid the password 
    And click on login button
    Then home page should be displayed

  