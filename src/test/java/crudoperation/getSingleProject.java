package crudoperation;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class getSingleProject {
	@Test
	public void get()
	{
		Response res = RestAssured.delete("http://localhost:8084/projects/TY_PROJ_1002");
		ValidatableResponse c = res.then();
		System.out.println(res.getStatusCode());
	
	}
}
