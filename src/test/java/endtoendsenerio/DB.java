package endtoendsenerio;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.mysql.jdbc.Driver;

import geneicpojoclasses.AddProject;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class DB {
	public static void main(String[] args) {
//		Driver d=new Driver();
//		DriverManager.registerDriver(d);
//		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/projects","root","root");
//		
//		Statement stmt = conn.createStatement();
//		String query="Select * from project where project_id='TY_PROJ_1417';";
//		ResultSet v = stmt.executeQuery(query);
//		System.out.println(v);
//		
//		while(v.next())
//		{
//			System.out.println(v.getString(1));
//			
//		}
//		
		AddProject add=new AddProject("Abhi", "Scrikpt11", "Created", 4);
		given()
		.contentType(ContentType.JSON)
				.body(add);
				
		Response res = when().post("http://localhost:8084/addProject");
		ValidatableResponse b = res.then();
		String id=	b.extract().path("projectId");
		System.out.println(id);
	}

}
