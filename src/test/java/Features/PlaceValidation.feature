Feature: validating place API's
Scenario Outline: verify if place is being added by using addPlace API
Given Add place payload with "<Name>" "<Address>"
When user calls "AddPlaceAPI"  API with "post" http request
And "status" in response code is "OK"
Examples:
|Name|Address|
|joy|sasanam|
|jyo|chennai|

