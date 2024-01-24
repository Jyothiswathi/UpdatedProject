package LatestRestAssured;
import static io.restassured.RestAssured.given;

public class OauthTest {

	public static void main(String[] args) {
		
String url ="https://rahulshettyacademy.com/getCourse.php?state=verifyfjdss&code=4%2FvAHBQUZU6o4WJ719NrGBzSELBFVBI9XbxvOtYpmYpeV47bFVExkaxWaF_XR14PHtTZf7ILSEeamywJKwo_BYs9M&scope=email+https%3A%2F%2Fwww.googleapis.com%2Fauth%2Fuserinfo.email+openid&authuser=0&session_state=0c32992f0d47e93d273922018ade42d1072b9d1f..a35c&prompt=none#";

String partialCode=url.split("&code=")[1];
String code=partialCode.split("&scope=")[0];
System.out.println(code);
		
		
String accessTokenResponse	=	given().urlEncodingEnabled(false)
		.queryParams("code",code)
		.queryParams("clint_id","692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com")
		.queryParams("client_secret","erZOWM9g3UtwNRj340YYaK_W")
		.queryParams("redirect_url","https://rahulshettyacademy.com/getCourse.php")
		.queryParams("grant_type","authorization_code")
		.when().log().all().post("https://www.googleapis.com/oauth2/v4/token").asString();
com.jayway.restassured.path.json.JsonPath js=new com.jayway.restassured.path.json.JsonPath(accessTokenResponse);
String accessToken=js.getString("access_token");



		
String response=given().queryParam("access_token", accessToken).when().log().all().get("https://rahulshettyacademy.com/getCourse.php").asString();
System.out.println(response);

	}

}
