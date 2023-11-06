package resources;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Properties;

import cucumber.api.cli.Main;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.path.json.JsonPath;
import io.restassured.specification.RequestSpecification;

public class Utils {

	public static RequestSpecification requestAddLibBase;

	public RequestSpecification requestSpecification() throws IOException {
		if (requestAddLibBase == null) {
			PrintStream printStream = new PrintStream(new FileOutputStream("Loging.txt"));

			requestAddLibBase = new RequestSpecBuilder().setBaseUri(getGlobalValue()).addQueryParam("key", "qaclick123")
					.addFilter(RequestLoggingFilter.logRequestTo(printStream)).build();
			return requestAddLibBase;
		}
		return requestAddLibBase;
	}

	public static String getGlobalValue() throws IOException {

		Properties properties = new Properties();
		FileInputStream f = new FileInputStream("D:\\practiceExtentMaven\\src\\main\\resources\\global.properties");
		properties.load(f);
		return properties.getProperty("url");

	}
	
	
	public String jSonPath(String response,String key)
	{
		JsonPath js = new JsonPath(response);
		 return js.get(key).toString(); 

	}
}