package crudoperation;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class getProject {
	@Test
	public void get()
	{
		Response res = RestAssured.get("http://localhost:8084/projects");
		ValidatableResponse c = res.then();
		//c.log().all();		
		res.prettyPrint();
		c.assertThat().statusCode(200);
	}
}