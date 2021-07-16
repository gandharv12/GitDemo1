Feature: Application Login

Scenario: HomePage Default Login
Given User is at landing page
When user login in to application with "jin" and password "1234"
Then Home Page of Website is populated
And Cards are displayed "true"


Scenario: HomePage Default Login
Given User is at landing page
When user login in to application with "john" and password "4321"
Then Home Page of Website is populated
And Cards are displayed "false"
