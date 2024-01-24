package RestAssuredPavan;

import org.testng.annotations.Test;

import com.aventstack.extentreports.gherkin.model.Given;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

public class ReqRes {
	String id = "";

//	@Test
//	public void listUsers()
//	{
//		//RestAssured.baseURI="https://reqres.in/";
//		given().
//		when().get("https://reqres.in/api/users?page=2").then().statusCode(200).log().all();
//	}
//	

	@Test
	public void createUser() {
		RestAssured.baseURI = "https://reqres.in/";
		String response = given()
				.body("{\r\n" + "    \"name\": \"morpheus\",\r\n" + "    \"job\": \"leader\"\r\n" + "}")
				.contentType("application/json").when().post("/api/users").then().statusCode(201).extract().response()
				.asString();
		JsonPath js1 = new JsonPath(response);
		System.out.println(response);
		id = js1.get("id");
		System.out.println(id);

	}

	@Test
	public void updateUser() {
		RestAssured.baseURI = "https://reqres.in/";
		given().body("{\r\n" + "    \"name\": \"morpheus\",\r\n" + "    \"job\": \"zion resident\"\r\n" + "}")
				.contentType("application/json").when().put("/api/users/" + id).then().statusCode(200);
	}

	@Test
	public void deleteUser()

	{
		RestAssured.baseURI = "https://reqres.in/";
		given().when().delete("/api/users/" + id).then().statusCode(204);
	}
}
