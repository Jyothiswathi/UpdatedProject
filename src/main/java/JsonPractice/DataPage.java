package JsonPractice;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import io.restassured.RestAssured;


public class DataPage {
      @Test
		public void getDummy()
		{
		DummyPojo DummyPojo=new DummyPojo();
		Data Data= new Data();
		Data.setId("id");
		Data.setEmployee_name("employee_name");
		Data.setEmployee_salary("employee_salary");
		Data.setEmployee_age("employee_age");
		Data.setProfile_image("profile_image");
		
		List<Data> a=new ArrayList();
		a.add(Data);
		
    	  	  
		RestAssured.baseURI="https://dummy.restapiexample.com/api/v1/employees";
		 DummyPojo=	RestAssured.given().when().get().as(DummyPojo.class);
		System.out.println(DummyPojo);
		System.out.println(DummyPojo.getStatus());
		System.out.println(DummyPojo.getData().size());
		//for(int i=0;i<DummyPojo.getData().size();i++)
			
		
		System.out.println(DummyPojo.getData().get(1).getEmployee_age());	
		

		}

}
