package phaseEndproject;

import java.io.File;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
public class Assignment002 {
	
	
	@Test
	public void post_status_available()
	{
		File file = new File("resources/data1.json");
		
		int id = RestAssured.given()
				.baseUri("https://petstore.swagger.io/v2/pet")
				.contentType(ContentType.JSON)
				.body(file)
				.when().post()
				.then().statusCode(200)
				.body("name", Matchers.equalTo("doggie")).extract().path("id");
				
		System.out.println(id);
	}
	
	@Test(priority='2')
	public void put_status_available_Dev()
	{
		File file = new File("resources/data-dev.json");
		
		int id = RestAssured.given()
				.baseUri("https://petstore.swagger.io/v2/pet")
				.contentType(ContentType.JSON)
				.body(file)
				.when().put()
				.then().statusCode(200)
				.body("status", Matchers.equalTo("available_DEV")).extract().path("id");
				
		System.out.println(id);
	}
	
	@Test(priority='3')
	public void put_status_available_QA()
	{
		File file = new File("resources/data-qa.json");
		
		int id = RestAssured.given()
				.baseUri("https://petstore.swagger.io/v2/pet")
				.contentType(ContentType.JSON)
				.body(file)
				.when().put()
				.then().statusCode(200)
				.body("status", Matchers.equalTo("available_QA")).extract().path("id");
				
		System.out.println(id);
	}
	
	@Test(priority='4')
	public void put_status_available_Prod()
	{
		File file = new File("resources/data-prod.json");
		
		int id = RestAssured.given()
				.baseUri("https://petstore.swagger.io/v2/pet")
				.contentType(ContentType.JSON)
				.body(file)
				.when().put()
				.then().statusCode(200)
				.body("status", Matchers.equalTo("available_PROD")).extract().path("id");
				
		System.out.println(id);
	}
}	
	
	
	
