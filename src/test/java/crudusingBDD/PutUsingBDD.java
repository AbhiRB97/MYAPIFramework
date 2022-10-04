package crudusingBDD;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;

import io.restassured.http.ContentType;

public class PutUsingBDD {
	public static void main(String[] args) {
		JSONObject j=new JSONObject();
		 j.put("createdBy","ABHU");
		 j.put("projectName","Updated");
		 j.put( "status","Created");
		 j.put("teamSize", 1) ;
		 baseURI="http://localhost";
		 port=8084;
		
		 System.out.println(j);
		 int x = given().body(j).contentType(ContentType.JSON)
		.put("/projects/TY_PROJ_1206").getStatusCode();
		 System.out.println(x);
	}

}
