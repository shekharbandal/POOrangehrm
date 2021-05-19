Feature: Application login
Scenario: User should be able to login successfully with Chrome browser
Given User navigates to "https://opensource-demo.orangehrmlive.com/" on  chrome browser 
When user enters "Admin" and "admin123"
And click on login button
Then validate user able to login successfully.