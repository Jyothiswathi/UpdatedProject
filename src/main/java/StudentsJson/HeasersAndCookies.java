package StudentsJson;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;

import static io.restassured.RestAssured.*;

import java.util.Map;
import java.util.Set;

import io.restassured.response.Response;

public class HeasersAndCookies {

//	@Test
//	public void cookies() {
//
//		RestAssured.baseURI = "https://www.google.co.in/webhp";
//
//		Response res = given().pathParam("path", "webhp").when().get("https://www.google.co.in/{path}");
//
//		System.out.println(res.getCookie("AEC"));
//		Map<String, String> allCookies = res.getCookies();
//		Set<String> allCookieskeys = allCookies.keySet();
//		for (String x : allCookieskeys) {
//			System.out.println(x + " " + res.getCookie(x));
//		}
//	}
//	
	@Test
	public void headers()
	{
		RestAssured.baseURI = "https://www.google.co.in/webhp";

		Response res = given().pathParam("path", "webhp").when().get("https://www.google.co.in/{path}");
		String singleHeader = res.getHeader("P3P");
		//System.out.println(singleHeader);
	Headers allHeaders = res.getHeaders();
	System.out.println(allHeaders);
	for(Header x:allHeaders)
	{
		System.out.println(res.getHeader(x.getName()+" "+x.getValue()));
	}

		
	}

}
