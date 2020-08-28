package datadriventesting;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC004_GET_ValidateResponcedata {
@Test
public void Employdeatils()
{
	
	//Specify base URI
			RestAssured.baseURI="http://demo4032024.mockable.io/apitest";
			
			//Request object
			RequestSpecification httpRequest=RestAssured.given();
			
			//Response object
			Response response=httpRequest.request(Method.GET,"");
			
			//print response in console window
			String responseBody=response.getBody().asString();
			System.out.println("Response Body is:" +responseBody);
			
				
			Assert.assertEquals(responseBody.contains("ABC Infotech"), true /*Actual Value*/, "Response body contains IG Infotech");
		
}	
}
