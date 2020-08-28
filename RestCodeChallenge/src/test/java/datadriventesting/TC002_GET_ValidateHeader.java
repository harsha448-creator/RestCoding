package datadriventesting;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC002_GET_ValidateHeader {

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
		System.out.println("Response Body is:" +responseBody);
		
		String contentType = response.header("Content-Type");
		 System.out.println("Content-Type value: " + contentType);
		 
		 // Reader header of a give name. In this line we will get
		 // Header named Server
		 String serverType =  response.header("Server");
		 System.out.println("Server value: " + serverType);
		 
		 // Reader header of a give name. In this line we will get
		 // Header named Content-Encoding
		 String acceptLanguage = response.header("Content-Encoding");
		 System.out.println("Content-Encoding: " + acceptLanguage);
		
		
	}
}
