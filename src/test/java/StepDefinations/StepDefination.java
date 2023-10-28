package StepDefinations;

import static io.restassured.RestAssured.given;

import java.io.IOException;

import org.testng.Assert;

import LatestRestAssured.resourceEn;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.specification.RequestSpecification;
import resources.TestDataBuild;
import resources.Utils;

public class StepDefination extends Utils{
	
	RequestSpecification response;
	String postResponse;
	TestDataBuild TestDataBuild=new TestDataBuild();
	@Given("Add place payload with {string} {string}")
	public void add_place_payload(String name,String address) throws IOException {
				
	response=given().log().all().spec(requestSpecification()).body(TestDataBuild.addLibPayload(name,address));
	}
	
	@When("user calls {string}  API with {string} http request")
	public void postAPIRequest(String request,String httpMethod)
	{
	resourceEn resouceAPIobj = resourceEn.valueOf(request);
String resourceAPI = resouceAPIobj.getResource();
	
	System.out.println("q");
	if(httpMethod.equals("post"))
	{
	 postResponse = response.when().post(resourceAPI).then().log().all().assertThat().statusCode(200).extract().response().asString();
	}
	else if(httpMethod.equals("get"))
	{
		 postResponse = response.when().get(resourceAPI).then().log().all().assertThat().statusCode(200).extract().response().asString();
	
	}
	}
	
	@And("{string} in response code is {string}")
	public void validationAddAPI(String key,String value)
	{
System.out.println("1");	
JsonPath js=new JsonPath(postResponse);
Assert.assertEquals(js.getString(key), value);
	}
	


}
