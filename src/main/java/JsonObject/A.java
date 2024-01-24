package JsonObject;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;


public class A {
	@Test
	public void a()
	{
String res = given().contentType(ContentType.JSON).when().get("http://localhost:3000/data").asString();
System.out.println(res);
JSONArray js=new JSONArray(res);
//for(int i=0;i<js.length();i++)
//{
//	System.out.println(js.getJSONObject(i).get("branch"));
//}

System.out.println(js.getJSONObject(1).getJSONObject("abc").getJSONArray("cd").getJSONObject(UNDEFINED_PORT));

	
	}

}
