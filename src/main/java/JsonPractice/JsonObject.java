package JsonPractice;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;

import com.jayway.restassured.path.json.JsonPath;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.List;



public class JsonObject {
	
//	@Test
//	public void test1()
//	{
//		String res = given().contentType(ContentType.JSON).when().get("http://localhost:3000/eachName1").asString();
//		//JSONObject js=new JSONObject(res);
//		JSONArray ja=new JSONArray(res);
////		JsonPath js=new JsonPath(res);
////		System.out.println(js.get("branches.eachName[0]"));
////		for(int i=0;i<js.getJSONObject("branches").getJSONArray("eachName").length();i++)
////		{
////			System.out.println(js.getJSONObject("branches").getJSONArray("eachName").get(i));
////		}
////		for(int i=0;i<js.getJSONArray("eachName").length();i++)
////		{
////			System.out.println(js.getJSONArray("eachName").getJSONObject(i).getJSONArray("marks").get(i));
////		}
//		
////		for(int i=0;i<js.getJSONArray("eachName").length();i++)
////		{
////			for(int j=0;j<js.getJSONArray("eachName").getJSONObject(i).getJSONArray("marks").length();j++)
////			System.out.println(js.getJSONArray("eachName").getJSONObject(i).getJSONArray("marks").get(j));
////		}
//		
////		for(int i=0;i<js.getJSONArray("eachName").length();i++)
////		{
////			System.out.println(js.getJSONArray("eachName").getJSONObject(i).get("name"));
////		}
//		
////
////for(int i=0;i<ja.length();i++)	
////{
////	for(int j=0;j<ja.getJSONObject(i).getJSONArray("marks").length();j++)
////	{
////	System.out.println(ja.getJSONObject(i).getJSONArray("marks").get(j));
////	}
////}
//
//
//
//	}s
//	
	
	@Test
	public void test2()
	{
		String res = given().contentType(ContentType.JSON).when().get("http://localhost:3000/data").asString();
		JSONArray js=new JSONArray(res);	
		System.out.println(js.length());
//		for(int i=0;i<js.getJSONObject(0).getJSONArray("marks").length();i++)
//		{	
//			System.out.println(js.getJSONObject(i).getJSONArray("marks"));
//				}
		
		
//		for(int i=0;i<js.length();i++)
//	{
//	System.out.println(js.getJSONObject(i).get("branch"));		
//		}
		
		//x[1].abc.cd[0].course
		//System.out.println(js.getJSONObject(1).getJSONObject("abc").getJSONArray("cd").getJSONObject(0).get("course"));
		//x[1].abc.cd[1].course1
		
		System.out.println(js.getJSONObject(1).getJSONObject("abc").getJSONArray("cd").getJSONObject(1).get("course1"));
	}
	
	
	
	
	

}
