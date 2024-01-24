package StudentsJson;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;

import static io.restassured.RestAssured.*;




public class JsonSchemaValidation {

	@Test
	public void jsonScheme()
	{
		given().when().get("http://216.10.245.166/Library/Addbook.php").then().assertThat().body(JsonSchemaValidator.matchesJsonSchemaInClasspath("a.json"));
		
}

}
