package EcommerceRestAssured;

import static io.restassured.RestAssured.given;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.specification.RequestSpecification;
import pojo.EcommerceLoginResponsePojo;
import pojo.OrderDetails;
import pojo.Orders;
import pojo.ecommerceLoginRequestPojo;

public class LoginRequest {

	public static void main(String[] args) {
		System.out.println("a");

		RequestSpecification req = new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com")
				.setContentType(ContentType.JSON).build();
		System.out.println(req);
		ecommerceLoginRequestPojo ecommerceLoginRequestPojo = new ecommerceLoginRequestPojo();
		ecommerceLoginRequestPojo.setUserEmail("jyothisahu507@gmail.com");
		ecommerceLoginRequestPojo.setUserPassword("Jyothi@123");
		RequestSpecification loginRequest = given().relaxedHTTPSValidation().log().all().spec(req).body(ecommerceLoginRequestPojo);
		EcommerceLoginResponsePojo s = loginRequest.when().post("/api/ecom/auth/login").then().log().all().assertThat()
				.extract().response().as(EcommerceLoginResponsePojo.class);
		String token = s.getToken();
		String userId = s.getUserId();
		System.out.println(s.getToken());
		System.out.println(s.getUserId());

		// add product
		RequestSpecification addProductBaseReq = new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com")
				.addHeader("Authorization", token).build();
		RequestSpecification AddProduct = given().log().all().spec(addProductBaseReq).param("productName", "qwerty")
				.param("productAddedBy", userId).param("productCategory", "fashion")
				.param("productSubCategory", "shirts").param("productPrice", "11500")
				.param("productDescription", "Addias Originals").param("productFor", "women")
				.multiPart("productImage", new File("D://practiceExtentMaven//src//main//java//Images//pan.jpg"));
		String responseOfAddProduct = AddProduct.when().post("/api/ecom/product/add-product").then().log().all().assertThat()
				.extract().response().asString();
		System.out.println(responseOfAddProduct);

	JsonPath js=new JsonPath(responseOfAddProduct);
	String productId=js.get("productId");
	System.out.println(productId);
	
	
	//create order
	
	RequestSpecification createOrderBaseReq = new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com").setContentType(ContentType.JSON).addHeader("Authorization", token).build();
	OrderDetails OrderDetails=new OrderDetails();
	OrderDetails.setCountry("india");
	OrderDetails.setProductOrderedId(productId);
	List<OrderDetails> orderdetailsList=new  ArrayList();
	orderdetailsList.add(OrderDetails);
	
	Orders  Orders=new Orders();
	Orders.setOrders(orderdetailsList);
	
	RequestSpecification createOrder = given().log().all().spec(createOrderBaseReq).body(Orders);
	
	String CreateOrderResponse = createOrder.when().post("/api/ecom/order/create-order").then().log().all().assertThat().extract().response().asString();

	System.out.println(CreateOrderResponse);
//delete orderr
	RequestSpecification deleteOrderBaseReq = new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com")
			.setContentType(ContentType.JSON).addHeader("Authorization", token).build();
	RequestSpecification deleteProduct = given().log().all().spec(deleteOrderBaseReq).pathParam("productID", productId);
	String DeleteResponse = deleteProduct.when().delete("/api/ecom/product/delete-product/{productID}").then().log()
			.all().assertThat().extract().response().asString();
	System.out.println(DeleteResponse);
	}

}
