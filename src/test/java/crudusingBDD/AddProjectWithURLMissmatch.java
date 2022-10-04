package crudusingBDD;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import org.json.simple.JSONObject;

import io.restassured.http.ContentType;

public class AddProjectWithURLMissmatch {
public static void main(String[] args) {
		
		JSONObject j=new JSONObject();
		j.put("createdBy", "abi");
		j.put("projectName", "dbfjkkddgcxvdfxfvfhgh");
		j.put("status", "Created");
		j.put("teamSize", 4);
		
		baseURI="http://localhost";
		
		
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
