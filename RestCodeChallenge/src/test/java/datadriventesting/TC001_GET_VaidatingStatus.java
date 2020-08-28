package datadriventesting;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC001_GET_VaidatingStatus {

	@Test
public void Employdetailes() {
		//Specify base URI
		RestAssured.baseURI="http://demo4032024.mockable.io/apitest";
		
		//Request object
		RequestSpecification httpRequest=RestAssured.given();
		
		//Response object
		Response response=httpRequest.request(Method.GET," ");
		
		//print response in console window
		String responseBody=response.getBody().asString();
		int statusCode = response.getStatusCode();
		System.out.println(statusCode);
		 
		 // Assert that correct status code is returned.
		 Assert.assertEquals(statusCode, 200 , "Correct status code returned");
	
	
	
	}
	
}
