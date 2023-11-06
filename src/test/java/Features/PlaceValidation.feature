Feature: validating place API's
@addplace
Scenario Outline: verify if place is being added by using addPlace API
Given Add place payload with "<Name>" "<Address>"
When user calls "AddPlaceAPI"  API with "post" http request
And "status" in response code is "OK"
And verify the place_id created maps to "<Name>" using "GetPlaceAPI"

Examples:
|Name|Address|
|joy|sasanam|
|jyo|chennai|

@deletePlace
Scenario: verify if delete place is working fine or not
Given delete place payload
When user calls "deletePlaceAPI"  API with "post" http request
And "status" in response code is "OK"






