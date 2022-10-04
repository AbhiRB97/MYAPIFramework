package validation;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.List;

public class Headervslidation {
	@Test
	public void head() {
		
		
		String eXFrame="DENY";
		String conn="keep-alive";
		String eContentType="application/json";
		Response r = when().get("http://localhost:8084/projects/TY_PROJ_1613");
		
		
		
	//Assert.assertEquals(h, e);
	r.then().log().all();
	
	boolean flag=false;
	
	if(eXFrame.equals(r.getHeader("X-Frame-Options"))
			&& conn.equals(r.getHeader("Connection"))
			&& eContentType.equals(r.getHeader("Content-Type")))
	{
		flag=true;
	}
	

	Assert.assertTrue(flag);
	
	

		
		
	}

}
