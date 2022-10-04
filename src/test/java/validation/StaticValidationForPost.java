package validation;

import org.testng.annotations.Test;

import geneicpojoclasses.AddProject;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class StaticValidationForPost {
	@Test
	public void add() {
		baseURI="http://localhost";
		port=8084;
		AddProject a=new AddProject("abho", "fdgfhbjst", "created", 5);
		Response resp = given()
				.contentType(ContentType.JSON)
				.body(a)
		.when().post("/addProject");
		
		
		
		String id=resp.jsonPath().get("projectId");
		System.out.println(id);
		//resp.then().log().all();
		
	}

}
