package datadriventesting;

import static org.testng.Assert.assertEquals;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.gson.JsonObject;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
public class TC003_GET_validationJSONParsing {
		 
	    @Test
	    public void testJsonParsing() {
	    	RestAssured.baseURI="http://demo4032024.mockable.io/apitest";
	    	//Request object
			RequestSpecification httpRequest=RestAssured.given();
			
			//Response object
			Response response=httpRequest.request(Method.GET,"");
	            
	     
	            System.out.println("Response :" + response.asString());
	            System.out.println("Status Code :" + response.getStatusCode());
	     
	     JSONObject obj_jsonobject = new JSONObject()response;
	            JsonPath jsonPathEvaluator = response.jsonPath();
	            
	            // Then simply query the JsonPath object to get a String value of the node
	            
	            int status = jsonPathEvaluator.get("status");
	            System.out.println("Status received from Response= " + status);
	            
				
	            JSONArray obj_jsonArray = obj_jsonobject.getJSONArray("employeeData");
	            JSONObject obj_jsonobject1 = obj_jsonArray.getJSONObject(0);
	            System.out.println("Age="obj_jsonobject1.getString("age"));
	            System.out.println("Dob="obj_jsonobject1.getString("dob"));
	            System.out.println("Role="obj_jsonobject1.getString("role"));
	            
	                        
	            String Message = jsonPathEvaluator.get("message");
	            System.out.println("Message received from Response =" + Message); 
	            
	    }
	 
}
