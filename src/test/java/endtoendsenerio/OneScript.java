package endtoendsenerio;

import static io.restassured.RestAssured.given;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.mysql.jdbc.Driver;

import crudusingpojo.AddProject;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.restassured.http.ContentType;


public class OneScript {
	WebDriver driver;
	@Test
	public void oneTest() throws InterruptedException, SQLException
	{
		AddProject a=new AddProject("Abi","test54425", "Created", 3);
		String id=given().body(a).contentType(ContentType.JSON)
		.when().post("http://localhost:8084/addProject").then().extract().path("projectId");
		System.out.println(id);
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8084/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("rmgyantra");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("rmgy@9999");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[.='Projects']")).click();
		//Thread.sleep(2000);
		String guiId = driver.findElement(By.xpath("//table/tbody/tr[last()]/td[1]")).getText();
		if(id.equalsIgnoreCase(guiId))
		{
			System.out.println("GUI Layer Verified");
		}
		else
		{
			System.out.println("Not verified");
		}
		
		driver.close();
		
		Driver d=new Driver();
		DriverManager.registerDriver(d);
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/projects","root","root");
		
		Statement stmt = conn.createStatement();
		String query="Select * from project where project_id='"+id+"';";
		ResultSet v = stmt.executeQuery(query);
		while(v.next())
		{
			String DbId = v.getString(1);
			if(DbId.equalsIgnoreCase(id))
			{
				System.out.println("Database validation Successful");
			}
			else {
				System.out.println("DB unsuccessful");
			}
			
		}
		
		
		
	}

}
