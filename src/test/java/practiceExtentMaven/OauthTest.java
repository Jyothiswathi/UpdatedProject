package practiceExtentMaven;

import static io.restassured.RestAssured.*;


public class OauthTest {

	public static void main(String[] args) {
		
String response=given().queryParam("access-token", "").when().get("https://rahulshettyacademy.com/getCourse.php").asString();

	}

}
