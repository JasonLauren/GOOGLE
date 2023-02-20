Feature: login scenario

Scenario Outline: login
Given open chrome
When user enters in loginpage
Then enters "<uname>" and "<pwd>"
Then User click on conatacts tab
Then select new contact button
Then enters user details
|fname  |lname |  email|
|krishna6|Madasu6|madasurishna22@gmail.com6| 

Then logout FreeCRM
Examples:
|		uname      		|		pwd		|
|madasurishna22@gmail.com|Jason/2079|

#Scenario: Inavlid login
#Given opens chrome and enter the link
#When entres crdntls
#Then quit driver