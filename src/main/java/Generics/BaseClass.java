package Generics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.codehaus.jackson.map.ObjectMapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;


import com.mysql.jdbc.Driver;

import geneicpojoclasses.AddProject;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class BaseClass {
	public WebDriver driver;
	@BeforeSuite
	public void connect() throws SQLException
	{
		Driver d=new Driver();
		DriverManager.registerDriver(d);
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
		
	}
	
	@BeforeTest
	public void post()
	{
		AddProject add=new AddProject("Abhi", "Script", "Created", 4);
		given()
				.body(add)
				.contentType(ContentType.JSON);
		Response res = when().post("http://localhost:8084/addProject");
		String id=res.then().extract().path("projectId");
		
		
			
	}
	@BeforeClass
	public void launch() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("http://localhost:8084/");
		Thread.sleep(2000);
		
		
	}
	
	@BeforeMethod
	public void login() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("rmgyantra");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("rmgy@9999");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
	}

}
