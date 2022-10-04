package crudoperation;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class AddProject {
	@Test
	public void add()
	{
		JSONObject j=new JSONObject();
		j.put("createdBy", "abi");
		j.put("projectName", "	gh2jmhvvhgh");
		j.put("status", "Created");
		j.put("teamSize", 4);
		RequestSpecification rest = RestAssured.given();
		rest.body(j);
		rest.contentType(ContentType.JSON);
		Response response = rest.post("http://localhost:8084/addProject");
		ValidatableResponse val = response.then();
		val.log().all();
		int s = response.getStatusCode();
		System.out.println(s);
		val.assertThat().statusCode(201);
		
	}

}
