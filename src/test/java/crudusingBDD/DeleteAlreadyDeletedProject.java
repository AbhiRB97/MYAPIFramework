package crudusingBDD;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.delete;
import static io.restassured.RestAssured.port;

import org.testng.annotations.Test;

public class DeleteAlreadyDeletedProject {
	@Test
	public void delet()
	{
		baseURI="http://localhost";
		port=8084;
		delete("/projects/TY_PROJ_1208")
	//	.then().assertThat().statusCode(204);
		.then().assertThat().log().all();
		
		delete("/projects/TY_PROJ_1209")
		//.then().assertThat().statusCode(204);
		.then().assertThat().log().all();
	}

}
