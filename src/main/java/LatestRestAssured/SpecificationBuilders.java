package LatestRestAssured;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import pojo.Addlib;
import pojo.Location;

public class SpecificationBuilders {
	
public static void main(String[] args)	

{

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
	
	//request and response specification
RequestSpecification req = new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com").setContentType(ContentType.JSON).addQueryParam("key", "qaclick123").build();
ResponseSpecification res = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
	

	
	
	
	RestAssured.baseURI= "https://rahulshettyacademy.com";
	RequestSpecification response=given().spec(req).body(Addlib);
	Response otherPart = response.when().post("/maps/api/place/add/json").then().spec(res).extract().response();
String otherPartPrint = otherPart.asString();
System.out.println(otherPartPrint);

}

}
