Feature: User registration
My trip application allows user to register on the portal so that they can book flight tickets online
for travel across India

Scenario: User registration
Given there is an online portal for registration
When a user registers on that portal
Then you can add him in the user database

Scenario: Economy flight, VIP passenger
Given there is an economy flight
When we have a VIP passenger
Then you can add him but cannot remove him from an economy flight

Scenario: Business flight, usual passenger
Given there is an business flight
When we have a usual passenger
Then you cannot add or remove him from a business flight

Scenario: Business flight, VIP passenger
Given there is an business flight
When we have a VIP passenger
Then you can add him but cannot remove him from a business flight