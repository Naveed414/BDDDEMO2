Feature: JBK offline application


Scenario Outline: logintest

Given User should be on login page
When User enters "<userName>" and "<pass>"
Then User will be on Home Page

Examples:
|userName|pass|
|kiran@gmail.com |123456 |


