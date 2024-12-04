Feature: Login 
Scenario: Login Functionality
Given user navigates to the Url
When user Enter The Username
When user Enter The Password
Then login must be successful

Scenario: Select Hotel Functionality
Given user navigates to the Select Hotel Url
When User Selects The Location
When User Selects The Hotel
When User Selects The Room Type
When User Selects The No Of Room
When User Selects The No Of Room
When User Enters The Check In Date
When User Enters The Check Out Date
When User Selects How Many Adults Present
When User Selects How Many Childern Present
Then Seach For Hotels

Scenario: Navigate To Select Hotel
Given user navigates to the Url To Confirm The Hotel
When User Clicks The Hotel 
Then User Clicks Continue Button


Scenario: Book Hotel Functioality
Given User navigates to the Book The Hotel
When User Types The First Name
When User Types The Last Name
When User Types The Billing Address
When User Types The Credit Card Number
When User Selects The Credit Card Type
When User Selects The Expiry Month
When User Selects The Expiry Year
When User Types The Ccv Number
Then User Confirms The Booking