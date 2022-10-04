package SerilizationOfPojoClass;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import geneicpojoclasses.EmployeeDataWithObject;
import geneicpojoclasses.Spouse;

public class SerilizationOfObjectArray {
	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		Spouse s=new Spouse("Wife", "@wife", "gadag");
		String [] arr= {"a.a@gmail.com", "a.a@yahoo.com"};
		EmployeeDataWithObject em=new EmployeeDataWithObject("Abhi", "bca",arr, "banglore",s);
		
		ObjectMapper o=new ObjectMapper();
		o.writeValue(new File("./objArray.json"), em);
		
	}

}
