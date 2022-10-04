package endtoendsenerio;

import crudusingpojo.AddProject;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class ABC {
	public static void main(String[] args) {
		AddProject a=new AddProject("sdfa","sdafa5d", "Created", 3);
		//String id=given().body(a).contentType(ContentType.JSON)
		//.when().post("http://localhost:8084/addProject").then().extract().path("projectId");
				
		 Response r = given().body(a).contentType(ContentType.JSON)
				.when().post("http://localhost:8084/addProject");
		 String v = r.getBody().path("projectId");
		System.out.println(v);
	
	}
}
