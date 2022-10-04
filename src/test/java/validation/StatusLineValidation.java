package validation;

import static io.restassured.RestAssured.when;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StatusLineValidation {
	@Test
	public void getstatus()

	{
		String expStatusLine = "HTTP/1.1 200 ";
		String sline = when()
				.get("http://localhost:8084/projects").getStatusLine();
		System.out.println(sline);
		
		Assert.assertEquals(expStatusLine, sline);
	}

}
