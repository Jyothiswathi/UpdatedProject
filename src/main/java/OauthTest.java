import static io.restassured.RestAssured.given;

public class OauthTest {

	public static void main(String[] args) {
		
String response=given().queryParam("access-token", "").when().get("https://rahulshettyacademy.com/getCourse.php").asString();

	}

}
