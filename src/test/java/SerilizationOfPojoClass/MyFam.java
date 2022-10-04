package SerilizationOfPojoClass;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import geneicpojoclasses.Family;
import geneicpojoclasses.Relations;
import geneicpojoclasses.Wife;

public class MyFam {
	@Test
	public void family() throws Throwable, Throwable, Throwable
	{
		Wife w=new Wife("Dont know", "dd/mm/yyyy");
		Object [] rel= {new Relations("Anu", "Sister"), new Relations("Nikki", "Friend")};
		Family f= new Family("Abhishek", "RB", "30-06-1997", w, rel);
		
		// create object of ObjectMapper
		ObjectMapper objm=new ObjectMapper();
		objm.writeValue(new File("./fam.json"), f);
		
	}

}
