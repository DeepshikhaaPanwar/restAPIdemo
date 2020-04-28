Feature: Application login

Scenario: Home page default login
Given User is on netbanking login page
When User enters login username "Tom" and password "test1"
Then Login sucessful 
And Cards are displayed "true"

Scenario: Home page default login
Given User is on netbanking login page
When User enters login username "Peter" and password "test2"
Then Login sucessful 
And Cards are displayed "false"