package StepDefinations;

import static io.restassured.RestAssured.given;

import java.io.IOException;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.testng.Assert;

import LatestRestAssured.resourceEn;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.specification.RequestSpecification;
import resources.TestDataBuild;
import resources.Utils;

public class StepDefination extends Utils {

	RequestSpecification response;
	static String postResponse;
	static String placeId;
	TestDataBuild TestDataBuild = new TestDataBuild();

	@Given("Add place payload with {string} {string}")
	public void add_place_payload(String name, String address) throws IOException {

		response = given().log().all().spec(requestSpecification()).body(TestDataBuild.addLibPayload(name, address));
	}

	@When("user calls {string}  API with {string} http request")
	public void APIRequest(String request, String httpMethod) {
		resourceEn resouceAPIobj = resourceEn.valueOf(request);
		String resourceAPI = resouceAPIobj.getResource();

		//System.out.println("q");
		if (httpMethod.equals("post")) {
			postResponse = response.when().post(resourceAPI).then().log().all().assertThat().statusCode(200).extract()
					.response().asString();

//			JsonPath js = new JsonPath(postResponse);
// placeId = js.getString("place_id");

		} else if (httpMethod.equals("GET")) {
			postResponse = response.when().get(resourceAPI).then().log().all().assertThat().statusCode(200).extract()
					.response().asString();

		}
	}

	@And("{string} in response code is {string}")
	public void validationAddAPI(String key, String value) {
		System.out.println("1");
		JsonPath js = new JsonPath(postResponse);

		Assert.assertEquals(js.getString(key), value);
	}

	@When("verify the place_id created maps to {string} using {string}")
	public void verify_the_place_id_created_maps_to_using(String Name, String resource) {
		placeId = jSonPath(postResponse, "place_id");

		System.out.println(placeId);
		response = given().spec(Utils.requestAddLibBase).queryParam("place_id", placeId);
		APIRequest(resource, "GET");
		String actualName = jSonPath(postResponse, "name");
		Assert.assertEquals(actualName, Name);

	}

	@Given("delete place payload")
	public void delete_place_payload() {

		response = given().spec(Utils.requestAddLibBase).body(TestDataBuild.deletePlaceAPI(placeId));

	}

}
