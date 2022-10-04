package crudusingpojo;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class AddProjectWithFile {
	@Test
	public void projrvttest() throws JsonGenerationException, JsonMappingException, IOException {
		AddProject s=new AddProject("BBB", "v554b5jk1265525f","Created", 4);
		ObjectMapper o=new ObjectMapper();
		RequestSpecification rest = RestAssured.given();
		rest.contentType(ContentType.JSON);
		rest.body(s);
		Response re = rest.post("http://localhost:8084/addProject");

		ValidatableResponse vva = re.then();
		String id = vva.extract().path("projectId");
		System.out.println(id);

	
	
	}

}
