package StudentsJson;

import static io.restassured.RestAssured.given;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;

public class XmlParsing {

	@Test
	public void xmlParsing() {
		boolean isStatus = false;
		// approch1
//		given().when().get("http://restapi.adequateshop.com/api/Traveler?page=1").then().statusCode(200).
//		body("TravelerinformationResponse.page",equalTo("1")).body("TravelerinformationResponse.travelers.Travelerinformation[0].name", equalTo("Developer"));

		// approch2
		Response res = given().when().get("http://restapi.adequateshop.com/api/Traveler?page=1");
		Assert.assertEquals(res.getStatusCode(), 200);
		Assert.assertEquals(res.getHeader("Content-Type"), "application/xml; charset=utf-8");

		String pageNo = res.xmlPath().get("TravelerinformationResponse.page").toString();
		Assert.assertEquals(pageNo, "1");
		XmlPath XmlPath = new XmlPath(res.asString());
		Object a = XmlPath.get("TravelerinformationResponse.page");
		List<String> id = XmlPath.getList("TravelerinformationResponse.travelers.Travelerinformation.id");

		for (int i = 0; i < id.size(); i++) {
			System.out.println(XmlPath.get("TravelerinformationResponse.travelers.Travelerinformation[" + i + "].id"));

			for (String x : id) {
				if (x.equals("11133")) {
					isStatus = true;
					break;
				}
			}
			Assert.assertEquals(isStatus, true);

		}

	}
}
