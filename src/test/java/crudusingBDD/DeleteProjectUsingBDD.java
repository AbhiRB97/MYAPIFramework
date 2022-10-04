package crudusingBDD;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class DeleteProjectUsingBDD {
	@Test
	public void delet()
	{
		baseURI="http://localhost";
		port=8084;
		delete("/projects/TY_PROJ_1208")
		.then().assertThat().statusCode(204);
		
		delete("/projects/TY_PROJ_1209")
		.then().assertThat().statusCode(204);
	}

}
