package StudentsJson;

import static io.restassured.RestAssured.given;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.jayway.restassured.path.json.JsonPath;

import io.restassured.RestAssured;
//import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;


public class studendPage {
	
	@Test
	public void student()
	{
		boolean status=false;
		RestAssured.baseURI="http://localhost:3000/students";
	String res = given().pathParam("path", "students").when().get("http://localhost:3000/{path}").then().extract().response().asString();
	com.jayway.restassured.path.json.JsonPath j=new JsonPath(res);
	List<Object> id = j.getList("location");
	for(int i=0;i<id.size();i++)
		
	{
		if(id.get(i).equals("us"))
		{
			status=true;
			break;
		}
	}
	Assert.assertTrue(status);
	}

}
