package RestAssuredPavan;

import java.util.HashMap;

import org.testng.annotations.Test;

public class DiffWaysToCreatePostRequestBody {
	
	
@Test
public void testPostRequestUsingHashMap()

{
	HashMap data= new HashMap();
	
data.put("id", 1);
data.put("name", "jhon");
data.put("location", "india");
data.put("phone", "1234567890");

String courses[]= {"java","selenium"};
data.put("courses",courses);

	

}
}
