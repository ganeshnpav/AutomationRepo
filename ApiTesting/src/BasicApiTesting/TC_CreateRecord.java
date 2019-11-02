package BasicApiTesting;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC_CreateRecord {
	
	@Test
	public void test1()
	{
		RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1/create";
		
		RequestSpecification request = RestAssured.given();
		JSONObject requestParams = new JSONObject();
		requestParams.put("name", "Ganesh Chahyal1");
		requestParams.put("salary", "40000");
		requestParams.put("age", "287");
		request.header("Content-Type", "application/json"); //for sending header
		// Add the Json to the body of the request
		request.body(requestParams.toJSONString()); 
		Response response = request.request(Method.POST);
		

		int statusCode = response.getStatusCode();
		System.out.println(statusCode);
		System.out.println(response.asString());
		
		JsonPath jsonPathEvaluator = response.jsonPath();
		String id = jsonPathEvaluator.get("id");

	}

}
