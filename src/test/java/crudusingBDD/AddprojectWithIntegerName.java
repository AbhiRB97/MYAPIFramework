package crudusingBDD;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import org.json.simple.JSONObject;

import io.restassured.http.ContentType;

public class AddprojectWithIntegerName {
public static void main(String[] args) {
		
		JSONObject j=new JSONObject();
		j.put("createdBy", 1234256565);
		j.put("projectName", 123623);
		j.put("status", 111);
		j.put("teamSize", 5);
		
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
