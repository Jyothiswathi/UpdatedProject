package StudentsJson;

import static io.restassured.RestAssured.given;

import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.jayway.restassured.path.json.JsonPath;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class ParsingJsonResponseData {

	@Test(priority = 1)
	public void testJsonResponse() {
		boolean isStatus = false;
		// approch1
//		given().contentType(ContentType.JSON).pathParam("book", "book").when().get("http://localhost:3000/{book}")
//				.then().statusCode(200).header("Content-Type", "application/json; charset=utf-8").log().body()
//				.body("[3].title", equalTo("this is pavani book"));

		// approch2
		String res = given().contentType(ContentType.JSON).pathParam("book", "book").when()
				.get("http://localhost:3000/{book}").then().extract().response().asString();
		JsonPath js = new JsonPath(res);
		List<Object> titleLength = js.getList("title");
		for (int i = 0; i < titleLength.size(); i++) {
			if (titleLength.get(i).equals("this is swathi book")) {
				isStatus = true;
				break;
			}
		}
		Assert.assertTrue(isStatus);
		// Assert.assertEquals(res.getStatusCode(), 200);
		// Assert.assertEquals(res.header("Content-Type"), "application/json;
		// charset=utf-8");
		// String bookName = res.jsonPath().get("[3].title").toString();
		// JsonPath js=new JsonPath("abc");

		// Assert.assertEquals(bookName, "this is pavani book");

	}

	@Test
	public void testJsonResponseBodyData() {
		boolean status = false;
		String res = given().contentType(ContentType.JSON).pathParam("book", "book").when()
				.get("http://localhost:3000/{book}").then().extract().response().asString();
		System.out.println(res);
		JSONArray JSONArray = new JSONArray(res);
		for (int i = 0; i < JSONArray.length(); i++) {
			String title = JSONArray.getJSONObject(i).get("title").toString();
			// System.out.println(title);
			if (title.equals("this is swathi book")) {
				status = true;
				break;
			}
		}
		Assert.assertEquals(status, true);
	}

}
