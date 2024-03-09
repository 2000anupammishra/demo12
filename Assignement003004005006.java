package phaseEndproject;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;


import io.restassured.RestAssured;


public class Assignement003004005006 {
	
	
	//@Test
	public void assignment003()
	{
		
		String url = "https://petstore.swagger.io/v2/user/user123";
		RestAssured.given()
		.baseUri(url)
		.when().get()
		.then().statusCode(200)
		.log().all()
		.body("username", Matchers.equalTo("user123"))
		.body("email", Matchers.equalTo("user@gmail.com"))
		.body("userStatus",Matchers.equalTo(0));
		
	}
	
	
	
	//@Test
	public void assignment004()
	{
		
		String url = "https://petstore.swagger.io/v2/user/login";
		RestAssured.given()
		.baseUri(url)
		.auth().preemptive().basic("user123", "user@123")
		.when().get()
		.then().statusCode(200)
		.log().all()
		.body("message", Matchers.anything());
		
	}
	
	
	
	//@Test
	public void assignment005_available()
	{
		String url = "https://petstore.swagger.io/v2/pet/findByStatus";
		RestAssured.given()
		.baseUri(url)
		.queryParam("status", "available")
		.when().get()
		.then().statusCode(200)
		.log().all();
		
		
	}
	
	//@Test
	public void assignment005_pending()
	{
		String url = "https://petstore.swagger.io/v2/pet/findByStatus";
		RestAssured.given()
		.baseUri(url)
		.queryParam("status", "pending")
		.when().get()
		.then().statusCode(200)
		.log().all();
		
		
	}
	
	
	//@Test
	public void assignment005_sold()
	{
		String url = "https://petstore.swagger.io/v2/pet/findByStatus";
		RestAssured.given()
		.baseUri(url)
		.queryParam("status", "sold")
		.when().get()
		.then().statusCode(200)
		.log().all();
		
		
	}
    

	@Test
	public void assignment006()
	{
		String url = "https://petstore.swagger.io/v2/user/logout";
		RestAssured.given()
		.baseUri(url)
		.when().get()
		.then().statusCode(200)
		.log().all();
		
		
	}
	
}
