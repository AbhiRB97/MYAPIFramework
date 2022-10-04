package crudusingBDD;

import org.testng.annotations.Test;

import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.List;

public class GetSingleProject {
	@Test
	public void gett()
	{
		
		baseURI="http://localhost";
		port=8084;
		
		
		Response res = get("/projects/TY_PROJ_605");
		Headers head = res.getHeaders();
		List<Header> l = head.getList("Vary");
		for (Header header : l) {
			System.out.println(header);
			
		}
		
		
	}

}
