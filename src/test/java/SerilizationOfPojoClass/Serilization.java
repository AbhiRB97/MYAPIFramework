package SerilizationOfPojoClass;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import geneicpojoclasses.EmployeeData;

public class Serilization {
	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		EmployeeData e=new EmployeeData("Ab", "1234", "@gmail", "Banglore");
		ObjectMapper o=new ObjectMapper();
		 o.writeValue(new File("./EmpData"), e);
		
	}

}
