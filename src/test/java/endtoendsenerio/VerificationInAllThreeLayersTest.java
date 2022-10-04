package endtoendsenerio;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.mysql.jdbc.Driver;

import Generics.BaseClass;
import crudusingpojo.AddProject;

public class VerificationInAllThreeLayersTest extends BaseClass{
	@Test
	public void testCase() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[.='Projects']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//table/tbody/tr[last()]/td[1]")).getText();
		
		
		
	}

}
