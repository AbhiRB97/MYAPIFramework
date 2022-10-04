package validation;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class StaticvlidationForGet {
	@Test
	public void getProjects()
	{
		baseURI="http://localhost";
		port=8084;
		String expetedId="TY_PROJ_1613";
		Response res = when().get("/projects");
		String actual=res.jsonPath().get("[17].projectId");
		Assert.assertEquals(actual, expetedId);
	}

}
