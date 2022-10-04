package crudusingBDD;

import org.json.simple.JSONObject;
	
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class AddProjectUsingBDD {
	public static void main(String[] args) {
		
		JSONObject j=new JSONObject();
		j.put("createdBy", "abi");
		j.put("projectName", "dbfjkdkddgcxbnhnvdfxfvfhgh");
		j.put("status", "Created");
		j.put("teamSize", 4);
		
		baseURI="http://localhost";
		port=8084;
		
		given()
		       .body(j)
		       .contentType(ContentType.JSON)
		.when()
				.post("/addProject") 
		.then()
				.assertThat()
				.statusCode(201)
				.log().all();
			
	}

}
