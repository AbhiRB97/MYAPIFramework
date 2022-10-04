package crudusingBDD;

import static  io.restassured.RestAssured.*;

public class GetWithoutURL {
	public static void main(String[] args) {
		
		baseURI="http://localhost"; 
		//port=8084;
		get("/projects").then().log().all();
	}

}
