package LatestRestAssured;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;

import io.restassured.RestAssured;
import pojo.Addlib;
import pojo.Location;


public class SerelizeTest {

	public static void main(String[] args) {
		Addlib Addlib=	new Addlib();
		Location Location=new Location();
		Location.setLat(-38.383494);
		Location.setLng(33.427362);
		Addlib.setLocation(Location);
		Addlib.setAccuracy(50);
		Addlib.setName("Frontline house");
		Addlib.setPhone_number("(+91) 983 893 3937");
		Addlib.setAddress("29, side layout, cohen 09");
		ArrayList<String> al=new ArrayList();
		al.add("shoe park");
		al.add("shop");
		Addlib.setTypes(al);
		Addlib.setWebsite("http://google.com");
		Addlib.setLanguage("French-IN");
		
	
		
		
		
		RestAssured.baseURI= "https://rahulshettyacademy.com";
		String response=given().log().all().queryParam("key", "qaclick123").body(Addlib)
		.when().post("/maps/api/place/add/json").then().log().all().assertThat().statusCode(200).extract().response().asString();
	}

}
