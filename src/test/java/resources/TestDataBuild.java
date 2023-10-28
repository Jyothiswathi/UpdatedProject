package resources;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import pojo.Addlib;
import pojo.Location;

public class TestDataBuild {
	
	
	public Addlib addLibPayload( String Name,String address)
	{
		Addlib Addlib=	new Addlib();
		Location Location=new Location();
		Location.setLat(-38.383494);
		Location.setLng(33.427362);
		Addlib.setLocation(Location);
		Addlib.setAccuracy(50);
		Addlib.setName(Name);
		Addlib.setPhone_number("(+91) 983 893 3937");
		Addlib.setAddress(address);
		ArrayList<String> al=new ArrayList();
		al.add("shoe park");
		al.add("shop");
		Addlib.setTypes(al);
		Addlib.setWebsite("http://google.com");
		Addlib.setLanguage("French-IN");
		
		 return Addlib;
	
	}
	


}
