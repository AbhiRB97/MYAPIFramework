package crudusingdataprovider;



import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

 import Generics.ExcelUtility;
import geneicpojoclasses.AddProject;
import io.restassured.http.ContentType;

import static  io.restassured.RestAssured.*;


public class AddProjectUsingDataProvider {
	
	
	@Test(dataProvider = "testData")
	public void addProjectTest(String a, String b, String c, int d )
	{
		AddProject ad = new AddProject(a, b, c, d);
		given()
				.body(ad)
				.contentType(ContentType.JSON)
		.when().post("http://localhost:8084/addProject")
		.then().assertThat().log().all();
		
	}
	
	
	
	@DataProvider
	public Object[][] testData() throws Throwable
	{
		ExcelUtility elib=new ExcelUtility();
		
		Object [][] obj= new Object [3][4];
		obj[0][0]=elib.getExcelData("Sheet1", 0, 0);
		obj[0][1]=elib.getExcelData("Sheet1", 0, 1);
		obj[0][2]=elib.getExcelData("Sheet1", 0, 2);
		obj[0][3]=elib.getExcelNumericData("Sheet1", 0, 3);
		obj[1][0]=elib.getExcelData("Sheet1", 1, 0);
		obj[1][1]=elib.getExcelData("Sheet1", 1, 1);
		obj[1][2]=elib.getExcelData("Sheet1", 1, 2);
		obj[1][3]=elib.getExcelNumericData("Sheet1", 1, 3);
		obj[2][0]=elib.getExcelData("Sheet1", 2, 0);
		obj[2][1]=elib.getExcelData("Sheet1", 2, 1);
		obj[2][2]=elib.getExcelData("Sheet1", 2, 2);
		obj[2][3]=elib.getExcelNumericData("Sheet1", 2, 3);
		return obj;
	}

}
