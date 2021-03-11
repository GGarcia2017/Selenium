Feature: Portal Login

Background:
Given Validate the browser
When Browser is triggered
Then Check if browser is displayed

Scenario: Home page default login
Given User is on NetBanking landing page
When User login into application with "Jin" and password "1234"
Then Home page is populated
And Cards displayed are "true"

Scenario: Home page default login
Given User is on NetBanking landing page
When User login into application with "GG" and password "123"
Then Home page is populated
And Cards displayed are "false"

@PortalTest
Scenario: Home page default login
Given User is on NetBanking landing page
When User login into application with "FF" and password "321"
Then Home page is populated
And Cards displayed are "True"

Scenario: Home page default login
Given User is on NetBanking landing page
When User sign up with following details
| jenny | Road | JR@gmail.com | Canada | 3214514 |
Then Home page is populated
And Cards displayed are "false"

Scenario Outline: Home page default login
Given User is on NetBanking landing page
When User login in to application with <Username> and password <password>
Then Home page is populated
And Cards displayed are "true"

Examples:
|Username |password|
|user1    |pass1   |
|user2    |pass2   |
|user3    |pass3   |
|user4    |pass4   |