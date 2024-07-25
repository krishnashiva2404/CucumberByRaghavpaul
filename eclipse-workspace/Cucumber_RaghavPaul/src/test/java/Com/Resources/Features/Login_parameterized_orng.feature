Feature: feture to test Login with parameterization in orang Hrm

  Scenario Outline: verify the login functionality with parameters
    Given User launch the browser
    And user is on applcation login page
    When user enter the <username> and <password>
    And user click on the login button
    Then user navigate to the Homepage Dashboard

    Examples: 
      | username | password |
      | Admin    | admin123 |
      | shiva    | shiva123 |
