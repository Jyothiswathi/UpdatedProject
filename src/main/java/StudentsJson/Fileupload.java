package StudentsJson;

import static io.restassured.RestAssured.given;

import java.io.File;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;



public class Fileupload {

	@Test
	public void fileUpload()

	{

		
		File myFile =new File("‪‪C:\\Users\\Jyo\\Desktop\\ai.txt");
	Response	res=given().multiPart("file",myFile).contentType("multipart/form-data").when().post("httpbin.org/post");
	//Assert.assertEquals(res.getStatusCode(), 200);
	
		
	}

}
