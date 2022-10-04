package validation;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.port;
import static io.restassured.RestAssured.when;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class DynamicValidation {
	@Test
	public void getProjects()
	{
		baseURI="http://localhost";
		port=8084;
		String expetedId="TY_PROJ_1613";
		Response res = when().get("/projects");
		List<String> actual=res.jsonPath().get("projectId");
		boolean flag=false;
		for (String st : actual) {
			if(st.equals(expetedId))
			{
				flag=true;
			}
			
		}
		
		Assert.assertTrue(flag);
	}


}
